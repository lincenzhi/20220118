package luck.today;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCal {

	@Test
	public void testAdd() {
		int result = 12;
		Cal cal = new Cal();
		assertEquals(result, cal.Add(8, 4));
	}

	@Test
	public void testSub() {
		int result = 4;
		Cal cal = new Cal();
		assertEquals(result, cal.Sub(8, 4));
	}
	
	@Test
	public void testMul() {
		int result = 32;
		Cal cal = new Cal();
		assertEquals(result, cal.Mul(8, 4));
	}
	
	@Test
	public void testDiv() {
		int result = 2;
		Cal cal = new Cal();
		assertEquals(result, cal.Div(8, 4));
	}

}
