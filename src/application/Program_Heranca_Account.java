package application;

import java.io.ObjectInputStream.GetField;

import entities.Heranca_Account;
import entities.Heranca_BusinessAccount;
import entities.Heranca_SavingsAccount;

public class Program_Heranca_Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// exemplo
		Heranca_BusinessAccount account = new Heranca_BusinessAccount();
		
		account.getBalance(); // Exemplo que a Heranca esta funcionando.
		account.getHolder();
		
		// Abaixo exemplo de  UPCASTING E DOWNCASTING
		
		Heranca_Account acc = new Heranca_Account(1001, "Alex", 0.0);
		Heranca_BusinessAccount bacc = new Heranca_BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Heranca_Account acc1 = bacc;
		Heranca_Account acc2 = new Heranca_BusinessAccount(1003, "Bob", 0.0, 200.0);
		Heranca_Account acc3 = new Heranca_SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		Heranca_BusinessAccount acc4 = (Heranca_BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof Heranca_BusinessAccount) {
			Heranca_BusinessAccount acc5 = (Heranca_BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof Heranca_SavingsAccount) {
			Heranca_SavingsAccount acc5 = (Heranca_SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		Heranca_Account acc9 = new Heranca_Account(1001, "Rodrigo", 1000.0);		
		acc9.withdraw(200.00);
		System.out.println(acc9.getBalance());
		
		//@Overrid
		Heranca_Account acc10 = new Heranca_SavingsAccount(1002, "Maria", 1000.0, 0.01);	
		acc10.withdraw(200.00);
		System.out.println(acc10.getBalance());
		
		//@Overrid utilizando o super
		Heranca_Account acc11 = new Heranca_BusinessAccount(1003, "Bob", 1000.0, 500.0);	
		acc11.withdraw(200.00);
		System.out.println(acc11.getBalance());
	}
}
