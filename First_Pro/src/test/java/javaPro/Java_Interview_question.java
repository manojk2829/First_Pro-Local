package javaPro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Interview_question {

	public static void main(String[] args) {
		longestWord("manoj kushwaha123 Automation Engineer");
		totalNumber_of_vovel("manoj kushwaha Automation Engineer");
		reverseString("Engineer");
	}
	
	public static void longestWord(String s) {
		s=s.toLowerCase();
		String words[]=s.split(" ");
		String longest="";
		
		for(String word:words) {
			if(word.length()>longest.length()) {
				longest=word;
			}
		}
		System.out.println(longest);
	}
	
	public static void totalNumber_of_vovel(String s) {
		String str=s.toLowerCase();
		int count=0;
		for(Character c:str.toCharArray()) {
			if(c.equals('a')||c.equals('e')||c.equals('i')||c.equals('o')||c.equals('u')) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void reverseString(String s) {
		StringBuffer sb=new StringBuffer(s);
		String reversedString=sb.reverse().toString();
		System.out.println(reversedString);
		
		for(int i=reversedString.length()-1;i>=0;i--) {
			
			System.out.print(reversedString.charAt(i));			
		}
		System.out.println();
	}
	
	public static void readProperties() throws FileNotFoundException {
		String path = System.getProperty("user.dir")+"//src//test//java//config//or.properties";
        FileInputStream fis=new FileInputStream(path);
        WebDriver dr=new ChromeDriver();
        ChromeDriver cd=new ChromeDriver();
        
	}
	
	

}
