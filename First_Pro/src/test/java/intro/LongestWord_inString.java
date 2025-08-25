package intro;

import java.util.HashMap;

import org.testng.annotations.Test;

public class LongestWord_inString {

	@Test
	public void test() {
		longestWord("manoj kushwaha 123");
		String rrrr= removeDuplicate_Char_inString("manoj kushwaha 123");
		System.out.println(rrrr);
	}
	
	public void longestWord(String str) {
		String words[]=str.split(" ");
		String longest="";
		for(String word:words) {
			if(word.length()>longest.length()) {
				longest=word;
			}
		}
		System.out.println(longest);			
	}
	
	
	public String removeDuplicate_Char_inString(String str) {
		HashMap<Character, Boolean> hm=new HashMap<Character, Boolean>();
		StringBuffer result=new StringBuffer();
		for(Character ch:str.toCharArray()) {
			if(!hm.containsKey(ch)) {
				hm.put(ch, true);
				result.append(ch);
			}
		}
		return result.toString();
		
	}
}
