package javaPro;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class InterviewSister {

	public static void main(String[] args) {
		Count_total_vovel_in_string("Selenium automation");
		remove_speacil_char_from_string("!@8734983759#%^$^&%$*&Ma^&*(no   j Kushwaha ");
		longestwords_in_String("I am manoj Kushwaha Automation");
		eachVovelCount("I am manoj Kushwaha Automation Engineer");
		reverse_String("Suraj");
		reverse_Integer(123);
		removeDuplicate_char_from_String("I am manoj Kushwaha Automation Engineer");
		remove_Duplicate_Word_from_String("manoj kushwaha manoj manoj sarita kushwaha");
		removeDuplicateWords("manoj kushwaha manoj manoj sarita kushwaha");
	}
	
	public static void removeDuplicateWords(String str) {
	    String[] words = str.split(" ");
	    LinkedHashSet<String> uniqueWords = new LinkedHashSet<>();

	    for (String word : words) {
	        uniqueWords.add(word);  // Set automatically removes duplicates
	    }

	    // Join the unique words back into a string
	    String result = String.join(" ", uniqueWords);
	    System.out.println(result);
	}
	
	public static void remove_Duplicate_Word_from_String(String a) {
		String words[]=a.split(" ");
		LinkedHashSet<String> hm=new LinkedHashSet<String>();
		for(String word:words) {
				hm.add(word);
			}
		System.out.println(hm);
		String result =String.join(" ", hm);
		System.out.println(result);
	}
	
	public static void removeDuplicate_char_from_String(String a) {
		HashMap<Character, Boolean> hm=new HashMap<Character, Boolean>();
		StringBuffer result=new StringBuffer();
		for(Character ch:a.toCharArray()) {
			if(!hm.containsKey(ch)) {
				hm.put(ch,true);
				result.append(ch).append("");
			}
		}
		System.out.println(result);
	}

	public static void Count_total_vovel_in_string(String a) {
		int c = 0;
		for (Character ch : a.toCharArray()) {
			if (ch.equals('a') || ch.equals('e') || ch.equals('i') || ch.equals('u') || ch.equals('u')) {
				c++;
			}
		}
		System.out.println(c);
	}

	public static void remove_speacil_char_from_string(String a) {
		String withoutSpecialChar = a.replaceAll("[^a-zA-Z   ' ']", "");
		System.out.println(withoutSpecialChar);
		int total_Special_Char = a.length() - withoutSpecialChar.length();
		System.out.println(total_Special_Char);
	}

	public static void longestwords_in_String(String a) {
		String longest = "";
		String s[] = a.split(" ");
		for (String word : s) {
			if (word.length() > longest.length()) {
				longest = word;
			}
		}
		System.out.println(longest);
	}

	public static void eachVovelCount(String a) {
		String a1 = a.toLowerCase();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('a', 0);
		hm.put('e', 0);
		hm.put('i', 0);
		hm.put('o', 0);
		hm.put('u', 0);
		for (Character ch : a1.toCharArray()) {
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			}
		}
		for (char v : hm.keySet()) {
			System.out.println(v + " >>> " + hm.get(v));
		}
	}

	public static void reverse_String(String a) {
		StringBuffer sb = new StringBuffer(a);
		String reverecedString = sb.reverse().toString();
		System.out.println(reverecedString);
		
		for(int i=reverecedString.length()-1;i>=0;i--) {
			System.out.print(reverecedString.charAt(i));
		}
		System.out.println();
	}
	
	public static void reverse_Integer(int a) {
		int digit=0;
		int rev=0;
	
		while(a!=0) {
	    digit=a%10;
		rev=rev*10+digit;
		a=a/10;
		}
		System.out.println(rev);
		String reverced_Int=String.valueOf(rev);
		StringBuffer sb=new StringBuffer(reverced_Int);
		String number=sb.reverse().toString();
		System.out.println(number);
		
		int nu=Integer.parseInt(number);
		System.err.println(nu+321);
	}
	

}
