package model.exceptions;

public class DomainExceptionAccount extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainExceptionAccount(String msg) {
		super(msg);
	}
}
