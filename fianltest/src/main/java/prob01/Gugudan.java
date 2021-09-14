package prob01;

import java.util.Objects;
import java.util.Scanner;

public class Gugudan {

	static int resultNumber = 0;
	
	public static void main(String[] args) {
		int l = randomize(1, 9);
		int r = randomize(1, 9);

		resultNumber = l * r;

		int[] answerNumbers = randomizeAnswers();
		
		int val = 0;
		int check = 0;
		for(int i=0; i<answerNumbers.length; i++) {
			while(true) {
				//랜덤 값
				val = randomize(1, 9) * randomize(1, 9);
				check = 0;
				//무결성 검사
				for(int j=0; j<answerNumbers.length; j++) {
					if((val != answerNumbers[j]) && (val != resultNumber)) {
						check++;
					}
				}
				//val값이 다른값들과 모두 다를때 while break
				if(check == answerNumbers.length) {	break;}
			}
			answerNumbers[i] = val;
		}
		
		
		int loc = randomize(0, 8);
		answerNumbers[loc] = resultNumber;

		System.out.println(l + " x " + r + " = ?");

		int length = answerNumbers.length;
		for (int i = 0; i < length; i++) {
			if (i % 3 == 0) {
				System.out.print("\n");
			} else {
				System.out.print("\t");
			}

			System.out.print(answerNumbers[i]);
		}

		System.out.print("\n\n");
		System.out.print("answer:");

		Scanner s = new Scanner(System.in);
		int answer = s.nextInt();
		s.close();

		System.out.println((answer == resultNumber) ? "정답" : "오답");
		
	}
	
	

	private static int randomize(int lNum, int rNum) {
		int random = (int) (Math.random() * rNum) + lNum;
		return random;
	}

	private static int[] randomizeAnswers() {
		/* 코드 작성(수정 가능) */
		final int COUNT_ANSWER_NUMBER = 9;
		int[] boardNumbers = new int[COUNT_ANSWER_NUMBER];
		return boardNumbers;
	}
}
