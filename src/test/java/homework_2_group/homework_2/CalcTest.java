package homework_2_group.homework_2;
import static org.junit.Assert.*;
import org.junit.Test;

import homework_2_group.homework_2.Calc;


public class CalcTest {

	@Test
	public void intTest() {
		assertEquals(Calc.divide(4,2), 2);
	}
	@Test
	public void notFloatTest() {
		assertNotEquals(Calc.divide(4, 2), 2.0);
	}
	@Test(expected = Exception.class)
	public void divideByZeroTest() {
		Calc.divide(1, 0);
	}
	@Test
	public void roundDownTest() {
		assertEquals(Calc.divide(5, 2), 2);
	}
}
