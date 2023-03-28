import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testCalculateWeeklyPay() {
		Employee emp = new Employee(1, 11.5f, 40);
		
		float expected = 460f;
		float result = emp.calculateWeeklyPay();
		
		assertEquals(expected, result, 0.0f);
		
	}

	@Test
	public void testUpdateHourlyRate() {
		Employee emp = new Employee(1, 11.5f, 40);
		
		emp.updateHourlyRate(12.0f);
		
		float expected = 12.0f;
		float result = emp.getHourlyRate();
		
		assertEquals(expected, result, 0.0f);
	}

	@Test
	public void testGetHourlyRate() {
		Employee emp = new Employee(1, 11.5f, 40);
		
		float expected = 11.5f;
		float result = emp.getHourlyRate();
		
		assertEquals(expected, result, 0.0f);
	}

	@Test
	public void testUpdateHoursWorked() {
		Employee emp = new Employee(1, 11.5f, 40);
		
		emp.updateHoursWorked(35);
		
		float expected = 402.5f;
		float result = emp.calculateWeeklyPay();
		
		assertEquals(expected, result, 0.0f);
	}

}
