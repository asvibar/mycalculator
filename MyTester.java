import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	@Test
	public void testNfactorial() {
		MyCalculator mcr = new MyCalculator();
		int actual = mcr.nfactorial(0);
		assertEquals("0!=1",actual,1,0.0);
	}

        @Test
	public void testNfactorial1() {
		MyCalculator mcr = new MyCalculator();
		int actual = mcr.nfactorial(0);
		assertEquals("-1!=-1",actual,-1,0.0);
	}
        @Test
	public void testNfactorial2() {
		MyCalculator mcr = new MyCalculator();
		int actual = mcr.nfactorial(0);
		assertEquals("2!=2",actual,2,0.0);
	}
        @Test
	public void testNfactorial3() {
		MyCalculator mcr = new MyCalculator();
		int actual = mcr.nfactorial(0);
		assertEquals("1!=1",actual,1,0.0);
	}
        @Test
	public void testNfactorial4() {
		MyCalculator mcr = new MyCalculator();
		int actual = mcr.nfactorial(0);
		assertEquals("3!=6",actual,6,0.0);
	}
	@Test
	public void testBinarySearch() {
		MyCalculator mcr = new MyCalculator();
                int[] g = new int[5];
                g = {1,2,3,5};
                int k = mcr.binarySearch(g,4);
                assertEquals("4 => -1",k,-1,0.0);
	}
	@Test
	public void testBinarySearch2() {
		MyCalculator mcr = new MyCalculator();
                int[] g = new int[5];
                g = {1,2,3,7};
                int k = mcr.binarySearch(g,2);
                assertEquals("7 => 1",k,1,0.0);
	}
	@Test
	public void testBinarySearch() {
		MyCalculator mcr = new MyCalculator();
                int[] g = new int[5];
                g = {};
                int k = mcr.binarySearch(g,1);
                assertEquals("1 => -1",k,-1,0.0);
	}

}
