package pack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void testm() {
		System.out.println("Manoj Kushwaha");
	}
	
	@BeforeTest
	public void Beforetest() {
		System.out.println("This is before Test Method");
	}
	

}
