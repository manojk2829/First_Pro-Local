package javaPro;

import java.util.HashMap;

public class Practise_Prog {

	public static void main(String[] args) {
		each_char_count_in_string("manoj kushwaha manoj");
		each_vovel_count_in_string("i am manoj kushwaha automation selenium");
		logest_Word("i am manoj kushwaha automation selenium");
		reverse_String("manoj kushwaha manoj");
		reverse_String_without_reverseMethod("manoj kushwaha manoj");
		System.out.println();
		reverse_number(1234);
		System.out.println("*****************************************");
		eachCount("manoj kushwaha manoj");
		eachVovelCount("i am automation selenium");
		longest_Word_inString("i am manoj kushwaha automation selenium");
	}
	
	public static void each_char_count_in_string(String str) {
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		char ch[]=str.toCharArray();
		for(Character c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		System.out.println(str +" >>> "+hm);
	}
	
	public static void each_vovel_count_in_string(String str) {
		str=str.toLowerCase();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		hm.put('a', 0);hm.put('e', 0);hm.put('i', 0);hm.put('o', 0);hm.put('u', 0);
		char ch[]=str.toCharArray();
		for(Character c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
		}
		for(char v: hm.keySet())
		System.out.println(v +" >>> "+hm.get(v));
	}
	
	public static void logest_Word(String str) {
		str=str.toLowerCase();
		String words[]=str.split(" ");
		String longest_Word="";
		for(String word:words) {
			if(word.length()>longest_Word.length()) {
				longest_Word=word;
			}
		}
		System.out.println("longest Word - > " + longest_Word);		
	}
	
	public static void reverse_String(String str) {
		str=str.toLowerCase();
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}
	
	public static void reverse_String_without_reverseMethod(String str) {
		str=str.toLowerCase();
		for(int i=str.length()-1;i>=0;i--) {
			char c=str.charAt(i);
			System.out.print(c);
		}
	}
	
	public static void reverse_number(int num) {
		int rev=0;
		while(num!=0) {
			int digit =num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println(rev);
	}
	
// -----------------------------------------------------------------------------
	
	public static void eachCount(String str) {
		str=str.toLowerCase();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		char ch[]=str.toCharArray();
		for(Character c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c,1);
			}
		}
		System.out.println(str+"    >>> " + hm);
	}
	
	public static void eachVovelCount(String str) {
		str=str.toLowerCase();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		hm.put('a', 0);hm.put('e', 0);hm.put('i', 0);hm.put('o', 0);hm.put('u', 0);
		char ch[]=str.toCharArray();
		for(Character c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
		}
		for(char v:hm.keySet()) {
			System.out.println(v+"    >>> " + hm.get(v));
		}		
	}
	
	public static void longest_Word_inString(String str) {
		String words[]=str.split(" ");
		String longestWord="";
			for(String word:words) {
				if(word.length()>longestWord.length()) {
					longestWord=word;
				}
			}
			System.out.println("Longest >> "+ longestWord);
	}
	
	
	
	
	
	
	

}
