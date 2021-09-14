package prob03;

import java.util.Objects;

public class Money {
	private int amount;
	
	/* 코드 작성 */
	public Money(int i) {
		this.amount = i;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(amount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		return amount == other.amount;
	}

	
//	int check = 0;
	public Money add(Money money) {
//		check = amount;
//		System.out.println(" 1 = " + check);
		this.amount += money.amount;
//		System.out.println(" 1 = " + check);
		
		return new Money(amount);
	}
	
	public Money minus(Money money) {
		System.out.println("2 = "  + this.amount);
		System.out.println("2 = "  + money.amount);
		this.amount = amount - money.amount;

		return new Money(amount);
	}
	
	public Money multiply(Money money) {
		this.amount *= money.amount;
		return new Money(amount);
	}
	
	public Money devide(Money money) {
		this.amount /= money.amount;
		System.out.println(amount);

		return new Money(amount);
	}
	
}
