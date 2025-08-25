package intro;

import java.util.HashMap;

public class Count_total_Vovel {

	public static void main(String[] args) {
		totalVovel_in_String("manoj is an automation engineer");
		each_VovelCount_in_String("manoj is an automation engineer");
		longestWord("manoj is an automation engineer1234");

	}

	public static void totalVovel_in_String(String str) {
		str=str.toLowerCase();
		int c=0;

		//HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(Character ch: str.toCharArray()) {
			if(ch.equals('a') ||ch.equals('e') ||ch.equals('i') ||ch.equals('o') ||ch.equals('u')) {
				c++;
			}
		}
		System.out.println(c);		
	}
	
	public static void each_VovelCount_in_String(String str) {
		str=str.toLowerCase();
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
			System.out.println(v +" >> " + hm.get(v));
		}		
	}
	
	public static void longestWord(String str) {
		String words[]=str.split(" ");
		String longest="";
		for(String word:words) {
			if(word.length()>longest.length()) {
				longest=word;
			}
		}
		System.out.println(longest);
		
	}
}
