package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		/* 코드 작성 */
		System.out.print("금액 : ");
		
		int number = scanner.nextInt();
		
		for(int i=0; i<MONEYS.length; i++) {

			if(number > MONEYS[i]) {
				System.out.println(MONEYS[i] + "원 : " + number/MONEYS[i] + "개");
				number = number - MONEYS[i]*(number/MONEYS[i]);
			} 
			
		}
		
		
		scanner.close();
 	}
}