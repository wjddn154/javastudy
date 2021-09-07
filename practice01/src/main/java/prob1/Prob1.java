package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		/* 코드 작성 */
		char temp;
		boolean check = true;
		
		System.out.print("숫자를 입력하시오 : ");

//		int number = scanner.nextInt();
		String input = scanner.nextLine();
		
		
		//문자열이 전부 숫자형인지 구분
		for(int i=0; i<input.length(); i++) {
			temp = input.charAt(i);
			
			if(!('0' <= temp && temp <= '9')) {	//모든 문자가 0~9이 아닐 경우
				check = false;
			} 
		}

		if(check==false) {
			System.out.println("숫자가 아닙니다!");
		} else {
			//String to int
			int number = Integer.parseInt(input);
			if(number%3 == 0) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("3의 배수가 아닙니다.");
			}
		}
		
		scanner.close();
	}
}
