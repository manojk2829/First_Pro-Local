package javaPro;

import java.util.HashMap;

import org.checkerframework.checker.units.qual.Length;

public class Interview_String_Program {

	public static void main(String[] args) {
		eachVovelCount();
		reverseInt();
		arrayString();
		small_Large();
		reverseNumber_(123);
		total_vovel_count("mAnOj kUshwAhA aeiou");
		totalvovel_count("mAnOj kUshwAhA aeiou");
		removeDuplicate_character("manoj kushwaha sapient");
		removeDuplicatecharacter("manoj kushwaha sapient");
		get_each_Vovel_In_String("I am manoj I am automation engin selenium");
		eachChar_inString("I am manoj a c selenium");
		get_each_character_In_String("I am manoj a c selenium");
		get_longest_word_In_String("I am manoj I am automation engineer123 selenium");
		reverse_String_without_reverse("manoj kushwaha");
		System.out.println();
		reverse_String("manoj kushwaha");
		reverse_number(12345);
  
		arrayString11();
		totalvovel_count("manoj kushwha selenium");
	}
	
	public static void arrayString11() {
		String s="manoj kushwaha automation13";
		StringBuffer sb=new StringBuffer(s);
		sb.length();
		String[] ar=s.split(" ");
		String largest="";
		for(int i=0;i<ar.length;i++) {
			if(ar[i].length()>largest.length()) {
				largest=ar[i];
			}
		}
		System.out.println(largest);
		
	}
	
	public static void eachVovelCount1() {
		String str="manoj kushwaha selenium engineer";
		boolean f=true;
		if(f==true) {
			
		}
		int count=0;		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void eachVovelCount() {
		String str="manoj kushwaha selenium engineer";
		
		int count=0;
		for(Character ch:str.toCharArray()) {
			if(ch.equals('a')||ch.equals('e')||ch.equals('i')||ch.equals('o')||ch.equals('u')) {
				count++;
			}
		}
		System.out.println(count);
		
		
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		hm.put('a', 0);
		hm.put('e', 0);
		hm.put('i', 0);
		hm.put('o', 0);
		hm.put('u', 0);
		
		for(Character ch: str.toCharArray()) {
			if(hm.containsKey(ch)) {
			   hm.put(ch, hm.get(ch)+1);
			}
		  }
		for(char v:hm.keySet()) {
			System.out.println(v+" " +hm.get(v));
		}
	}
	
	
	public static void reverseInt() {
		int num=1234;
		String number=String.valueOf(num);
		StringBuffer sb=new StringBuffer(number);
		String rev=sb.reverse().toString();
				System.out.println(rev);
				int r=Integer.parseInt(rev);
				System.out.println(r+200);		
		}
	
	public static void small_Large() {
		int num[]={3,5,6,1,2,-5};
		int l=num[0];
		int s=num[0];		
       for(int i=0;i<num.length;i++) {
          if(num[i]>l) {
        	  l=num[i];
       }else if(num[i]<s) {
     	  s=num[i];
       } 		
      }
		System.out.println(s+" "+l);		
	}
	
	public static void arrayString() {
		String s="manoj kushwaha automation13";
		String[] ar=s.split(" ");
		String largest="";
		for(String word:ar) {
			if(word.length()>largest.length()) {
				largest=word;
			}
		}
		System.out.println(largest);
		
	}
	
	public static void eachChar_inString(String s) {
		s=s.toLowerCase();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(Character c:s.toCharArray()) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		System.out.println(s+"   >>> " + "\n" +  hm);
	}
	
	
	public static void reverseNumber_(int number) {
		int digit;
	     int rev=0;
		while(number!=0) {
			digit=number%10;
			rev=rev*10+digit;
			number=number/10;
		}
		System.out.println(rev);
	}
	
	
	
	
	// Total Vovel Count 
	public static void totalvovel_count(String str) {
		str=str.toLowerCase();
		int count=0;
        char ch[]=str.toCharArray();
		for(Character c:ch) {
			if(c.equals('a')||c.equals('e')||c.equals('i')||c.equals('o')||c.equals('u')) {
				count++;
			}
		}
		System.out.println(count);
		
	} 
	
	
	
	// Total Vovel Count 
	public static void total_vovel_count(String str) {
		str=str.toLowerCase();
		int count=0;
		for(Character c:str.toCharArray()) {
			if(c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o') || c.equals('u')) {
				count++;
			}
		}
		System.out.println("Total Vovel -- >> " + count);
	} 

	// Count Each character in String
	public static void get_each_character_In_String(String str) {
		str=str.toLowerCase();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char ch[] = str.toCharArray();
		for (Character c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println(str + "   >>> " + "\n" + hm);
	}

	// Count Each Vovel in String
	public static void get_each_Vovel_In_String(String str) {
		str = str.toLowerCase();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('a', 0);
		hm.put('e', 0);
		hm.put('i', 0);
		hm.put('o', 0);
		hm.put('u', 0);
		char ch[] = str.toCharArray();
		for (Character c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			}
		}
		for (char v : hm.keySet()) {
			System.out.println(v + "  " + hm.get(v));
		}
	}

	// longest Word is String
	public static void get_longest_word_In_String(String str) {
		str = str.toLowerCase();
		String words[] = str.split(" ");
		String longest = "";
		for (String word : words) {
			if (word.length() > longest.length()) {
				longest = word;
			}
		}
		System.out.println(longest);
	}

	// Reverse the String
	public static void reverse_String(String s) {
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}

	public static void reverse_String_without_reverse(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			System.out.print(c);
		}
	}

	public static void reverse_number(int num) {
		int rev = 0;
		while (num != 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		System.out.println(rev);
	}
	
	public static void removeDuplicate_character(String str) {
		HashMap<Character, Boolean> hm=new HashMap<Character, Boolean>();		
		StringBuilder result=new StringBuilder();
		for(Character c:str.toCharArray()) {
			if(!hm.containsKey(c)) {
				hm.put(c, true);
				result.append(c);
			}
		}
		System.out.println(result.toString());		
	}
	
	
	public static void removeDuplicatecharacter(String str) {
		HashMap<Character, Boolean> hm=new HashMap<Character, Boolean>();
		StringBuffer result=new StringBuffer();
		for(Character c:str.toCharArray()) {
			if(!hm.containsKey(c)) {
				hm.put(c, true);
				result.append(c);
			}
		}
		System.out.println(result.toString());
	}
	

}
