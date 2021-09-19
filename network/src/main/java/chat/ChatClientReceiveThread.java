package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ChatClientReceiveThread extends Thread {
	private BufferedReader bufferedReader;
	private PrintWriter printWriter;
	private Socket socket;

	public ChatClientReceiveThread(Socket socket, BufferedReader br, PrintWriter pw) {
		this.socket = socket;
		this.bufferedReader = br;
		this.printWriter = pw;
	}

	@Override
	public void run() {

		/* reader를 통해 읽은 데이터 콘솔에 출력하기 (message 처리) */
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
			printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
	
			while(true) {
				String data = bufferedReader.readLine();
				if(data == null) {
					break;
				}
				printWriter.println(data);
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
