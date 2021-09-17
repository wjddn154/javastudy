package chat;

import java.io.BufferedReader;
import java.io.PrintWriter;

public class ChatClientReceiveThread extends Thread {
	private BufferedReader bufferedReader;
	private PrintWriter printWriter;
	
	public ChatClientReceiveThread(BufferedReader br, PrintWriter pw ) {
		this.bufferedReader = br;
		this.printWriter = pw;
	}
	
	@Override
	public void run() {

		/* reader를 통해 읽은 데이터 콘솔에 출력하기 (message 처리) */
		
		
	}
	
}
