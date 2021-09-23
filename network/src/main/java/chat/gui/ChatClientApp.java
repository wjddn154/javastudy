package chat.gui;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ChatClientApp {
	private static final String SERVER_IP = "192.168.56.1";
	private static final int SERVER_PORT = 8080;
	
	public static void main(String[] args) {
		String name = null;
		Scanner scanner = new Scanner(System.in);

		while( true ) {
			System.out.println("대화명을 입력하세요.");
			System.out.print(">> ");
			name = scanner.nextLine();
			
			if (name.isEmpty() == false ) {
				break;
			}
			System.out.println("대화명은 한글자 이상 입력해야 합니다.\n");
		}
		
		scanner.close();
		
		try {
			//1. create socket
			Socket socket = new Socket();
			
			//2. connect to server
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
			
			//3. get iostream
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"), true);

			//4. join
			System.out.print("닉네임>> " );
		    String nickname = scanner.nextLine();
		    pw.println( "JOIN:" + nickname );
		    pw.flush();	
			
	        String line = br.readLine();
//		    String line = "JOIN:OK";
		    if("JOIN:OK".equals(line)) {
		    	new ChatWindow(name).show();
		    }
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
		
	}

}