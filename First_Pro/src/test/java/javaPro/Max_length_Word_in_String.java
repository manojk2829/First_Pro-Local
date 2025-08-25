package javaPro;

public class Max_length_Word_in_String {

	public static void main(String[] args) {
		String str="I am an automation Selenium Engineer";
		String words[]=str.split(" ");
		String longest="";
		for(String word : words) {
			if(word.length()>longest.length()) {
				longest=word;
			}
		}
		System.out.println("Longest Word -- > " + longest);
	}
	
	

}
