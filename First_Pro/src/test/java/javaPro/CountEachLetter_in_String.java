package javaPro;

import java.util.HashMap;

public class CountEachLetter_in_String {

	public static void main(String[] args){
		countString_Char("javaa");
		countEach_Vovel_in_Given_String("this is My Opening Value.");
		each_character_in_String("manoj kushwaha is an");
	}

	public static void countString_Char(String name){
	   HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
	   for(Character c:name.toCharArray()){
	   if(hm.containsKey(c)){
	       hm.put(c,hm.get(c)+1);
	   }else{
	       hm.put(c,1);
		 }	      
	   }
	   System.out.println(name+"  >>> " + hm);
	   
	}
	
	
	public static void countEach_Vovel_in_Given_String(String name){
		   name=name.toLowerCase();
		   HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
		   hm.put('a', 0);
		   hm.put('e', 0);
		   hm.put('i', 0);
		   hm.put('o', 0);
		   hm.put('u', 0);
		   char[] ch=name.toCharArray();
		   for(Character c:ch){
		   if(hm.containsKey(c)){
		       hm.put(c,hm.get(c)+1);
		     }		      
		   }
		   for(char v:hm.keySet())
		   System.out.println(v+"  "+ hm.get(v));		   
		}
	
	
	public static void each_character_in_String(String str) {
		str=str.toLowerCase();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(Character ch:str.toCharArray()) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
		}
		System.out.println(str+" >> "+ hm);
	}
	
	
}
