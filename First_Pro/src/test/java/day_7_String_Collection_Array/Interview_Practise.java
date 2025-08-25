package day_7_String_Collection_Array;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class Interview_Practise {

	public static void main(String[] args) {
		duplicate_Char();
		occurance_of_Vovel();
		occurance_of_char();
		duplicate_String();
		
		
	}
	
	public static void occurance_of_char() {
		String s="manoj kushwaha is an eng automation";
		HashMap<Character, Integer> map=new HashMap<>();
		for(char c:s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		  System.out.println(map);
	}
	
	public static void occurance_of_Vovel() {
		String s="manoj kushwaha is an automation eng";
		HashMap<Character, Integer> map=new HashMap<>();
		for(char c:s.toCharArray()) {
			if("aeiou".indexOf(c)!=-1)
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
	}
	
	public static void duplicate_Char() {
		String s="manoj kushwaha is an automation";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		StringBuffer sb=new StringBuffer();
		for(char c:s.toCharArray()) {
			set.add(c);
		}
		for(char c: set)
		  sb.append(c).append("");
		System.out.println(sb);
	 }
	
	public static void duplicate_String() {
		String s="manoj kushwaha is an automation manoj";
		LinkedHashSet<String> set=new LinkedHashSet<>();
		StringBuffer sb=new StringBuffer();
		for(String c:s.split(" ")) {
			set.add(c);
		}
		for(String c: set)
		  sb.append(c).append(" ");
		System.out.println(sb);
	 }
    
}
