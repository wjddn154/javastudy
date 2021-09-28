package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class ChattingClient {
	private static final String SERVER_IP = "192.168.56.1";
	private static final int SERVER_PORT = 8080;
	
	public static void main(String[] args) {
		Scanner scanner = null;
		Socket socket = null;
		
			try {
				//1) 키보드 연결
				scanner = new Scanner(System.in);
				
				//2) 소켓 생성
				socket = new Socket();

				//3) 소켓 연결
				socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
				
				//4) reader/writer 생성
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
				PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"), true);

				//5) join 프로토콜
				System.out.print("닉네임>> " );
			    String nickname = scanner.nextLine();
			    pw.println( "join:" + nickname );
			    pw.flush();
				
				//6) ChatClientReceiveThread 시작
			    ChatClientReceiveThread chatClientReceiveThread = new ChatClientReceiveThread(socket);
			    chatClientReceiveThread.start();
			    
			    //7) 키보드 입력 처리
			    String input;
			    while( true ) {
			       System.out.print( ">> " );
			       input = scanner.nextLine();
			 				
			       if( "quit".equals( input ) == true ) {
			           // 8) quit 프로토콜 처리
			    	   doQuit(pw);
			           break;
			       } else if ("list".equals(input) == true) {
			    	   doList(pw);
			       } else {
			           // 9) 메시지 처리
			    	   doMessage(pw, input);
			       }
			    }
			} catch (SocketException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if(socket != null && socket.isClosed() == false) {
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				if(scanner != null) {
					scanner.close();
				}
				
			}
	}

	private static void doList(PrintWriter pw) {
		pw.println("list");
	}

	private static void doQuit(PrintWriter pw) {
		pw.println("quit");
	}

	private static void doMessage(PrintWriter pw, String msg) {
		pw.println("message:" + msg);
	}
	
	
	
}
