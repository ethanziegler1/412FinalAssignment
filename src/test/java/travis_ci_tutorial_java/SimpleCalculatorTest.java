package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testSub(){
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.sub(5, 3), 2);
	}
	@Test
	public void testMult(){
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.mult(2, 3), 6);
	}
//	@Test
//	public void testDiv(){
//		SimpleCalculator calc = new SimpleCalculator();
//		assertEquals(calc.div(2, 2), 1);
//	}
//	@Test
//	public void testDivBy0(){
//		SimpleCalculator calc = new SimpleCalculator();
//		assertEquals(calc.div(5, 0), 0);
//	}
}
