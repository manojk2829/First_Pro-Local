package javaPro;

import java.util.HashMap;

public class CountEach_Character_inString {

	public static void main(String[] args) {
		eachChar_count_String("java tt");
		each_vovel_count_String("aiabcd eofgh i manoj vu");
	}
	
	public static void eachChar_count_String(String str) {
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		char[] ch=str.toCharArray();
		for(Character c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		System.out.println(str+"  >>> "+"\n"+ hm);
	}
	
	
	public static void each_vovel_count_String(String str) {
		str=str.toLowerCase();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		hm.put('a', 0);hm.put('e', 0);hm.put('o', 0);hm.put('i', 0);hm.put('u', 0);
		char[] ch=str.toCharArray();
		for(Character c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
		}
		for(char v: hm.keySet())
		System.out.println(v+"  >>> "+ hm.get(v));
	}

}
