package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods = new Goods();
		goods.setName("Nikon");
		goods.setPrice(2000);
		goods.setCountStock(10);
		goods.setCountSold(20);
		goods.showInfo();
		
		
		goods.setPrice(-1);
		int discountPrice = goods.calcDiscountPrice(50);
		System.out.println("discountPrice : " + discountPrice);
		
		System.out.println(Goods.countOfGoods);
		
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();

		System.out.println(Goods.countOfGoods);

		
	}

}
