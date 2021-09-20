package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ChatClientReceiveThread extends Thread {
	private Socket socket;
	private BufferedReader bufferedReader;

	public ChatClientReceiveThread(Socket socket, BufferedReader br) {
		this.socket = socket;
		this.bufferedReader = br;
	}

	@Override
	public void run() {

		try {
			/* reader를 통해 읽은 데이터 콘솔에 출력하기 (message 처리) */
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
//			printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
	
			while(true) {
				if(socket.isClosed() == false) {
//					Strteming data = bufferedReader.readLine();
//					Sys.out.println(data);
					System.out.println(bufferedReader.readLine());
				}
			}
		

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
		}
	
	    
		
	}
	
}
