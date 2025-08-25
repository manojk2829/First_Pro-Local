package javaPro;

import java.util.HashMap;

public class CountEachVovel_In_String {

	public static void main(String[] args) {
		eachVovel("this is new Automation Code by Manoj");

	}
	
	public static void eachVovel(String str) {
		str=str.toLowerCase();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		hm.put('a', 0);hm.put('e', 0);hm.put('i', 0);hm.put('o', 0);hm.put('u', 0);
		char[] ch=str.toCharArray();
		for(Character c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
		}
		for(char v:hm.keySet()) {
			System.out.println(v+"   >>>>> " + hm.get(v));
		}
	}

}
