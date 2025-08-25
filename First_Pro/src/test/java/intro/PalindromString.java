package intro;

public class PalindromString {

	public static void main(String[] args) {
		palindromMethod("madam");
		palindromMethod("Jahaj");
		palindromMethod("Jaahaj");

	}
	
    public static void palindromMethod(String str) {
    	String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		if(reverse.toLowerCase().equals(str.toLowerCase())) {
			System.out.println(str + " is Palindrom");
		}else {
			System.out.println(str +" is not Palindrom");
		}
	}

}
