package pbankaccount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void testGetBalance() {
		BankAccount acc = new BankAccount();
		//balance should be zero
		assertEquals(0,acc.getBalance(),0.001);
	}

	@Test
	void testDeposit() {
		BankAccount acc = new BankAccount();
		// Testing deposit method 100$
		acc.deposit(100);
		assertEquals(100, acc.getBalance(),0.001);
	}

	@Test
	void testWithdraw() {
		BankAccount acc = new BankAccount();
		acc.deposit(100);
		acc.withdraw(50);
		assertEquals(50,acc.getBalance(),0.001);
	}
	@Test
	void testWithdrawWithPenalty() {
		BankAccount acc = new BankAccount();
		acc.deposit(100);
		acc.withdraw(150);
		assertEquals(-55,acc.getBalance(),0.001);
	}
	@Test
	void testInterestAccount()
	{
		BankAccount acc = new BankAccount();
		acc.deposit(1000);
		acc.addInterest();
		assertEquals(1033.50, acc.getBalance(), 0.001);
	}

}
