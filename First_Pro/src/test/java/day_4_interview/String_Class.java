package day_4_interview;

import java.util.HashMap;
import java.util.LinkedHashSet;


public class String_Class {
	
	public static void main(String[] args) {
		total_Capital_and_Small();
		total_number_of_words_by_spac_char();
		total_number_of_words();
		reverse_int();
		total_number_of_word();
		reverseString();
		occurance_of_char();
		System.out.println();
		occurance_of_vovel();
		System.out.println();
		longest_word();
		System.out.println();
		removeDuplicate_Char();
		System.out.println();
		removeDuplicate_String();
		
	}
	
	public static void removeDuplicate_String() {		
		String s="manoj kushwaha automation engineer manoj kushwaha";
        LinkedHashSet<String> m=new LinkedHashSet<>();	
		StringBuffer result=new StringBuffer();
		for(String c:s.split(" ")){			
			m.add(c);
	   }
		for(String ch:m) {
			result.append(ch).append(" ");
		}
		System.out.println(result);
	}
	
	public static void total_Capital_and_Small() {
    	String s="Manoj Kushwaha Automation SK Maurya";    	
    	int cap=0;
    	int small=0;
    	for(char c:s.toCharArray()) {
    		if(c>='A' && c<='Z') {
    			cap++;
    		}else {
    			small++;
    		}
    	}
    	
    	System.out.println(cap);
    	System.out.println(small);
    }
	
	public static void total_number_of_words_by_spac_char() {
    	String s="Manoj Kushwaha Automation SK";    	
    	int count=0;
    	for(Character c:s.toCharArray()) {
    		if(c.equals(' ')) {
    		count++;
    	}}
    	System.out.println(count+1);
    }
	
    public static void total_number_of_words() {
    	String s="Manoj Kushwaha Automation SK Maurya";
    	String[] words=s.split(" ");
    	int count=0;
    	for(String w:words) {
    		count++;
    	}
    	System.out.println(count);
    }
	
	
	public static void reverse_int() {
		int n=123;
		int digit=0,rev=0;
		while(n!=0) {
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
			
		}
		System.out.println(rev);
		System.out.println(rev+100);
		String newRev=String.valueOf(rev);
		System.out.println(newRev+100);
	}
	
	
	public static void reverseString() {
		String s="manoj kushwaha";
		StringBuffer sb=new StringBuffer(s);
		String newStringRev=sb.reverse().toString();
		System.out.println(newStringRev);
		System.out.println();
		
		for(int i=newStringRev.length()-1;i>=0;i--) {
			System.out.print(newStringRev.charAt(i));
		}
		System.out.println();
	}
	
	
	public static void removeDuplicate_Char() {		
		String s="manoj kushwaha automation engineer";
        LinkedHashSet<Character> m=new LinkedHashSet<>();	
		StringBuffer result=new StringBuffer();
		for(char c:s.toCharArray()){			
			m.add(c);
	   }
		for(char ch:m) {
			result.append(ch).append(" ");
		}
		System.out.println(result);
	}
	
	public static void occurance_of_vovel() {		
		String s="manoj kushwaha automation engineer";
		HashMap<Character,Integer> m=new HashMap<>();		
		for(char c:s.toCharArray()){
			if("aeiou".indexOf(c)!=-1) {
			m.put(c, m.getOrDefault(c,0)+1);
	  	}
	  }
		System.out.println(m);
		HashMap<Character,Integer> hm=new HashMap<>();
		for(char c:s.toCharArray()) {
		if("aeiou".indexOf(c)==-1) {
	  		hm.put(c, hm.getOrDefault(c,0)+1);
	  	}}
		System.out.println(hm);
	}
	
	public static void occurance_of_char() {		
		String s="manoj kushwaha automation";
		HashMap<Character,Integer> m=new HashMap<>();		
		for(char c:s.toCharArray()){
			m.put(c, m.getOrDefault(c,0)+1);
		}
		System.out.println(m);
	}
	
	public static void longest_word() {		
		String s="manoj kushwaha";
		String lon="";
		String[] words=s.split(" ");
		for(String w:words){
			if(w.length()>lon.length()) {
				lon=w;
			}
		}
		System.out.println(lon);
	}
	
	public static void total_number_of_word() {		
		String s="manoj kushwaha";
		
		String[] words=s.split(" ");
		System.out.println(words.length);
		
	}
	
	

}
