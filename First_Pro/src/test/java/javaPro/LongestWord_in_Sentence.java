package javaPro;

public class LongestWord_in_Sentence {

	public static void main(String[] args) {
		
		String s="I am an automation engineer working in PublicisSapient.";
	    String[] words=s.split(" ");
	    String longest="";
	    for(String word:words) {
	    	if(word.length()>longest.length()) {
	    		longest=word;
	    	}
	    }
	    System.out.println(longest);	
	}
	
public static void longest_String(String str) {
	String sentence = "Java is a powerful programming language";
	String[] words = sentence.split(" ");
	String longest = "";

	for (String word : words) {
	    if (word.length() > longest.length()) {
	        longest = word;
	    }
	}
	System.out.println("Longest word: " + longest);

}

}
