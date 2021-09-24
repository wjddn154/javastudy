package chat;

import java.io.PrintWriter;
import java.net.Socket;

public class User {
	private Socket socket;
	private String userName;
	private PrintWriter pw;
	
	
	//생성자
	public User(String userName) {
		this.userName = userName;
	}

	
	

	public Socket getSocket() {
		return socket;
	}


	public void setSocket(Socket socket) {
		this.socket = socket;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public PrintWriter getPw() {
		return pw;
	}


	public void setPw(PrintWriter pw) {
		this.pw = pw;
	}
	
	
	
}
