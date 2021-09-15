package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalHost {

	public static void main(String[] args) {
		try {
			InetAddress inetAddress= InetAddress.getLocalHost();
			
			String hostName = inetAddress.getHostName();
			String hostAddress = inetAddress.getHostAddress();
			
			System.out.println(hostName);
			System.out.println(hostAddress);
			
			byte[] addresses = inetAddress.getAddress();
			for(byte address : addresses) {
				//System.out.println((int)address);
				//2의 보수 개념 (f = 16진수 1111이므로 &를 통해 그대로 나옴)
				System.out.print(address & 0x000000ff);
				System.out.print('.');
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
