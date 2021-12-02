import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class sampleTest {
	@Test
	public void simpleTestPass() {
		int a = 1;
		int b = 2;
		assertTrue(a + b == 3);
	}

	@Test
	public void simpleTestPass2() {
		int a = 100;
		int b = 20;
		assertTrue(a + b == 120);
	}
/*	@Test
	public void simpleTestFail() {
		int a = 1;
		int b = 2;
		assertTrue(a + b == 120);
	}
*/
}
