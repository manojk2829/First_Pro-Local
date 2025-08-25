package Interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringPractice {
	
	public static void main(String[] args) {
		count_Occurance_of_vovel_short_methods("Manoj Kushwaha Automation");
		CharacterOccurance();
		logestWords("manoj is an Automation kushwa");
		revese_String("manoj is an Automation kushwaha");
		total_numberOf_Words("manoj is an kushwa");
		total_numberOf_Words_by_space("manoj is an Automation kushwa");
		count_Occurance_of_vovel("manoj is an Automation kushwaha engineer");
		removeDuplicate_Character("manoj is an Automation kushwaha engineer");
		array_BoobleSorting();
		array_Sorting();
		remove_Number_from_String();
		count_Occurance_of_Character("manoj is an Automation kushwaha engineer");
		count_Occurance_of_Character1("manoj is an Automation kushwaha engineer");
		count_Occurance_of_Character("manoj is an Automation kushwaha engineer");
		iterator();
	}
	
	public static void iterator() {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"A");
		map.put(4,"B");
		map.put(3,"C");
		System.out.println(map.size());
		for(Map.Entry<Integer, String> en:map.entrySet()) {
			System.out.println(en.getKey()+"  >> " + en.getValue());
		}
	}
	
	public static void CharacterOccurance() {
		String s="maanoj Java woow all good";
		Map<Character,Integer> mp=new LinkedHashMap<>();
		for(char c:s.toCharArray()) {
			mp.put(c, mp.getOrDefault(c,0)+1);
		}
		System.out.println(mp);
	}
	
	
	
	public static void array_Sorting() {
		int a[]= {4,2,6,3,1,8};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void remove_Number_from_String() {
		String s="Manoj123 Kushwaha 567";
		String removeNumber=s.replaceAll("[^a-zA-Z ]", "");
		System.out.println(removeNumber);
	}
	
	public static void array_BoobleSorting() {
		int a[]= {4,2,6,3,1,8};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}			
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void logestWords(String s) {
		String words[]=s.split(" ");
		String longest="";
		for(String word:words) {
			if(word.length()>longest.length()) {
				longest=word;
			}
		}
		System.out.println(longest);
	}
	
	public static void revese_String(String s) {
		StringBuffer sb=new StringBuffer(s);
		String rev=sb.reverse().toString();
		System.out.println(rev);	
		for(int i=rev.length()-1;i>=0;i--) {
			System.out.print(rev.charAt(i));
		}
		System.out.println();
	}
	
	public static void vovelCOunt(String s) {
		int count=0;
		for(Character ch:s.toCharArray()) {
			if(ch.equals('a') || ch.equals('e')  ||ch.equals('i') ||ch.equals('o') ||ch.equals('u')) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void total_numberOf_Words(String s) {
		String words[]=s.split(" ");
		int count=0;
		for(String w:words) {
			count++;
		}
		System.out.println(count);
	}
	
	public static void total_numberOf_Words_by_space(String s) {
		int count=1;
		for(Character c:s.toCharArray()) {
			if(c.equals(' ')) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void count_Occurance_of_vovel_short_methods(String s) {
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(char ch:s.toCharArray()) {
			if("aeiou".indexOf(ch)!=-1) {
				hm.put(ch, hm.getOrDefault(ch,0)+1);
			}
		}	
		   System.out.println(hm);	
	}
	
	public static void count_Occurance_of_vovel(String s) {
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		hm.put('a', 0);
		hm.put('e', 0);
		hm.put('i', 0);
		hm.put('o', 0);
		hm.put('u', 0);
		
		for(Character ch:s.toCharArray()) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
		}
		for(char v:hm.keySet()) {
			System.out.println(v+" >> "+hm.get(v));
		}		
	}
	
	public static void count_Occurance_of_Character1(String s) {
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();	
		for(Character ch:s.toCharArray()) {
				hm.put(ch, hm.getOrDefault(ch,0)+1);
			}
		System.out.println(hm);
	}
	
	public static void count_Occurance_of_Character(String s) {
		Hashtable<Character, Integer> hm=new Hashtable<Character, Integer>();	
		for(Character ch:s.toCharArray()) {
				hm.put(ch, hm.getOrDefault(ch,0)+1);
			}
		System.out.println(hm);
	}
	
	public static void removeDuplicate_Character(String s) {
		HashMap<Character, Boolean> hm=new HashMap<Character, Boolean>();
		StringBuffer result=new StringBuffer();
		for(Character ch:s.toCharArray()) {
			if(!hm.containsKey(ch)) {
				hm.put(ch, true);
				result.append(ch);
			}
		}
		System.out.println(result.toString());	
	}
}
