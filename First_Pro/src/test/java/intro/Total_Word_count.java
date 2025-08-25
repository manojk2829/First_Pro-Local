package intro;

import org.testng.annotations.Test;

public class Total_Word_count {
	
	@Test
	public void testCOunt_Words() {
		String s="manoj kuhaah sarita selenium";
		int count=1;
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println(count);
		
		String s1[]=s.split(" ");
		int wordscount= s1.length;
		System.out.println(wordscount);
	}

}
