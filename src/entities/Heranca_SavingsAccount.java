package entities;

public class Heranca_SavingsAccount extends Heranca_Account {
	
private Double interestRate;
	
	public Heranca_SavingsAccount() {
		super();
	}

	public Heranca_SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw (double amount) {
		balance -= amount;
	}
	

}
