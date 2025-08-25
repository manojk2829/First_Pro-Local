package javaPro;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchOneWindowTo_Other {
	
	
	@Test
	public void testWindow() {
		WebDriver dr=new ChromeDriver();
		String mainWindowId= dr.getWindowHandle();
		Set<String> allWindowIds=dr.getWindowHandles();
		for(String childWinds:allWindowIds) {
			if(!childWinds.equals(mainWindowId)) {
				dr.switchTo().window(childWinds);
				//perform Action 
				break;
			}
		}
		dr.switchTo().window(mainWindowId);
	}

}
