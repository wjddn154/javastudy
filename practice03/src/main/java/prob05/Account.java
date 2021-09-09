package prob05;

public class Account {
	
	private String accountNo;
	private int balance;
	
	//getter / setter 설정
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(String no) {
		this.accountNo = no;
		
		System.out.println(accountNo + " 계좌가 개설되었습니다.");	
	}
	
	
	public String save(int inputMoney) {
		
		balance = balance + inputMoney;
		System.out.println(this.getAccountNo() + " 계좌에 " + inputMoney + "만원이 입금되었습니다.");
		
		return this.getAccountNo() + " 계좌의 잔고는 " + balance + "만원입니다.";
	}
	
	public String deposit(int outputMoney) {
		
		balance = balance - outputMoney;
		System.out.println(this.getAccountNo() + " 계좌에 " + outputMoney + "만원이 출금되었습니다.");

		return this.getAccountNo() + " 계좌의 잔고는 " + balance + "만원입니다.";
		
	}
	
}
