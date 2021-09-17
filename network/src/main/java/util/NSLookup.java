package util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NSLookup {

	public static void main(String[] args) {
		String line = "www.douzone.com";
		
//		System.out.print("url을 검색하여 주세요 : ");
//		Scanner scan = new Scanner(System.in);
//		String url = scan.nextLine();
		
		try {
			InetAddress[] inetAddresses = InetAddress.getAllByName(line);
			
			System.out.println(inetAddresses[0]);
			
//			System.out.println(InetAddress.getAllByName(line)[0]);
//			System.out.println("서버 : ");
//			System.out.println("Address : ");
//			System.out.println();
//			System.out.println("이름 : ");
//			System.out.println("Address : ");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}	//이름으로 IP를 모두 가져오겠다
		
//		if(scan != null) {
//			scan.close();
//		}

	}

}
