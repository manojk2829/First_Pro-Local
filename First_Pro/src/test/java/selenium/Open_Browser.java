package selenium;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Open_Browser extends ReadingPropertyFile{
	public WebDriver driver;
	public Actions act;

	@Test
	public void openBrowser_Test() {
		
		driver=new ChromeDriver();
		driver.get(readPropertiesFile_Value_by_Key("url"));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    WebElement ele=driver.findElement(By.id("country"));
	    Select select=new Select(ele);
	    List<WebElement> alloptions=select.getOptions();
	    for(WebElement element:alloptions) {
	    	System.out.println(element.getText());
	     }
	    
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get(readPropertiesFile_Value_by_Key("url1"));
	    WebElement el=driver.findElement(By.id(""));
	    
 	
		//click_on_Element("PopUp");
		
		//driver.switchTo().newWindow(WindowType.TAB);
		//driver.navigate().to(readPropertiesFile_Value_by_Key("url1"));

		/*movingOn_Element(driver.findElement(By.id("singleFileInput")));
		ele.sendKeys(System.getProperty("user.dir")+"\\src\\test\\java\\config\\or.properties");
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	    int total_link=allLinks.size();
	    System.out.println(total_link);
	    System.out.println("*********************************************");
	    for(WebElement Element:allLinks) {
	    	System.out.println(Element.getText());
	    }
	    */
   
	    String parentWindowId=driver.getWindowHandle();
	    System.out.println("***************************************");
	    System.out.println(parentWindowId);
	    System.out.println(parentWindowId + " >> This is Parent Window >> "+driver.getTitle());
	    System.out.println("***************************************");

	    Set<String> allWindowsId=driver.getWindowHandles();
	    for(String windowId:allWindowsId) {
	    	System.out.println("(((((((((((((((((((( Child ID ))))))))))))))))))))))))))");
	    	System.out.println(windowId);
	    	System.out.println("*********************************************");
	    	if(!windowId.equalsIgnoreCase(parentWindowId)) {
	    		driver.switchTo().window(windowId);
	    		System.out.println("This is Child Window >> "+driver.getTitle() +" >>>> " + windowId);
	    		wait(5);
	    		driver.close();	    		
	    	}else {	    		
	    		System.out.println("Switching the Parent Window..");
	    		driver.switchTo().window(parentWindowId);
	    		wait(4);
         	}
	    }
	
		
		/*
		WebElement ele=driver.findElement(By.xpath("(//tr[2]//input[@type='checkbox']//following::ul/li[2])[1]")); 
		movingOn_Element(ele);
		ele.click();
		
		//movingOn_Element(driver.findElement(By.id("colors")));
		List<WebElement> allColors=driver.findElements(By.xpath("//select[@id='colors']/option"));
		for(WebElement Color:allColors) {
			System.out.println(Color.getText());
		}
		
		*/

		
		/*
		 * if(not_visible_on_Page_Element("headerTitle")) { p("Header not matched");
		 * }else { p("Header Matched...."); } is_Element_Present("GUI_Element");
		 */
		//movingOn_Element(driver.findElement(By.id("country")));
		//print_all_valueFrom_driveropDown();
		
		/*
		perform_DoubleClick("copyText");
		perform_mouseHover("point_me");
		RightClick("rightClick_UdemyCourses");
		perform_driveragN_driverop("driveraggable","driveroppable");
		wait(10);
		switch_Browser_to_new_Tab(pr.getProperty("url1"));
		*/
	}
	
	public void movingOn_Element(WebElement web) {
		Actions act=new Actions(driver);
		act.moveToElement(web).perform();
	}
	
	public void click_on_Element(String elementLocator) {
		
		WebElement e=driver.findElement(By.id(elementLocator));
		System.out.println("Clicking the Element....");
		e.click();
	}
	
	
	
	public void print_all_valueFrom_driveropDown() {
		WebElement driveropDownLocation=driver.findElement(By.id("country"));
		Select sc=new Select(driveropDownLocation);
		List<WebElement> countryList=sc.getOptions();
		for(WebElement ele:countryList) {
			System.out.println(ele.getText());
			if(ele.getText().equals(readPropertiesFile_Value_by_Key("CountryName"))) {
				ele.click();
				break;
			}else {
				ele.click();
			}
		}
		
	}
	
	public String getTextValue(String text) {
		String getText=getLocator(pr.getProperty(text)).getText();
		System.out.println(getText);
		
		return getText;
	}
	
	public void p(String s) {
		System.out.println(s);
	}
	
	//
	
	public void getKeys_Value_fromProperties(String key) {
		String path=System.getProperty("user.dir")+"\\src\\test\\java\\config\\or.properties";
		Properties pro=new Properties();
		try {
			FileInputStream fis=new FileInputStream(path);
			pro.load(fis);
		}catch(Exception e) {
			e.getMessage();
		} 
	}
	
	public WebElement getLocator(String key) {
		WebElement ele=driver.findElement(By.xpath(key));
		return ele;
	}
	
	public void switch_Browser_to_new_Tab(String url) {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to(url);
		
	}
	
	public void RightClick(String loc) {
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath(pr.getProperty(loc)));
		act.contextClick(ele).perform();
	}
	
	public void is_Element_Present(String  locatorKey) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement visibleElement= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.getProperty(locatorKey))));
		boolean element_status=visibleElement.isDisplayed();
		
		if(element_status) {
			System.out.println("Given element is visible >> " + locatorKey);
		}else {
			System.out.println("Given element is not visible >> " + locatorKey);
		}
	}
	
	
	public WebElement getElement(String  locatorKey) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement visibleElement= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.getProperty(locatorKey))));
		return visibleElement;	
	}
	
	public boolean not_visible_on_Page_Element(String  locatorKey) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		boolean visibleElement= wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pr.getProperty(locatorKey))));
		return visibleElement;	
	}
	

	
	
	public void perform_driveragN_driverop(String  source,String destination) {
		act=new Actions(driver);
		WebElement sourceEle=driver.findElement(By.id(pr.getProperty(source)));
		WebElement destinyEle=driver.findElement(By.id(pr.getProperty(destination)));	
		act.dragAndDrop(sourceEle,destinyEle).perform();
				
	}
	
	public void perform_DoubleClick(String  locatorKey) {
		act=new Actions(driver);
		WebElement copyTextElement=driver.findElement(By.xpath(pr.getProperty(locatorKey)));	
		act.moveToElement(copyTextElement).perform();
		act.doubleClick(copyTextElement).perform();		
	}
	
	public void perform_mouseHover(String  locatorKey) {
		act=new Actions(driver);
		WebElement hover_point_Me=driver.findElement(By.xpath(pr.getProperty(locatorKey)));	
		act.moveToElement(hover_point_Me).perform();
		WebElement e=getElement("laptop");
		if(e.isEnabled())
		e.click();
		System.out.println("Succssfully Clicked......................................");
		
	}
	
	//button[text()='Copy Text']
	
	public void driveropDownValue(String countryName) {
		WebElement driveropDownElement=driver.findElement(By.id("country"));
		Select s =new Select(driveropDownElement);
		s.selectByVisibleText("India");
		wait(5);
		List<WebElement> listOfCountry=driver.findElements(By.xpath("//select[@id='country']/option"));
		for(WebElement Allcountry:listOfCountry) {
			String nameOfCountry=Allcountry.getText();
			if(nameOfCountry.equalsIgnoreCase(countryName)) {
				Allcountry.click();
			}
		}
	}

	//@AfterTest
	public void quitSession() {
		tearDown(15);
	}
	
	public void tearDown(int s) {
		try {
			Thread.sleep(1000*s);
			driver.quit();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void wait(int s) {
		try {
			Thread.sleep(1000*s);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
