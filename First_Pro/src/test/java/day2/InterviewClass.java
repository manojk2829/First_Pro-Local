package day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class InterviewClass {
	
	public static void main(String[] args) {
		total_Vovel_n_conson();
		anagram_();
		/*reverseString("manoj kushwaha");
		removeSpecialChar("$#%DGHFJH Manoj 23423&*^&");
		convert_String_to_int("345");
		occurance_of_vovel("Automation engineer Manoj");
		occurance_of_non_vovel("Automation engineer Manoj Manoj");
		*/
		only_Digit();
		anagram();
		remove_word_String_();
		remove_char_String_();
		remove_Duplicate_Character();
		occurance_of_vovel("aeiou aeiou aeiou");
		occurance_of_Character("Automation engineer Manoj Manoj");
		remove_Duplicate_Char("Automation engineer Manoj");
		removeDuplicateString();
		remove_all_Space();
		palindrom();
	}
	
	public static void total_Vovel_n_conson() {
		String s="manojn";
		Map<Character,Integer> m=new HashMap<>();
		int vo=0,co=0;
		for(char c:s.toCharArray()) {
			if("aeiou".indexOf(c)!=-1) {
				vo++;
			}else 
			{
				co++;
			}
		}
		System.out.println("Vovel >> " +vo);
		System.out.println("Cos >> " +co);	
	}
	
	public static void palindrom() {
		String s="madama";
		StringBuffer sb=new StringBuffer(s);
		String rev=sb.reverse().toString();
		System.out.println(rev.equals(s)?"Palindrom" :"Not Palindrom");
	}
	
	public static void reverse_each_Word() {
		String s="silent manoj kushwaha";
		String words[]=s.split(" ");
		for(String w:words) {
			StringBuffer result=new StringBuffer();
			result.append(new StringBuffer(w).reverse()).append(" ");
		}
	}
	
	
	public static void remove_all_Space() {
		String s1="silent dds dsfs g dfdsf  fds fsdf dsfds sdfsf fdf ";
		boolean t=s1.contains("dfdsf");
		System.out.println(t);		
	}
	
	
	public static void anagram() {
		String s1="silent";
		String s2="listen";
		char a1[]=s1.toCharArray();
		char a2[]=s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		System.out.println(Arrays.equals(a1, a2) ? "Anagram" : "Not Anagram");		
	}
	
	public static void only_Digit() {
		String s1="12345";
		System.out.println(s1.matches("\\d+") ? "Digit" : "Not Digit");		
	}
	
	public static void remove_char_String_() {
		String s="manoj manoj";
		String count[]=s.trim().split(" ");
		int size=count.length;
		System.out.println(size);
		Set<Character> set=new LinkedHashSet<>();
		StringBuffer sb=new StringBuffer();
		for(char c:s.toCharArray()) {
			set.add(c);
		}for(char ss:set) {
			sb.append(ss);
		}
		System.out.println(sb);
	}
	
	
	
	public static void remove_word_String_() {
		String s="manoj manoj";
		Set<String> set=new LinkedHashSet<String>();
		StringBuffer sb=new StringBuffer();
		for(String c:s.split(" ")) {
			set.add(c);
		}for(String ss:set) {
			sb.append(ss);
		}
		System.out.println(sb);
	}
	
	public static void remove_Duplicate_Character() {
		String s="manoj Automation manoj kushwaha";
		StringBuffer sb=new StringBuffer();
	    for(char c:s.toCharArray()) {
	    	if(sb.indexOf(String.valueOf(c))==-1)
	    		sb.append(c);	    		
	    	}
	    System.out.println(sb);
	}
	
	public static void remove_Duplicate_Char(String s) {
		
		Set<Character> m=new LinkedHashSet<>();
		StringBuffer sb=new StringBuffer();
		for(char c:s.toCharArray()) {
			m.add(c);
		}
		for(char c:m) {
			sb.append(c);
		}
		System.out.println(sb);
	}
	
	public static void occurance_of_non_vovel(String s) {		
		Map<Character,Integer> m=new HashMap<>();
		for(char c:s.toCharArray()) {
			if("aeiou".indexOf(c) ==-1) {
				m.put(c, m.getOrDefault(c,0)+1);
			}
		}
		System.out.println(m);
	}
	
	public static void occurance_of_vovel(String s) {		
		Map<Character,Integer> m=new HashMap<>();
		for(char c:s.toCharArray()) {
			if("aeiou".indexOf(c) !=-1) {
				m.put(c, m.getOrDefault(c,0)+1);
			}
		}
		System.out.println(m);
	}
	
	public static void occurance_of_Character(String s) {		
		Map<Character,Integer> m=new HashMap<>();
		for(char c:s.toCharArray()) {
				m.put(c, m.getOrDefault(m,0)+1);
		}
		System.out.println(m);
	}

	public static void reverseString(String s) {
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		StringBuffer sb=new StringBuffer(s);
		String or=sb.reverse().toString();
		System.out.println(or);
	}
	
	public static void removeSpecialChar(String s) {
		
		s=s.replaceAll("[^a-zA-Z ]", "");
		System.out.println(s);

	}
	
	public static void convert_String_to_int(String s) {		
		int num=Integer.parseInt(s);
		int n=num+123;
		System.out.println(n);
		int digit=0,rev=0;
		while(n!=0) {
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		System.out.println(rev);
	}
	
	
	public static void removeDuplicateString() {
		String s="manoj kushwaha manoj kushwaha";
		StringBuffer sb=new StringBuffer();
	    Set<String> set=new LinkedHashSet<String>();
	    for(String c: s.split(" ")) {
	    	set.add(c);
	    }
	    for(String c:set) {
	    	sb.append(c).append(" ");
	    }
	    System.out.println(sb);
	}
	
	
	public static void anagram_() {
		String s1="manoj";
		String s2="mojan";
		char a1[]=s1.toCharArray();
		char a2[]=s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		System.out.println(Arrays.equals(a1, a2) ?"Ana" : "Not Ana");
		}
	
	
	
}
