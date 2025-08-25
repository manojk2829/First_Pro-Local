package javaPro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InterviewProClass {

	public static void main(String[] args) {
		upperandLowerCase();
		occurance_Char1();
		totalUpper_and_lower_CharacterCount();
		//test();
		//eachVovelCount("manoj is selenium automaiton engineer");
		/*
		int a=10;
		String s=String.valueOf(a);
		System.out.println(s+20);
		
		int ss=Integer.parseInt(s+20);

		System.out.println(ss+20);
		
		
		
		countString("Viraj kushwaha");
		converString_in_flote();
		sortArray();
		UpperandLoverCase_char_count();
		
		convert_String_to_Integer_and_Integer_to_String();
		removeDuplicate_Word("manoj kushwaha is an automation23 is Engineer ");
		totalVovel("manoj kushwaha is an automation23 is Engineer ");
		total_occurance_of_Vovel("manoj kushwaha is an automation23 is Engineer ");
		CharacterCount("Manoj Kushwaha");
		
		without_If_Elese_Find_the_Largest_number(30,112);
		
		
		
		//count_total_Vovel_in_String("manj kushwaha");
		//longest_word("manoj is selenium12345 automaiton engineer");
		//System.out.println();
		//reverseString_by_forLoop("manoj kushwaha");
		//eachVovel_inString("manoj is selenium automaiton engineer");
		
		each_Character_inString("manoj kushwaha");
		//total_vovel_Count_in_String("manoj is selenium automaiton engineer");
		//total_Character_in_String("manoj kushwaha");
		//remove_Duplicate_Char_in_String("manoj kush waha");
		//reverse_Number(1234);
		//total_vovel_in_String("manoj kushwaha");
		remove_Duplicate_Char("Manoj kushwaha");
		String_to_Integer_reverse("987");
				
		Remove_Duplicate_Word_in_String1("manoj kushwaha manoj kushwaha");
		removeDuplicate_Char("manoj kushwaha manoj kushwaha");
		countStringChar("manoj kushwaha manoj kushwaha");
		*/
		
	}
	
	public static void upperandLowerCase() {
		String s="Manoj KKK Automation";
		int U=0,L=0;
		for(char c:s.toCharArray()) {
			if(Character.isUpperCase(c)) {
				U++;
			}else {
				L++;
			}
		}
		System.out.println(U +"  "+ L);
	}
	
	
	
	public static void occurance_Char1() {
		String s="manoj kushwaha automation";
	    Map<Character, Integer> result = new HashMap<>();
	    
	    for(int i = 0; i < s.length(); i++){
	        char ch = s.charAt(i);
	        if(ch=='a'||ch=='e'||ch=='u' || ch=='i'|| ch=='o') {
	        if(!result.containsKey(ch)){
	            result.put(ch, 1);
	        }
	        else{
	            int count = result.get(ch);
	            result.put(ch, count+1);
	          }
	    }
	   }
	    System.out.println(result);
	  }
	
	
	
	public static void test() {
		String a[]= {"viraj","manoj","sarita","mela manavi"};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	
	public static void sortArray() {
		int a[]= {2,4,1,5};
	    Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}	
	
	public static void countString(String s) {
		System.out.println(s.length());
	}
	
	public static void converString_in_flote() {
	   String s1 ="100.45";
	   String s2 ="100";
	   int n=Integer.parseInt(s2);
	   float f=Float.parseFloat(s1);
	   System.out.println(n +"   "+ f);
	}
	
	public static void maxNumber() {
		int a=10,b=20;
		int maxN=Math.max(a, b);
		System.out.println(maxN);
	}
	
	public static void UpperandLoverCase_char_count() {
		String s="Manoj Kushwaha Selenium Automation";
		int U=0;
		int L=0;
		
		for(Character ch:s.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				U++;
			}else if(Character.isLowerCase(ch)) {
				L++;
			}
		}
		
		System.out.println(U);
		System.out.println(L);
	}
	
	

	
	public static void  total_occurance_of_Vovel(String s) {
		s=s.toLowerCase();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		hm.put('a', 0);hm.put('e', 0);hm.put('i', 0);hm.put('o', 0);hm.put('u', 0);
	
		for(Character ch:s.toCharArray()) {
		   if(hm.containsKey(ch)) {
			   hm.put(ch, hm.get(ch)+1);
		   }
		}
		for(char v:hm.keySet()) {
			System.out.println(v+" >> " +hm.get(v));
		}
     }
	
	
	
	public static void  totalVovel(String s) {
		s=s.toLowerCase();
		int count=0;
		
		for(Character ch:s.toCharArray()) {
			if(ch.equals('a')||ch.equals('e')||ch.equals('i')||ch.equals('o')||ch.equals('u')) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	
	
	public static void  without_If_Elese_Find_the_Largest_number1(int a,int b) {
		int large = a>b?a:b;
		System.out.println(large);
	}
	
	
	public static void  convert_String_to_Integer_and_Integer_to_String() {
		String s="123";
		int s1=456;
		int intS=Integer.parseInt(s);
		int newInt=intS+s1;
		System.out.println(newInt);
		System.out.println(" ------------------------------ ");
		String newString =String.valueOf(newInt);
		StringBuffer sb=new StringBuffer(newString);
		String reverseString= sb.reverse().toString();
		System.out.println(reverseString);
		
		for(int i=reverseString.length()-1;i>=0;i--) {
			System.out.print(reverseString.charAt(i));
		}
		System.out.println();		
	}
	
	public static void  longestWord_in_sentance(String s) {
		s=s.toLowerCase();
		String[] words=s.split(" ");
 		String longest="";
		for(String word:words) {
			if(word.length()>longest.length()) {
				longest=word;
			}
		}
		System.out.println(longest);		
	}
	
	public static void  removeDuplicate_Word(String s) {
		s=s.toLowerCase();
		String[] words=s.split(" ");
		HashMap<String, Boolean> hm=new HashMap<String, Boolean>();
		StringBuffer result=new StringBuffer();
		for(String word:words) {
		if(!hm.containsKey(word)) {
			hm.put(word, true);
			result.append(word).append(" ");
		}
	} 
		System.out.println(result);
	
	}
	
	public static void  removeDuplicate_Char(String s) {
		s=s.toLowerCase();
		HashMap<Character, Boolean> hm=new HashMap<Character, Boolean>();
		StringBuffer result=new StringBuffer();
		for(Character ch:s.toCharArray()) {
		if(!hm.containsKey(ch)) {
			hm.put(ch, true);
			result.append(ch);//.append(" ");
		}
	} 
		System.out.println(result);
	
	}
	
	public static void countStringChar(String s) {
		s=s.toLowerCase();
		System.out.println(s.length());
		
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();		
		for(Character ch:s.toCharArray()) {
		if(hm.containsKey(ch)) {
			hm.put(ch,hm.get(ch)+1);
		}else {
			hm.put(ch, 1);
	} 
		}System.out.println(hm);
	
	}
	
	
	
	
	public static void CharacterCount(String str) {
		int upperCount = 0;
	        int lowerCount = 0;

	        for (char ch : str.toCharArray()) {
	            if (Character.isUpperCase(ch)) {
	                upperCount++;
	            } else if (Character.isLowerCase(ch)) {
	                lowerCount++;
	            }
	        }

	        System.out.println("Uppercase letters count: " + upperCount);
	        System.out.println("Lowercase letters count: " + lowerCount);
	    }
	
	
	
	
	public static void  without_If_Elese_Find_the_Largest_number(int a,int b) {
		int larg=a>b?a:b;
		System.out.println(larg);
	}
	
	public static void  totalUpper_and_lower_CharacterCount() {
       String str="MaaaanojKUshwaha";
       int u=0;
       int l=0;
       for(Character ch:str.toCharArray()) {
    	   if(ch>='A' && ch<='Z') {
    		   u++;
    	   }else {
    		   l++;
    	   }
       }
      
       System.out.println("U --> " + u+"  ");
       System.out.println("L --> " + l+"  ");
	}
	
	public static void  Remove_Duplicate_Word_in_String1(String str) {
		str=str.toLowerCase();
		String words[]=str.split(" ");
		HashMap<String, Boolean> hm=new HashMap<String, Boolean>();
		StringBuffer result=new StringBuffer();
		for(String word:words) {
			if(!hm.containsKey(word)) {
				hm.put(word, true);
				result.append(word).append(" ");
			}
		}
		System.out.println(result);
	}
	
	public static void remove_Duplicate_Char(String str) {
		str=str.toLowerCase();
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
	
	

	public static void String_to_Integer_reverse(String str) {
		int in=Integer.parseInt(str);
		System.out.println(in);
		System.out.println(153+in);
		
		int digit=0,rev=0;
		while(in!=0) {
			digit=in%10;
			rev=rev*10+digit;
			in=in/10;
		}
		System.out.println(rev);
		String reeee=String.valueOf(rev);
		System.out.println(reeee+345);
	}
	
	public static void occurance_Char() {
		String s="manoj kushwaha automation";
	    Map<Character, Integer> result = new HashMap<>();
	    
	    for(int i = 0; i < s.length(); i++){
	        char ch = s.charAt(i);
	        if(!result.containsKey(ch)){
	            result.put(ch, 1);
	        }
	        else{
	            int count = result.get(ch);
	            result.put(ch, count+1);
	        }
	    }
	    System.out.println(result);
	  }
	
	
	
	public static void test(String str) {
		StringBuffer sb=new StringBuffer(str);
		String reversedString=sb.reverse().toString();
		System.out.println(reversedString);
		System.out.println();
		for(int i=reversedString.length()-1;i>=0;i--) {
			System.out.print(reversedString.charAt(i)+"");
		}
		System.out.println();
	}
	
	public static void each_char(String str) {
		//Count each char;
		str=str.toLowerCase();		
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();		
		for(Character ch:str.toCharArray()) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch,1);
			}
		}System.out.println(hm);	
	}
	
	
	
	
	//How to find longest word in given string/Sentence
	public static void longest_word(String s) {
		String w[]=s.split(" ");
		String len="";
		for(String word:w) {
			if(word.length()>len.length()) {
				len=word;
			}
		}
		System.out.println(len);
	}
	
	public static void eachVovelCount(String s) {
		s=s.toLowerCase();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		hm.put('a', 0);
		hm.put('e', 0);
		hm.put('i', 0);
		hm.put('o', 0);
		hm.put('u', 0);
		for(Character c:s.toCharArray()) {
		if(hm.containsKey(c)) {
			hm.put(c, hm.get(c)+1);
			
		}
	  }
		for(char v:hm.keySet()) {
			System.out.println(v+"--> " + hm.get(v));
		}
	}
	
	public static void count_total_Vovel_in_String(String s) {
		int count=0;
		for(Character c:s.toCharArray()) {
			if(c.equals('a')||c.equals('e')||c.equals('i')||c.equals('o')||c.equals('u')) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void longestWord(String s) {
		String words[]=s.split(" ");
		String longest="";
		for(String word:words) {
			if(word.length()>longest.length()) {
				longest=word;
			}
		}
		System.out.println(longest);
	}
	
	public static void reverseString(String s) {		
		String revered=new StringBuffer().reverse().toString();
		System.out.println(revered);
	}
	
	public static void reverseString_by_forLoop(String s) {
		int l=s.length();
		for(int i=l-1;i>=0;i--) {
			s.charAt(i);
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
	
	public static void reverse_Number(int num) {
       int rev=0;
       while(num!=0) {
    	   int digit=num%10;
    	   rev=rev*10+digit;
    	   num=num/10;
       }
       System.out.println(rev);
	}
	
	public static void each_Character_inString(String s) {
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(Character c:s.toCharArray()) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
			System.out.println(s+"  --> " + hm);
	}
	
	public static void total_Character_in_String(String s) {
		int count=0;		
		for(Character c:s.toCharArray()) {
          count++;
		}
		System.out.println(count);		
		// OR		
		System.out.println(s.length());
	}
	
	
	public static void total_vovel_Count_in_String(String s) {
		int count=0;
		for(Character c:s.toCharArray()) {
			if(c.equals('a')||c.equals('o')||c.equals('e')||c.equals('i')||c.equals('u')) {
				count++;
			}			
		}	System.out.println(count);	
	}
	
	public static void Remove_Duplicate_Char_in_String(String s) {
		HashMap<Character, Boolean> hm=new HashMap<Character, Boolean>();
		StringBuffer result=new StringBuffer();
		for(Character c:s.toCharArray()) {
			if(!hm.containsKey(c)) {
				hm.put(c, true);
				result.append(c);
			}		
		}
			System.out.println(result);
	}
	
	public static void Remove_Duplicate_Word_in_String(String s) {
		String words[]=s.split(" ");
		HashMap<String, Boolean> hm=new HashMap<String, Boolean>();
		StringBuffer result=new StringBuffer();
		for(String str:words) {
			if(!hm.containsKey(str)) {
				hm.put(str, true);
				result.append(str);
			}		
		}
			System.out.println(result);
	}
	
	
	public static void eachVovel_inString(String s) {
		s=s.toLowerCase();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		hm.put('a', 0);
		hm.put('e', 0);
		hm.put('i', 0);
		hm.put('o', 0);
		hm.put('u', 0);
		for(Character c:s.toCharArray()) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
		}
		for(char v:hm.keySet()) {
			System.out.println(v+"  --> " + hm.get(v));
		}		
	}
	
	
	
	
	
	

}
