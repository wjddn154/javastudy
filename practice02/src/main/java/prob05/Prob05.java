package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.println("수를 결정하였습니다. 맞추어 보세요!");
		
		int lowScore = 1;
		int highScore = 100;
		int action = 1;
				
		while( true ) {
			/* 게임 작성 */

			// 정답 램덤하게 만들기
			Random random = new Random();
			int correctNumber = random.nextInt( 100 ) + 1;
			System.out.println("정답 : " + correctNumber);

			while( true ) {
				System.out.println(lowScore + " ~ " + highScore);
				System.out.print(action + ">>");
				int score = scanner.nextInt();
	
					if(score == correctNumber) {
						System.out.println("맞았습니다");
						break;
					} else if (score > correctNumber) {
						System.out.println("더 낮게");
						if(score < highScore) {
							highScore = score;
						}
					} else {
						System.out.println("더 높게");
						if(score > lowScore) {
							lowScore = score;
						}
					}

				action++;
			}
		
			
			//새 게임 여부 확인하기
			System.out.print( "다시 하겠습니까(y/n)>>" );
			String answer = scanner.next();
			if( "y".equals( answer ) == false ) {
				break;
			} else {
				lowScore = 1;
				highScore = 100;
				action = 1;
			}
		}

		scanner.close();
	}

}