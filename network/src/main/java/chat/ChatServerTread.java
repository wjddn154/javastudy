package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ChatServerTread extends Thread {
	private String nickname;
	private Socket socket;
	List<Writer> listWriters = new ArrayList<Writer>();
	
	
	public ChatServerTread(Socket socket, List<Writer> listwriWriters) {
		this.socket = socket; 
		this.listWriters = listwriWriters;
	}
	
	
	
	@Override
	public void run() {
		//1. Remote Host Information
		InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
		String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();
		int remoteHostPort = inetRemoteSocketAddress.getPort();
		log("클라이언트로부터 연결되었습니다." + "[" + remoteHostAddress + ":" + remoteHostPort + "]");
		
			try {
				//연결 확인
//				System.out.println("서버 : " + socket.getInetAddress() + " IP의 클라이언트와 연결되었습니다.");
				
				//2. 스트림 얻기
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
				PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
			
				//3. 요청 처리
				while(true) {
					String request = bufferedReader.readLine();
					System.out.println("request : " + request);
					if(request == null) {
						log("클라이언트로 부터 연결 끊김");
						//클라이언트가 "quit"를 보내지않고 소켓을 닫은 경우
						doQuit(printWriter);
						break;
					}
					
					//4. 프로토콜 분석
					String[] tokens = request.split(":");
					
					if("join".equals(tokens[0])) {
						doJoin( tokens[1], printWriter);
					} else if("message".equals(tokens[0])) {
						doMessage(tokens[1]);
					} else if("quit".equals(tokens[0])) {
						doQuit(printWriter);
					} else {
						log("에러 : 알 수 없는 요청(" + tokens[0] + ")");
					}
					
				}
				
			} catch(IOException e) {
				log("error:" + e);
			}
		
		}
	
	private void doJoin(String nickName, Writer writer) {
		this.nickname = nickName;
		
		String data = nickName + "님이 참여하였습니다.";
		
		/* wrtier pool에 저장 */
		addWriter(writer);
		
		broadcast(data);

		//ack (대답)
		PrintWriter printWriter = (PrintWriter) writer;
		printWriter.println("join:ok");
		printWriter.flush();
		
		
	}
	
	
	//현재 Thread의 writer(printWriter)를 저장
	private void addWriter(Writer writer) {
		System.out.println(writer);
		//synchronized 키워드는 여러 thread가 하나의 공유 객체에 접근할 때, 동기화를 보장해준다
		synchronized (listWriters) {
			listWriters.add(writer);	
		}
	}
	
	
	//서버에 연결된 모든 클라이언트에 메세지를 보내는(브로드캐스트) 메소드
	private void broadcast(String data) {
		
		synchronized (listWriters) {
			for(Writer writer : listWriters) {
				PrintWriter printWriter = (PrintWriter) writer;
				printWriter.println(data);
				printWriter.flush();
			}
		}
	}

	private void doMessage(String message) {
		//직접 코딩
		System.out.println(message);
		broadcast(message);

	}
	
	private void doQuit(Writer writer) {
		removeWriter(writer);

		String data = nickname + "님이 퇴장하였습니다.";
		broadcast(data);
	}
		
		
	private void removeWriter(Writer writer) {
		
		//직접 코딩
		//현재 thread의 writer를 Writer Pool에서 제거하는 과정
		synchronized (listWriters) {
			listWriters.remove(writer);	
		}
		
	}
		
	private void log(String log) {
		System.out.println("[ChatServerThread] " + log);		
		
	}
	
}
