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

	public Money add(Money money) {

		return new Money(this.amount + money.amount);
	}

	public Money minus(Money money) {

		return new Money(this.amount - money.amount);
	}

	public Money multiply(Money money) {

		return new Money(this.amount * money.amount);
	}

	public Money devide(Money money) {

		return new Money(this.amount / money.amount);
	}

//	public Object add(Money money) {
//		if(money instanceof Money) {
//			return new Money(this.amount + money.amount);
//		}
//		
//		return null;
//	}

//	public Object minus(Money money) {
//		if(money instanceof Money) {
//			return new Money(this.amount - money.amount);
//		}
//		
//		return null;
//	}

//	public Object multiply(Money money) {
//		if(money instanceof Money) {
//			return new Money(this.amount * money.amount);
//		}
//		
//		return null;
//	}

//	public Object devide(Money money) {
//		if(money instanceof Money) {
//			return new Money(this.amount / money.amount);
//		}
//		
//		return null;
//	}

}
