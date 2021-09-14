package prob03;

public class MoneyTest {

	//건들면 안됨
	public static void main(String[] args) {
		Money five = new Money(5);
		Money two = new Money(2);
		Money three = new Money(3);
		Money ten = new Money(10);
//		two.add(three);
		System.out.println(five.equals(two.add(three)));
		System.out.println(three.equals(five.minus(two)));
//		System.out.println(ten.equals(five.multiply(two)));
//		System.out.println(two.equals(ten.devide(five)));
		if (five.equals(two.add(three))
				&& three.equals(five.minus(two))
				&& ten.equals(five.multiply(two))
				&& two.equals(ten.devide(five))) {
			System.out.println("Money Class 구현을 완료 하였습니다.");
		}
	}
}
