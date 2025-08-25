package javaPro;

import java.util.Arrays;

public class PractiseClass {
	
	public static void main(String[] args) {
    
		//stringMethod("manoj Sarita Viraj Manavi Kushwaha");
		//reverseString();
	}
	
	public static void stringMethod(String s) {
		String s1=s;
		int count=1;
		String argS[]=s1.split(" ");
		System.out.println(argS.length);
		 System.out.println(Arrays.toString(argS));
		
		  for(int i=0;i<s1.length();i++)
		  { 
			  if(s1.charAt(i)==' ') 
		  { 
			  count++; 
		  } 
		 }
		  System.out.println(count);
		 
	}
	
	public static void reverseString() {
		String s1="manoj";
		StringBuffer sb=new StringBuffer(s1);
		String reverse=sb.reverse().toString();
		System.out.println(reverse);
		String rev="";
		for( int i=reverse.length()-1;i>=0;i--) {
			rev=rev+reverse.charAt(i);
		}
		System.out.println(rev);
	}

}
