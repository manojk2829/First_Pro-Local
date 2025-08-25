package day1_Arrays_String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class String_Program {

	public static void main(String[] args) {
		//getMayValue();
		removeDuplicateCharTest();
		//eachVovelCountTest();
		//eachCharCountTest();
		//longestWords();
  
		  StringBuffer result=new StringBuffer();
		  String s="Manoj Kushwaha Manoj";
    	  LinkedHashSet<Character> set=new LinkedHashSet<Character>();		 
		  for(char c:s.toCharArray()) {
			  set.add(c);
		  }
		  for(char c:set) {
			  result.append(c);
		  }		  
		  System.out.println(result);
		  int count=0;
		  HashMap<Character,Integer> m=new HashMap<>();
		  for(char c:s.toCharArray()) {
			  if("areou".indexOf(c)!=-1) {
				  count++;
				  m.put(c, m.getOrDefault(c, 0)+1);
			  }
		  }
		  System.out.println(count);
		  System.out.println(m);
		  
		  System.out.println("------------------------------------------------");
		  
		  int num=12321;
		  int reverse=0;
		  int oo=num;
		  while(num!=0) {
			  int digit=num%10;
			  reverse=reverse*10+digit;
			  num=num/10;
		  }
		  System.out.println(reverse);
		  if(oo == reverse) {
			  System.out.println("Palindrom");
		  }else {
			  System.out.println("Not Palindrom");
		  }
	}
	
	
	
	public static void getMayValue() {
		HashMap <Integer, String> map=new HashMap<Integer, String>();
		map.put(101, "Manoj");
		map.put(103, "Sarita");
		map.put(102, "Manavi");
		map.put(104, "Viraj");
		System.out.println(map.get(104));
		
		if(map.containsKey(102)){
			System.out.println(map.get(101));
		}else {
			System.out.print("Key value is not available...");
		}		
	}
	
	public static void removeDuplicateCharTest() {
		String s="manojkushwaha Sarita ManojKushwaha";
		StringBuffer sb=new StringBuffer();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(char c:s.toCharArray()) {
			set.add(c);
		}
		for(char c:set) {
			sb.append(c);
		}
		System.out.println(sb);
	}

	public static void eachVovelCountTest() {
		String s="manojkushwaha Sarita Manoj Kushwaha";
		//StringBuffer sb=new StringBuffer();
		LinkedHashMap<Character,Integer> set=new LinkedHashMap<>();
		int count=0;
		for(char c:s.toCharArray()) {
			
			if("aeiou".indexOf(c)!=-1) {
				set.put(c, set.getOrDefault(c, 0)+1);
				count++;
			}
		}System.out.println(set);
		System.out.println(count);
	}
	
	public static void eachCharCountTest() {
		String s="manojkushwaha Sarita Manoj manojKushwaha";
		//StringBuffer sb=new StringBuffer();
		LinkedHashMap<Character,Integer> set=new LinkedHashMap<>();
		int count=0;
		for(char c:s.toCharArray()) {
			if("aeiou".indexOf(c)==-1 || "aeiou".indexOf(c)!=-1) {
			
			set.put(c, set.getOrDefault(c, 0)+1);
				count++;
			}
		}System.out.println(set);
		System.out.println(count);
	}
	
	public static void longestWords() {
		String s="manojkushwaha Sarita34325435436546 Manoj manojKushwaha";
		String s1=s.replaceAll("[^a-zA-Z ]", "");
		System.out.println(s1);
		String words[]= s.split(" ");
		String l="";
		for(String word:words) {
			if(word.length()>l.length()) {
				l=word;
			}
		}
		System.out.println("Longest Word -->  " + l);
		//StringBuffer sb=new StringBuffer();
		LinkedHashMap<Character,Integer> set=new LinkedHashMap<>();
		int count=0;
		for(char c:s.toCharArray()) {
			if("aeiou".indexOf(c)==-1 || "aeiou".indexOf(c)!=-1) {
			
			set.put(c, set.getOrDefault(c, 0)+1);
				count++;
			}
		}System.out.println(set);
		System.out.println(count);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void eachvovelCount() {
		String s="manoj Kushwaha Selenium automatin";		
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(char c:s.toCharArray()) {
			if("aeiou".indexOf(c)!=-1) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
	  }
		System.out.println(map);
	}
	
	public static void eachCharCount() {
		String s="manoj Kushwaha Selenium automation";		
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(char c:s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
	}
	
	public static void remove() {
		String s="manoj Kushwaha Selenium automation";
		StringBuffer sb=new StringBuffer();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(char c:s.toCharArray()) {
			set.add(c);
		}
		for(char c:set) {
			sb.append(c);
		}
		System.out.println(sb);
	}
	
	public static void onlyVovelCount() {
		String s="manoj selenium Automation";
		int count=0;
		HashMap<Character, Integer> map=new HashMap<>();
		for(char c:s.toCharArray()) {
			if("aeiou".indexOf(c)!=-1) {
				map.put(c,map.getOrDefault(c,0)+1);
				count++;
			}
		}System.out.println(count);
		System.out.println(map);
    }
	
	public static void RemoveDuplicateChar_from_String() {
		String s="manoj selenium Automation";
		int count=0;
		StringBuffer result=new StringBuffer();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(char c:s.toCharArray()) {
			set.add(c);
		}		
		for(char c:set) {
			result.append(c);
		}
		System.out.println(result.toString());
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void test() {
		String s="manoj kushwaha Appium";
		int count=0;
		StringBuffer sb=new StringBuffer();
		HashMap<Character,Integer> m=new HashMap<>();
		for(char c:s.toLowerCase().toCharArray()) {
			m.put(c, m.getOrDefault(c, 0)+1);
			if(c!=' ' && m.get(c)==1) {
				sb.append(c);
			}
			count++;
	  }
		System.out.println(m);
		System.out.println();
		System.out.println(count);
		System.out.println(sb.toString());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void OracanceOf_Vovel() {
		String s="manoj kushwaha selenium engineer";
		HashMap<Character,Integer> map=new HashMap<>();
		for(char c:s.toLowerCase().toCharArray()) {
		if("aeiou".indexOf(c)!=-1) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
	  }
		System.out.println(map);
	}
	
	
	public static void removeDuplicateChar() {
		String s="manoj kushwaha Selenium Engineer";
		Map<Character, Integer> map=new HashMap<>();
		for(char c:s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
     }
}
