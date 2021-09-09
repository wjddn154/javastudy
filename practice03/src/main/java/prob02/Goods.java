package prob02;

public class Goods {
		private String name;
		private int price;
		private int qty;
		
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
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}

		public void print() {
			System.out.println(name + "(가격:" + price + "원)이 " + qty +"개 입고 되었습니다.");
		}
}
