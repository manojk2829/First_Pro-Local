package selenium;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Handle_Table extends ReadingPropertyFile {
	
	@Test
	public void test_Vovel_count() {
		String s="manoj kushwaha selenium";
		int c=0;
		for(Character ch:s.toCharArray()) {
			if(ch.equals('a')||ch.equals('e')||ch.equals('i')||ch.equals('o')||ch.equals('u')) {
				c++;
			}
		}
		System.out.println(c);
		System.out.println();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		hm.put('a', 0);
		hm.put('e', 0);
		hm.put('i', 0);
		hm.put('o', 0);
		hm.put('u', 0);
		for(Character ch:s.toCharArray()) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
		}for(char v:hm.keySet()) {
			System.out.println(v+" "+hm.get(v));
		}	
	}
	
	@Test
	   public void count_Char_count() {
		   String s="manoj kushwaha";
		   HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		   
		   for(Character ch:s.toCharArray()) {
			   if(hm.containsKey(ch)) {
				   hm.put(ch, hm.get(ch)+1);				   
			   }else {
				   hm.put(ch,1);
			   }
		   }
		   System.out.println(hm);
	   }
	
   @Test
   public void test() {
	   String s="manoj kushwaha";
	   HashMap<Character, Boolean> hm=new HashMap<Character, Boolean>();
	   StringBuffer result=new StringBuffer();
	   for(Character ch:s.toCharArray()) {
		   if(!hm.containsKey(ch)) {
			   hm.put(ch, true);
			   result.append(ch);
		   }
	   }
	   System.out.println(result);
   }
   
   @Test
   public void remove_Duplicate_Word() {
	   String s="manoj kushwaha manoj";
	   String[] words=s.split(" ");
	   HashMap<String, Boolean> hm=new HashMap<String, Boolean>();
	   StringBuffer result=new StringBuffer();
	   for(String word:words) {
		   if(!hm.containsKey(word)) {
			   hm.put(word, true);
			   result.append(word).append(" ");
		   }
	   }
	   System.out.println(result);
   }
   
	
	//@Test
	public void test_table() {
		WebDriver dr=new ChromeDriver();
		dr.get(readPropertiesFile_Value_by_Key("url"));
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Table location.
		WebElement tableElement=dr.findElement(By.id("id"));
		//All Rows
		List<WebElement> rows=tableElement.findElements(By.tagName("tr"));
		for(WebElement row:rows) {
		       List<WebElement> cel_ele=row.findElements(By.tagName("td"));
		       for(WebElement cel:cel_ele) {
		    	    cel.getText();
		       }
		}
		
		WebDriverWait wait=new WebDriverWait(dr, Duration.ofSeconds(10));
		WebElement el=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'')]")));
		el.getText();
		
		String locator="(//div[text()='Login']/following-sibling::img)[1]";
	}
	
	//@Test
	public void create_xpath() {
		// Absolute xpath
		//input[contains(@id,'')]
		//div[contains(@class,'')]
		//button[starts-with(@id,'')]
		//button[starts-with(@class,'')]
		//input[@class='']
		//input[@id='']
		//a[contains(text(),'login')]
		
	}

}
