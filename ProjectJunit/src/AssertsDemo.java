import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AssertsDemo {
	@Test
	public void simplee() {
		int A =1;
		int B =1;
		assertEquals(A,B);
		
	}
	
	public void simple1() {
		int A=1;
		int B =2;
		assertEquals(A,B);
		
	}
	//@Disabled
	//@Test
	public void simple2() {
		int A =1;
		int B = 3;
		assertEquals(A,B);
	}

}
