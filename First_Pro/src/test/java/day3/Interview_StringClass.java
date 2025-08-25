package day3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class Interview_StringClass {
	
	@Test
	public void test() {
		total_vo_con_in_String();
		duplicate_Char_from_string();
		duplicate_String_from_string();
		longest_Word();
		Char_occurance_Each();
		vovel_occurance_Each();
		conso_occurance_Each();
		String_campare();
		reverse_number();
		
	}
	
	
	public void total_vo_con_in_String() {
		String s="manoj kushwaha manoj kushwaha automation";
	    int vo=0,co=0;
	    for(char c:s.toCharArray()) {
	    	if("aeiou".indexOf(c)!=-1) {
	    		vo++;
	    	}else {
	    		co++;
	    	}
	    }
	    System.out.println(vo);
	    System.out.println(co);
	}
	

	public void duplicate_String_from_string() {
		String s="manoj kushwaha manoj kushwaha automation";
	    Set<String> set=new LinkedHashSet<>();
	    StringBuffer result=new StringBuffer();
		for(String s1:s.split(" ")) {
			set.add(s1);
		}
		for(String c:set) {
			result.append(c).append(" ");
		}
		System.out.println(result);
	}
	
	public void duplicate_Char_from_string() {
		String s="manoj kushwaha automation";
	    Set<Character> set=new LinkedHashSet<Character>();
	    StringBuffer result=new StringBuffer();
		for(char c:s.toCharArray()) {
			set.add(c);
		}
		for(char c:set) {
			result.append(c);
		}
		System.out.println(result);
	}
	
	
	public void longest_Word() {
		String s="manoj kushwaha automation";
		String l="";
	    String words[]=s.split(" ");
	    for(String word:words) {
		if(word.length()>l.length()) {
			l=word;
		  }
		}
		System.out.println(l);
	}
	
	public void Char_occurance_Each() {
		String s="manoj kushwaha automation";
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		for(char c:s.toCharArray()) {
			m.put(c, m.getOrDefault(c, 0)+1);
		}
		System.out.println(m);
	}
	
	public void vovel_occurance_Each() {
		String s="manoj kushwaha automation";
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		for(char c:s.toCharArray()) {
			if("aeiou".indexOf(c)!=-1) {
			m.put(c, m.getOrDefault(c, 0)+1);
			}
		}
		System.out.println(m);
	}
	
	public void conso_occurance_Each() {
		String s="manoj kushwaha automation";
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		for(char c:s.toCharArray()) {
			if("aeiou ".indexOf(c)==-1) {
			m.put(c, m.getOrDefault(c, 0)+1);
			}
		}
		System.out.println(m);
	}
	
	public void String_campare() {
		String s1="team";
		String s2="mate";
		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		System.out.println(Arrays.equals(a1, a2)?"A":"not");
	}
	
	public void reverse_number() {
		int n=234;
		int digit=0,rev=0;
		while(n!=0) {
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		System.out.println(rev);
		
		String r=String.valueOf(rev);
        StringBuffer sb=new StringBuffer(r);
		System.out.println(sb.reverse().toString());
	}
	

}
