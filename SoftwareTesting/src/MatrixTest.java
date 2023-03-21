import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixTest {


	@Test
	public void testAdd() {
		Matrix m1 = new Matrix(1);
		Matrix m2 = new Matrix(3);
		Matrix result = m1.Add(m2);
		
		Matrix expected = new Matrix(4);
		
		assertEquals(result, expected);		
	}
	
	@Test
	public void testSubtract() {
		Matrix m1 = new Matrix(3);
		Matrix m2 = new Matrix(1);
		Matrix result = m1.Subtract(m2);
		
		Matrix expected = new Matrix(2);
		
		assertEquals(result, expected);	
	}
	
	@Test
	public void testEqualsObject() {
		Matrix m1 = new Matrix(1);
		Matrix m2 = new Matrix(1);
		assertEquals(m1, m2);
		//m1.equals(m2);
	}

}
