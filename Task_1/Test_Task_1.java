package Task_1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class Test_Task_1 {
	
	@Test
	public void testT_178_d() {
		Param a1 = new Param(5,0);
		int expected = 0;
		int actual = a1.Task_178_d();
		Assert.assertEquals(expected, actual, 0.001);
	}

	@Test
	public void testT_178_g() {
		Param a1 = new Param(5,0);
		int expected = 2;
		int actual = a1.Task_178_g();
		Assert.assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testT_555() {
		Param2 a1 = new Param2(5, 4);
		int expected = (int) Math.pow(2, a1.getQ()-1);
		int actual = a1.Piramida();
		Assert.assertEquals(expected, actual, 0.001);
	}
	
	

}
