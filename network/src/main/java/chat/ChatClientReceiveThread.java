package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class ChatClientReceiveThread extends Thread {
	private Socket socket;
	private BufferedReader bufferedReader;

	public ChatClientReceiveThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {

		try {
			/* reader를 통해 읽은 데이터 콘솔에 출력하기 (message 처리) */
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
			
			while(true) {
				String data = bufferedReader.readLine();
				if (data == null || data.equals("quit")) {
					break;
				}
					System.out.println(data);
			}

		} catch (SocketException e) {
			System.out.println("서버에서 퇴장하였습니다.");
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
