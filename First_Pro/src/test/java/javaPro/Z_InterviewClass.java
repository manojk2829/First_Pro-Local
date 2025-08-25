package javaPro;

import java.util.Arrays;
import java.util.HashMap;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Z_InterviewClass {
	
	public static void main(String[] args) {
		larger_smaller();
		reverseString("manoj");
		System.out.println("------------------");
		reverseIntegerValue(1234);
		replace_all_Junk_CharFrom_String("!#!@$%#^%3546$^&%&*Sari%$*4564ta &%&* Manoj()(*&");
		largest_and_smallestNumber1();
		swapping();
		swapping_String();
		longestWord();
		total_Vovel("manoj kushwaha automation engineer");
		each_vovel_count("automation is engineer");
	}
	
	public static void larger_smaller() {
		int a[]= {5,3,10,6,2};
		int l=a[0];
		int s=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>l) {
				l=a[i];
			}else if(a[i]<s) {
				s=a[i];
			}
		}
		System.out.println("Small >> "+ s+" large >> "+l);
		
	}
	
	
	public static void reverseIntegerValue(int num) {
		  int rev=0;
		  while(num!=0) {
             rev=rev*10+num%10;
             num=num/10;
		  }
		  System.out.println(rev);
		  String rev1=String.valueOf(rev);
		  StringBuffer reverse= new StringBuffer(rev1);
		  System.out.println(reverse.reverse());
	}
	
	
	
	
	public static void reverseString(String s) {
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
		System.out.println("------------------");
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i)+"");
		}
	}
	
	public static void reverseInt(int num) {
		  int digit=0;
		  int rev=0;
		  while(num!=0) {
		  digit=num%10;
		  rev=rev*10+digit;
		  num=num/10;
		  }
		  System.out.println(rev);
	}
	
	public static void reverseInteger(int num) {
		long l=123456;
		System.out.println(new StringBuffer(String.valueOf(l)).reverse());
    }
	
	public static void replace_all_Junk_CharFrom_String(String s) {
		String reString=s.replaceAll("[^a-zA-Z]", "");
		System.out.println(reString);
	}
	
	public static void largest_and_smallestNumber() {
		int num[]= {34,1,4,5,7,10,40,12,-3,200};
		int larg=num[0];
		int small=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>larg) {
				larg=num[i];
			}
			else if(num[i]<small) {
				small=num[i];
			}
		}
		System.out.println(Arrays.toString(num));
		System.out.println("Small >> " + small);
		System.out.println("Larg  >> " + larg);
	}
	
	public static void swapping() {
		int a=10,b=20;
		a=a+b; //30
		b=a-b; // 30-20=10
		a=a-b; // 30-10=20
		System.out.println(a +"  >>>  " + b);
	}
	
	
	public static void largest_and_smallestNumber1(){
	   int n[]= {4,2,1,6,3};
	   int l=n[0];
	   int s=n[0];
	   for(int i=0;i<n.length;i++) {
		   if(n[i]>l) {
			   l=n[i];
		   }else if(n[i]<s) {
			   s=n[i];
		   }
	   }
	   System.out.println("Small >> " + s);
	   System.out.println("Large >> " + l);
	}
	
	public static void swapping_String() {
		String str1= "manoj";
		String str2= "kushwaha";
		str1=str1+str2;
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length());		
	
		System.out.println(str1 +"  >>>  " );
		System.out.println(str2 +"  >>>  " );
	}
	
	public static void longestWord() {
		String s="manoj kushwaha is an Autoengineer";
		String words[]=s.split(" ");
		String longest="";
		for(String word:words) {
			if(word.length()>longest.length()) {
			longest=word;
		}
			}
		System.out.println(longest);
	}
	
	 
	   public static void total_Vovel(String str) {
	    str=str.toLowerCase();
	    int count=0;
	    char[] c=str.toCharArray();
	    for(Character ch:c) {
	    	if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') {
	    		count++;
	    	}
	    }
	    System.out.println(count);
	}
	   
	   public static void each_char_count(String str) {
		    str=str.toLowerCase();
		    HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		    for(Character ch:str.toCharArray()) {
		    	if(hm.containsKey(ch)) {
		    		hm.put(ch, hm.get(ch)+1);
		    	}else {
		    		hm.put(ch, 1);
		    	}		    	
		    }
		    System.out.println(str+" >> " + hm);
		}
	   
	   public static void each_vovel_count(String str) {
		    str=str.toLowerCase();
		    HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		    hm.put('a', 0);hm.put('e', 0);hm.put('i', 0);hm.put('o', 0);hm.put('u', 0);
		    for(Character ch:str.toCharArray()) {
		    	if(hm.containsKey(ch)) {
		    		hm.put(ch, hm.get(ch)+1);
		    	}		    	
		    }
		    for(char v:hm.keySet()) {
		    	System.out.println(v+" >> " + hm.get(v));
		     }
		    
		    
		}	
		
	
	
	
}