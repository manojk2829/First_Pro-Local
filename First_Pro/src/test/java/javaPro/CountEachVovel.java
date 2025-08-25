package javaPro;

import java.util.HashMap;
import java.util.Map;

public class CountEachVovel {

	public static void main(String[] args) {
		countVovel_in_String("this is selenium class count each vovel.");
		reverse_int(1234);
		reverce_String("manoj");
		System.out.println();
		reverce_String_StringBuffer("manoj");

	}
	
	public static void countVovel_in_String(String input) {
		input=input.toLowerCase();
		
		Map<Character, Integer> vCount=new HashMap<Character, Integer>();
		vCount.put('a', 0);
		vCount.put('e', 0);
		vCount.put('i', 0);
		vCount.put('o', 0);
		vCount.put('u', 0);
		char c[]=input.toCharArray();
		for(Character c1:c) {
			if(vCount.containsKey(c1)) {
				vCount.put(c1, vCount.get(c1)+1);
			}
		}
		
		for(char v: vCount.keySet()) {
			System.out.println(v+" "+ vCount.get(v));
		}
	}
	
	public static void reverse_int(int input) {
		int digit=0;
		int rev=0;
		while(input!=0) {
			digit=input%10;
			rev=rev*10+digit;
			input=input/10;
		}
		System.out.println(rev);
	}
	
	public static void reverce_String(String input) {
		for(int i=input.length()-1;i>=0;i--) {
			System.out.print(input.charAt(i));
		}
	}
		
	public static void reverce_String_StringBuffer(String input) {
			StringBuffer sb=new StringBuffer(input);
			System.out.println(sb.reverse());
		
	}

}
