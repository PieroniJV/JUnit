import static org.junit.Assert.*;

import org.junit.Test;

public class OddNumberTest {

	@Test
	public void testValidateTrue() {
		OddNumberCheck obj = new OddNumberCheck();
		
		Boolean expected = obj.validate(3);
		Boolean result = true;
		
		assertEquals(expected, result);
		
	}
	@Test
	public void testValidateFalse() {
		OddNumberCheck obj = new OddNumberCheck();
		
		Boolean expected = obj.validate(10);
		Boolean result = false;
		
		assertEquals(expected, result);
		
	}

}
