package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		String name = null;
		int price = 0;
		int qty = 0;
		
		//for문에 scanner.nextline() 사용해서 풀 것.
		for(int i=0; i<COUNT_GOODS; i++) {
			name = scanner.next();	//next()사용시 공백기준으로 한문장씩 입력받는다
			price = scanner.nextInt();
			qty = scanner.nextInt();
			
			goods[i] = new Goods();
			
			goods[i].setName(name);
			goods[i].setPrice(price);
			goods[i].setQty(qty);
			
		}
		
		
		// 상품 출
		for(int i=0; i<COUNT_GOODS; i++) {
			goods[i].print();
		}
		
		// 자원정리
		scanner.close();
	}
	
	
	
	
	
	
}
