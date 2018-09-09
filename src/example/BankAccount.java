package example;

/**
 * 상속 (Inheritance)
 * BankAccount : 은행 계좌 클래스
 *
 */
public class BankAccount {
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 출금
	public boolean withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			return true;
		}
		
		return false;
	}
	
	// 입금
	public boolean deposit(int amount) {
		balance += amount;
		return true;
	}
}
