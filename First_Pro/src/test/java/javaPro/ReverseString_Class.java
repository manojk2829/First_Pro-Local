package javaPro;

public class ReverseString_Class {
	public static void main(String[] args) {
		revers_the_string("manoj Kushwaha");
		revers_the_string_without_reverseMethod("manoj Kushwaha");
	}
	
	public static void revers_the_string(String str) {
	StringBuffer sb=new StringBuffer(str);
	System.out.println(sb.reverse());
	}
	
	public static void revers_the_string_without_reverseMethod(String str) {		
		for(int i=str.length()-1;i>=0;i--) {
			char c=str.charAt(i);
			System.out.print(c);
		}
		  
	}    
}
