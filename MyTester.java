import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	@Test
	public void testNfactorial() {
		MyCalculator mcr = new MyCalculator();
		float actual = mcr.nfactorial(0);
		assertEquals("5!=120",actual,1,0.0);
	}

	@Test
	public void testBinarySearch() {
		//white-box testing
	}

}
