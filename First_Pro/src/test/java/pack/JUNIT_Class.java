package pack;

import org.junit.After;
import org.junit.Test;

import io.cucumber.java.Before;

public class JUNIT_Class {
	
	@Before
	public void beforeTest() {
		System.out.println(" ******* ****** beforeTest ******* ******  ");
	}
	
	@After
	public void afterTest() {
		System.out.println(" ******* ****** afterTest ******* ******  ");
	}
	
	@Test
	public void test1() {
		System.out.println(" ******* ****** Test 1******* ******  ");
	}
	
	@Test
	public void test2() {
		System.out.println(" ******* ****** Test 2 ******* ******  ");
	}

}
