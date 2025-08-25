package javaPro;

import java.util.Arrays;
import java.util.HashMap;

public class BobbleSorting {

	public static void main(String[] args) {
		removeDuplicateChar("Manoj ksuhwahshskushwahaa");
		countVovel_inString("Manoj Selenium ksuhooowahshskushwahaa");
		countEachCharacter("Manoj kuansuhwahshskushowahaa");
		int a[]= {23,45,3,5,33,24,46,42,12,4};
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
	
	
	public static void b() {
		int a[] = {2,4,43,65,45,34,2,1};
		int temp;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
				  temp=a[j];
				  a[j]=a[j+1];
				  a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void removeDuplicateChar(String str) {
		HashMap<Character, Boolean> hm=new HashMap<Character, Boolean>();
		StringBuffer result=new StringBuffer();
		for(Character c:str.toCharArray()) {
			if(!hm.containsKey(c)) {
				hm.put(c, true);
				result.append(c);
			}
		}
		System.out.println(result);
	}
	
	public static void countEachCharacter(String str) {
		str=str.toLowerCase();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(Character c:str.toCharArray()) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c,1);	
			}
		}
		
		System.out.println(str+" --- > " +hm);
	}
	
	public static void countVovel_inString(String str) {
		str=str.toLowerCase();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		hm.put('a', 0);
		hm.put('e', 0);
		hm.put('i', 0);
		hm.put('o', 0);
		hm.put('u', 0);
		for(Character c:str.toCharArray()) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
		}
		for(char v:hm.keySet()) {		
		  System.out.println(v+" --- > " +hm.get(v));
	}
		}
	

}
