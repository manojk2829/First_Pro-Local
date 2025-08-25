package javaPro;

import java.util.HashMap;
import java.util.Set;

public class Remove_Duplicate_character_String {	   
	
	    public static void main(String[] args) {
	    	//String str="manojkushwaha Sarita";
	    	//System.out.println(removeString(str));
	    	//reverseString();
	    	//reverseInt();
	    	//reverseInteger_byStringBuffer();
	    	EachVovel_Count("Automation Manoj");
	    	Vovel_Count("manoj kushwaha is an engineer");
	    }
	    
	    public static void eachCharCount(String str) {
	    	str=str.toLowerCase();
	    	HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
	    	for(Character ch:str.toCharArray()) {
	    		if(hm.containsKey(ch)) {
	    			hm.put(ch, hm.get(ch)+1);
	    		}else {
	    			hm.put(ch, 1);
	    		}
	    	}
	    	System.out.println(hm);	    	
	    }
	    
	    public static void EachVovel_Count(String str) {
	    	str=str.toLowerCase();
	    	HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
			hm.put('a', 0);
			hm.put('e', 0);
			hm.put('i', 0);
			hm.put('o', 0);
			hm.put('u', 0);
	    	for(Character ch:str.toCharArray()) {
	    		if(hm.containsKey(ch)) {
	    			hm.put(ch, hm.get(ch)+1);
	    		}
	    	  }for(char v:hm.keySet()) {
	    		  System.out.println(v+" > " + hm.get(v));
	    	   }	    
	    	 }
	    
	    public static void Vovel_Count(String str) {
	    	str=str.toLowerCase();
	    	int c=0;
	    	for(Character ch:str.toCharArray()) {
	    		if(ch.equals('a')||ch.equals('e')||ch.equals('i')||ch.equals('o')||ch.equals('u')) {
	    			c++;
	    		}
	    	}
	    	System.out.println(c);
	    
	   }
	    

	    
	    
	    
	    public static String removeString(String str) {
	    	HashMap<Character, Boolean> hm=new HashMap<Character, Boolean>();
	    	StringBuilder sb=new StringBuilder();
	    	char[] ch=str.toCharArray();
	    	for(Character c:ch) {
	    		if(!hm.containsKey(c)) {
	    			hm.put(c,true);
	    			sb.append(c);
	    		}
	    	}
	    	return sb.toString();
	    }
	    
	    public static void reverseString() {
	    	String a="manoj";
	    	for(int i=a.length()-1;i>=0;i--) {
	    		System.out.print(a.charAt(i)+"");
	    	}
	    	System.out.println();
	    	
	    	String b="kushwaha";
	    	a=a+b;
	    	System.out.println("--------------------------");
	    	System.out.println(a);
	    	System.out.println("--------------------------");
	    	b=a.substring(0,a.length()-b.length());
	    	a=a.substring(b.length());
	    	System.out.println(a);
	    	System.out.println(b);
	    }
	    
	    public static void reverseInt() {
	    	int a=123;
	    	int digit=0;
	    	int rev=0;
	    	while(a!=0) {
	    		digit=a%10;
	    		rev=rev*10+digit;
	    		a=a/10;
	    	}
	    	System.out.println(rev);
	    	String n="12345";
	    	StringBuffer sb=new StringBuffer(n);
	    	String num=sb.reverse().toString();
	    	int nnn= Integer.parseInt(num);
	    	System.out.println();
	    	System.out.println(nnn+10000);
	    }
	    
	    public static void reverseInteger_byStringBuffer() {
	    	int n=1234;
	    	String n1=String.valueOf(n);
	    	StringBuffer sb=new StringBuffer(n1);
	    	String num=sb.reverse().toString();
	    	System.out.println(num);
	        int a=1000;
	    	int b=Integer.parseInt(num);
	        System.out.println(a+b);
	        System.out.println(b);
	        int rev=0;
	        while(b!=0) {
	        	int digit =b%10;
	        	rev=rev*10+digit;
	        	b=b/10;
	        }
	        System.out.println(rev%10);
	    }
	    
	    

}
