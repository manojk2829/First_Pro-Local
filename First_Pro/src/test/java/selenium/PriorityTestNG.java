package selenium;

import org.testng.annotations.Test;

public class PriorityTestNG {
	
	@Test
	public void a() {
		System.out.println("2 test > no prioerties ");
	}
	
	@Test(priority = -1)
	public void test() {
		System.out.println("1 test > prioerti -1");
	}
	
	@Test(priority = 0)
	public void b() {
		System.out.println("3 test > prioerti 0");
	}
	
	@Test(priority = 1)
	public void atest() {
		System.out.println("4 test 1 > prioerti 1");
	}
	
}
