package javaPro;

import java.sql.Time;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumInterView {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		String str="manoj kushwaha";
		String [] s=str.split(" ");
		WebDriverWait wait=new WebDriverWait(dr,Duration.ofSeconds(10));
		Properties pr=new Properties();

		String parentId = dr.getWindowHandle();
		Set<String> windows = dr.getWindowHandles();
		for (String w : windows) {
           System.out.println(w);
           if(!parentId.equalsIgnoreCase(w)) {
        	   dr.switchTo().window(w);
        	   dr.close();        	  
           }
           dr.switchTo().window(parentId);
		}
		
		boolean getValue=dr.findElement(By.xpath("abc")).isEnabled();
		if(getValue==false) {
			
		}
		
	}
	
	
	
}
