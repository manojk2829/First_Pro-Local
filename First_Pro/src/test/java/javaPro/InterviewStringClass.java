package javaPro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InterviewStringClass {

	public static void main(String[] args) {
		/*test_longestWord("manoj kushwaha123 Automation");
		reverseString("manoj kushwaha123 Automation");
		
		System.out.println();
		each_char_count("manoj kushwaha is engineer");
		each_Vovel_count("manoj kushwaha is engineer");
		reverseInteger(1234);
	*/
		//each_Vovel_inString("manoj kushwaha Automation E");
		  //removeDuplicateChar("duplicateValue");
		  //removeDuplicate_character("duplicateValue");
		  //find_duplicate_word_in_String("manoj sarita Kushwaha manavi Manoj Kushwaha" );
		  //System.out.println();
		  //removeDuplicate_word("manoj sarita Kushwaha manavi Manoj Kushwaha");
		  //reverseNumber(10002); //total_vovel("manoj kushwaha engineer");
		longestWord("manoj dddd Automation new");	 	
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
	
	
	public static void CountVovel(String s) {
		s=s.toLowerCase();
		int c=0;
		for(int i=0;i<s.length();i++) {
			s.charAt(i);
			System.out.println(s.charAt(i));
			if(s.charAt(i)=='a') {
				c++;
			}
		}
		for(Character ch:s.toCharArray()) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				c++;
			}
		}
		System.out.println(c);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
	
	public static void each_Vovel_count(String s) {
		s=s.toLowerCase();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		hm.put('a', 0);
		hm.put('e', 0);
		hm.put('i', 0);
		hm.put('o', 0);
		hm.put('u', 0);
		for(Character ch:s.toCharArray()) {
			if(hm.containsKey(ch)){
				hm.put(ch, hm.get(ch)+1);
			}
		}for(char v: hm.keySet()) {
			System.out.println(v + " ---- > " +hm.get(v));
		}
		
		
	}
	
	public static void each_char_count(String s) {
		s=s.toLowerCase();
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
	
	
	public static void test_longestWord(String s) {
		String[] words=s.split(" ");
		String max="";
		for(String word:words) {
			if(word.length()>max.length()) {
				max=word;
			}
		}
		System.out.println(max);
	}
	
	public static void reverseString(String s) {
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		System.out.println();
		String reversedString=sb.reverse().toString();
		for(Character c:reversedString.toCharArray()) {
			System.out.print(c+"");
		}
		System.out.println();
	}
	
	public static void reverseInteger(int num) {
		String convertInt_to_String=String.valueOf(num);
		StringBuffer sb=new StringBuffer(convertInt_to_String);
		System.out.println(sb.reverse());
		System.out.println();
		String reversedString=sb.reverse().toString();
		for(Character c:reversedString.toCharArray()) {
			System.out.print(c+"");
		}
		System.out.println();
		System.out.println("Integer Value to Reverce >> " + reversedString);
		int number=Integer.parseInt(reversedString);
		int digit=0,rev=0;
		while(number!=0) {
			digit=number%10;
			rev=rev*10+digit;
			number=number/10;
		}
		System.out.println(rev);
		
	}
	
	public static void remove_Duplicate_Words(String s) {
		String words[]=s.split(" ");
		HashMap<String, Boolean> hm=new HashMap<String, Boolean>();
		StringBuilder result=new StringBuilder();
		for(String word:words) {
			if(!hm.containsKey(word)) {
				hm.put(word, true);
				result.append(word);
			}
		}
		System.out.println(result);	
	}
	
	public static void removeDuplicateChar(String s) {
		HashMap<Character, Boolean> hm=new HashMap<Character, Boolean>();
		StringBuilder result=new StringBuilder();
		for(Character c:s.toCharArray()) {
			if(!hm.containsKey(c)) {
				hm.put(c, true);
				result.append(c);
			}
		}
		System.out.println(result);	
	}
	
	public static void removeDuplicate_word(String s) {
		String words[]=s.split(" ");
		HashMap<String, Boolean> hm=new HashMap<String, Boolean>();
		StringBuilder result=new StringBuilder();
		for(String word:words) {
			if(!hm.containsKey(word)) {
				hm.put(word, true);
				result.append(word);
			}
		}
		System.out.println(result);
	}
	
	
	
	public static void reverseNumber(int num) {
		int rev=0;
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println(rev);
	}
	
	public static void find_duplicate_word_in_String(String str) {
		str=str.toLowerCase();
		String words[]=str.split(" ");
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for(String word:words) {
			hm.put(word, hm.getOrDefault(word, 0)+1);
		}
		
		for(Map.Entry<String, Integer> entry:hm.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() +"  "+ entry.getValue());
			}
		}
	}
	
	/*
	
	public static void find_duplicate_word_in_String(String str) {
		str=str.toLowerCase();
		String words[]=str.split(" ");
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for(String word:words) {
			  hm.put(word, hm.getOrDefault(word, 0)+1);	
			}
		System.out.println("Duplicate Word: ");
		for(Map.Entry<String, Integer> entry:hm.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+"  >> "+ entry.getValue());
			  }
	     	}
	}
		*/
	
	public static void total_vovel(String str) {
		str = str.toLowerCase();
		char[] ch=str.toCharArray();
		int count=0;
		for(Character c:ch) {
			if(c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o') || c.equals('u')) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	public static void removeDuplicate_character(String str) {
		HashMap<Character, Boolean> hm=new HashMap<Character, Boolean>();
		StringBuffer result=new StringBuffer();
		for(char c:str.toCharArray()) {
			if(!hm.containsKey(c)) {
				hm.put(c,true);
				result.append(c);
			}
		}
		System.out.println(result);
	}
	
	
	public static void longest_Word(String str) {
	
		String s[]=str.split(" ");
		String longest="";
		for(String word:s) {
		  if(word.length()>longest.length()) {
			  longest=word;
		  }
		}
		System.out.println(longest);
		System.out.println();
	}
	
	public static void each_Vovel_inString(String str) {
		str=str.toLowerCase();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		hm.put('a', 0);
		hm.put('e', 0);
		hm.put('i', 0);
		hm.put('o', 0);
		hm.put('u', 0);
		for(char c:str.toCharArray()) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
		}
		for(char v:hm.keySet())
		System.out.println(v+ " " + hm.get(v));
	}
	
	
  /*	
	public static void eachCharacter_inString(String str) {
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(char c:str.toCharArray()) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		System.out.println("Str >>" +str+ " " + hm);
	}
	
	public static void each_Vovel_inString(String str) {
		str=str.toLowerCase();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		hm.put('a', 0);
		hm.put('e', 0);
		hm.put('i', 0);
		hm.put('o', 0);
		hm.put('u', 0);
		for(char c:str.toCharArray()) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
		}
		for(char v:hm.keySet())
		System.out.println(v+ " " + hm.get(v));
	}
	
	public static void remove_DuplicateCharacter_inString(String str) {
		HashMap<Character, Boolean> hm=new HashMap<Character, Boolean>();
		StringBuffer result=new StringBuffer();
		for(char c:str.toCharArray()) {
			if(!hm.containsKey(c)) {
				hm.put(c, true);
				result.append(c);
			}
		}
		System.out.println("Result >>" +result);
	}
	
	public static void longest_Word(String str) {
		String words[]=str.split(" ");
		String longest="";		
		for(String word:words) {
			if(word.length()>longest.length()) {
				longest=word;
			}
		}
		System.out.println("Result >>" +longest);
	}
	
	public static void sort_the_Arrays() {
		int arr[]= {3,5,2,1,7,8};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));		
	}
	
	public static void sort_the_Arrays_by_logic() {
		int a[]= {3,5,2,5,7,1,8};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;					
				}
			}			
		}
		System.out.println(Arrays.toString(a));				
	}	
	
	public static void converst_String_in_Number(String s,int a) {
		long num=Long.parseLong(s);
		System.out.println(num);
		num=num+a;
		System.out.println(num);
	}
*/
}
