package javaPro;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class Sister_Interview {
	
	@Test(priority = -1)
	public void dataTypeChange() {
	int a=10;
	String AString=String.valueOf(a);
	String totalString=AString+10;
	System.out.println(totalString);
	System.out.println();
	int AAInt=Integer.parseInt(totalString);
	System.out.println(AAInt+10);
	System.out.println();	
	System.out.println(a+10);
				
	}

	
	//@Test(priority = -1)
		public void without_if_else() {
		int a=10,b=20;
		int mathVar=Math.max(a, b);
		System.out.println(mathVar);
		int maxVariable=a>b?a:b;
		System.out.println(maxVariable);					
		}
	
	
	//@Test(priority = 6)
	public void count_vovel_Consonent_space_SpecialChar() {
		String s="manoj sarita Manavi #&&$%^&$%*&ha";
		int withSpecial_char_totalCount=s.length();
		int without_special_charCount=s.replaceAll("[^a-zA-Z0-9 ]", "").length();
		int specialCharCount=withSpecial_char_totalCount-without_special_charCount;
		
		System.out.println();
		
		String without_special_charCount_withSpacp=s.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println();
		System.out.println("Removing special Character from string.....");
		System.out.println();
		System.out.println(" special Character Count >>>>> "+specialCharCount);
		
		System.out.println();
		System.out.println(s.length());
		
		int withSpac=without_special_charCount_withSpacp.length();
		int withoutSpacLength=without_special_charCount_withSpacp.replace(" ", "").length();
		System.out.println("Manavi Going to check Space Character count >>> " + (withSpac-withoutSpacLength) );
	    System.out.println();
		System.out.println("Total Count of character >> "+s.length());
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(Character ch:s.toCharArray()) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);	
		System.out.println();
		System.out.println("###########################");
		
	}
	
	@Test(priority = 1)
	public void countChar() {
		String s="manoj sarita kushwa#$%^&$%*&ha";
		System.out.println("Removing special Character from string.....");
		System.out.println();
		String rep=s.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(rep);
		
		System.out.println("Total Count of character >> "+s.length());
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(Character ch:s.toCharArray()) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);	
		System.out.println();
		System.out.println("###########################");
		
	}
	
	@Test(priority = 2)
	public void mapMethod() {
		Map<String, String> map=new HashMap<String, String>();
		map.put("1", "001");
		map.put("name", "manoj");
		map.put("age", "31");
		map.put("dept", "IT");
		
		System.out.println(map.containsKey("dept"));
		System.out.println(map);
		System.out.println(map.keySet());
		
		System.out.println(map.values());
		System.out.println(map.get("name"));
		System.out.print(false);
		System.out.println();
		System.out.println("###########################");
	}
	

	@Test(priority = 5)
	public void count_total_Words_in_string_forLoop() {
		String s="java multi purpose language manoj kushwaha";
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println();
		System.out.println("###########################");
		
	}
	
	@Test(priority = 3)
	public void count_Char_Occurance() {
		String s="java is a multi purpose language";
		int allStringLength=s.length();
		System.out.println(allStringLength);
		int withoutA_char_count=s.replace("a","").length();
		int countOf_A=allStringLength-withoutA_char_count;
		System.out.println(countOf_A);
		System.out.println();
		System.out.println("###########################");
		
	}

	@Test(priority = 4)
	public void count_total_Words_in_string() {
		String s="java is multi purpose language";
		int allStringLength=s.length();
		System.out.println(allStringLength);
		int withoutA_char_count=s.replace(" ","").length();
		int countOf_A=allStringLength-withoutA_char_count;
		System.out.println(countOf_A+1);
		System.out.println();
		System.out.println("###########################");
		
	}
}
