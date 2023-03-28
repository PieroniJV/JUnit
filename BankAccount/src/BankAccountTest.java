import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void testGetBalance() {
		BankAccount obj = new BankAccount(100.0, 123, 2);
		
		double expected = 100.0;
		double result = obj.getBalance();
		
		assertEquals(expected, result, 0.0);
		
	}
	
	@Test
	public void testMakeLodgement() {
		BankAccount obj = new BankAccount(100.0, 123, 2);
		
		obj.makeLodgement(50.0f);
		
		double expected = 150.0;
		double result = obj.getBalance();
		
		assertEquals(expected, result, 0.0);
		
	}

	@Test
	public void testMakeWithdrawal() {
		BankAccount obj = new BankAccount(100.0, 123, 2);
		
		obj.makeWithdrawal(60.0f);
		
		double expected = 40.0;
		double result = obj.getBalance();
		
		assertEquals(expected, result, 0.0);
	}

	@Test
	public void testAddInterest() {
		BankAccount obj = new BankAccount(100.0, 123, 2);
		
		obj.addInterest();
		
		double expected = 300.0;
		double result = obj.getBalance();
		
		assertEquals(expected, result, 0.0);
		
	}

}
