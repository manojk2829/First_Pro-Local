package pack;

import org.testng.annotations.Test;

public class If_Else_method {
	
	@Test
	public void userValidateText() {
		validateText("Manoj", "Manoj");
		validateText_with_equal_IgnoreCase("Manoj", "manoj");
		validateText_by_contains_method("manoj", "man");
	}
	
	public void validateText(String actual,String expected) {
		String actual_text=actual;
		String expected_text=expected;
		if(actual_text.equals(expected_text)) {
			System.out.println("Actual Value >> '" + actual_text + "' matched with expected value. >> " + expected_text);
		}else {
			System.out.println("Actual Value >> '" + actual_text + "' is not getting matched with expected value. >> " + expected_text);
		}
	}
	
	public void validateText_with_equal_IgnoreCase(String actual,String expected) {
		String actual_text=actual;
		String expected_text=expected;
		if(actual_text.equalsIgnoreCase(expected_text)) {
			System.out.println("Actual Value >> '" + actual_text + "' matched with expected value. >> " + expected_text);
		}else {
			System.out.println("Actual Value >> '" + actual_text + "' is not getting matched with expected value. >> " + expected_text);
		}
	}
	
	public void validateText_by_contains_method(String actual,String expected) {
		String actual_text=actual;
		String expected_text=expected;
		if(actual_text.contains(expected_text)) {
			System.out.println("Actual Value >> '" + actual_text + "' matched with expected value. >> " + expected_text);
		}else {
			System.out.println("Actual Value >> '" + actual_text + "' is not getting matched with expected value. >> " + expected_text);
		}
	}

}
