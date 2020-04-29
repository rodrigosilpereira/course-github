package entities;

public class Heranca_BusinessAccount extends Heranca_Account {

	private Double loanLimit;

	public Heranca_BusinessAccount() {
		super();
	}

	public Heranca_BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount -10.0;
		}

	}
	
	@Override
	public void withdraw (double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}
