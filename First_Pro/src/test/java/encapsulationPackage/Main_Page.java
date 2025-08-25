package encapsulationPackage;

import java.awt.GraphicsDevice.WindowTranslucency;
import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_Page{
	
	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		dr.switchTo().newWindow(WindowType.TAB);
        dr.get("https://testautomationpractice.blogspot.com/");
        System.out.println(dr.getTitle());
		PagesClasses pc=new PagesClasses(dr);
		pc.getUserName().sendKeys("Manoj");
		pc.getEmail().sendKeys("Manoj@selenium.com");
		pc.getPhone().sendKeys("9311245555");
	}

}
