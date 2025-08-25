package javaPro;

import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewQuestion {
	
	public static void main(String[] args) {
		longestWord("Manoj kushwaha Selenium automation testing.");
		reveres_Number(123);
		convertString_to_Number("100");
		count_total_vovel_("Manoj kushwaha Selenium automation");
		each_vovelCount("Manoj kushwaha Selenium automation");
		each_char_Count("Manoj kushwaha Selenium automation");
		reveres_String("manoj");
		test("manoj");
		System.out.println();
		test1("manoj");
		test2("1234");
		test3(1234);
		larg("Manoj kushwaha Selenium automation");
		total_Vovel("Manoj kushwaha Selenium automation aaadi");
		each_VovelCount("Manooj kushwaha Slenium automation aaadi");
		each_char_count("Manooj kushwaha Slenium automation aaadi");
		System.out.println();
		test5(123);
		removeDuplicate("Manooj kushwaha Slenium automation aaadi");
		
	}
	
	public static void test(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			char c=str.charAt(i);
			System.out.print(c);
		}
	}
	
	public static void test1(String str) {
		StringBuffer sb=new StringBuffer(str);
		String num=sb.reverse().toString();
		System.out.println(sb.reverse());
	}
	
	public static void test5(int num) {
		String num1=String.valueOf(num);
		int n=Integer.parseInt(num1);
		System.out.println(n+123);
	}
	
	public static void test2(String str) {		
		StringBuffer sb=new StringBuffer(str);
		String num=sb.reverse().toString();
		int str1=Integer.parseInt(num);
		System.out.println(str1);		
	}
	
	public static void test3(int num) {		
		int rev=0;
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println(rev);
	}
	
	public static void larg(String str) {		
		str=str.toLowerCase();
		String longest="";
		String words[]=str.split(" ");
		for(String word:words) {
			if(word.length()>longest.length()) {
				longest=word;
			}
		}
		System.out.println(longest);
	}
	
	public static void total_Vovel(String str) {		
		str=str.toLowerCase();
		int count=0;
		for(Character c:str.toCharArray()) {
			if(c.equals('a') ||c.equals('e') ||c.equals('i') ||c.equals('o') ||c.equals('u')) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void each_char_count(String str) {		
		str=str.toLowerCase();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(Character c:str.toCharArray()) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}else {
				hm.put(c,1);
			}
		}
		System.out.println(str+" --> " + hm);
	}
	
	public static void each_VovelCount(String str) {		
		str=str.toLowerCase();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		hm.put('a',0);
		hm.put('e',0);
		hm.put('i',0);
		hm.put('o',0);
		hm.put('u',0);	
		for(Character c:str.toCharArray()) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}
		}
		for(char v:hm.keySet()) {
			System.out.println(v+"  "+ hm.get(v));
		}
	}
	
	public static void removeDuplicate(String str) {
		str=str.toLowerCase();
		HashMap<Character, Boolean> hm =new HashMap<Character, Boolean>();
		StringBuffer result=new StringBuffer();
		for(Character c:str.toCharArray()) {
			if(!hm.containsKey(c)) {
				hm.put(c, true);
				result.append(c);
			}
		}
		System.out.println(result);
	}
	
	
	
	
	
	public static void reveres_String(String s) {
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
	}
	
	public static void reveres_String_for_loop(String s) {
		for(int i=s.length()-1;i>=0;i--) {
			char x=s.charAt(i);
			System.out.print(x);
		}
		
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
	
	public static void reveres_Number(int s) {
		int digit, rev=0;
		while(s!=0) {
			digit=s%10;
			rev=rev*10+digit;
			s=s/10;
		}
		System.out.println(rev);
	}
	
	public static void convertString_to_Number(String num) {
		int number=Integer.parseInt(num);
		System.out.println(number+100);
	}
	
	public static void count_total_vovel_(String str) {
		str=str.toLowerCase();
        int count=0;
		for(Character c:str.toCharArray()) {
           if(c.equals('a')||c.equals('e')||c.equals('i')||c.equals('o')||c.equals('u')) {
        	   count++;
           }
		}
		System.out.println(count);
		
	}
	
	public static void each_char_Count(String str) {
		str=str.toLowerCase();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(Character c:str.toCharArray()) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c,1);
			}
		}
		System.out.println(str +" >> "+ hm);
		
	}
	
	public static void each_vovelCount(String str) {
		str=str.toLowerCase();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		hm.put('a', 0);
		hm.put('e', 0);
		hm.put('i', 0);
		hm.put('o', 0);
		hm.put('u', 0);
		for(Character c:str.toCharArray()) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
		}
		for(char v:hm.keySet())
		System.out.println(v +" >> "+ hm.get(v));
		
	}
	

}
