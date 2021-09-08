package chapter03;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	private static int TOTALCOUNT = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public void showInfo() {
		System.out.println("name : " + name);
		System.out.println("price : " + this.price);
		System.out.println("countStock : " + this.countStock);
		System.out.println("countSold : " + this.countSold);
	}

}
