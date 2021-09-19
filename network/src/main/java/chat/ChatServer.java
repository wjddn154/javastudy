package chat;

import java.io.IOException;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

////채팅 프로그램 과정
//1 >> 키보드 연결 scanner (입력을 받음)
//       System.out.print(">>");
//2 >> s = new socket(); 소켓 생성
//3 >> s.connect();
//4 >> pw.println("JOIN " +  nickname);
//5 >> br.readLine()
//6 >> new ChatClientThread(socket).start();
//7 >> whilte(true) {
//	scanner.nextLine();
//} 
// C:\douzone2021\eclipse-workspace\javastudy\network\target\classes

////요구사항
//1. 키보드로 입력이 가능
//2. 입력 중에 메시지를 수신 할 수 있다.
//3. 즉, 키보드 입력을 받는 작업은 main thread에서
//   데이터 수신과 프로토콜 처리 작업은 데이터 수신 Thread에서 처리하도록 작성한다



import java.util.List;
import java.util.Scanner;

public class ChatServer {
//	private static final String SERVER_IP = "127.0.0.1";
	private static final int PORT = 8080;
	
	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		List<Writer> listWriters = null;
		Scanner scanner = null;
		Socket socket = null;
		
		
		try {
			//1. 서버 소켓 생성
			serverSocket = new ServerSocket();

			//2. 바인딩
			String hostAddress = InetAddress.getLocalHost().getHostAddress();
			serverSocket.bind(new InetSocketAddress(hostAddress, PORT));
			log("연결 기다림 " + hostAddress + ":" + PORT);
		    
			//3. 요청 대기
			while(true) {
				socket = serverSocket.accept();
				new ChatServerTread(socket, listWriters).start();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serverSocket != null && serverSocket.isClosed() == false) {
					serverSocket.close();
				}
				
				if(socket != null && socket.isClosed() == false) {
					socket.close();
				}
				
			     //10) 자원정리
				 if(scanner != null) {
					scanner.close(); 
				 }
				 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void log(String log) {
		 System.out.println("[ChatServer] " + log);		
	}

}
