package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();
		int length = text.length();
		for(int i=1; i<=length; i++) {
			System.out.print(text.substring(0, i));
			System.out.println();
			
		}
		
		scanner.close();
	}

}
