package javaPro;

public class PalindromNumber {

	public static void main(String[] args) {
		String s="Madam";
		StringBuffer sb=new StringBuffer(s);
		String reverse=sb.reverse().toString();
		System.out.println("After eversing the number -- > "+reverse);
		if(reverse.toUpperCase().equals(s.toUpperCase())) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not palindrom");
		}
		
		reversingNumber("JAHAAJ");
	}
	
	public static void reversingNumber(String s1) {
		String s=s1;
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("After eversing the number -- > "+rev);
		if(rev.toUpperCase().equals(s.toUpperCase())) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not palindrom");
		}
	}

}
