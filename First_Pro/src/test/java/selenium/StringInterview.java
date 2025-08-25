package selenium;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class StringInterview {
	
	
	@Test
	public void newtest() {
		String s="Manoj Kushwaha Automation";
		String len="";
		String words[]=s.split(" ");
		for(String w:words) {
			if(w.length()>len.length()) {
				len=w;
			}
		}
		System.out.println(len);
		System.out.println(" ------------------- Viraj ----------------- ");
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		StringBuffer sb=new StringBuffer();
		for(char c:s.toCharArray()) {
			set.add(c);
		}
		for(char c: set) {
			sb.append(c);
		}
		System.out.println(sb);
		
		System.out.println(" ------------------- Viraj ----------------- ");
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c:s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
		
		System.out.println(" ------------------- Viraj ----------------- ");
		
		HashMap<Character,Integer> vov=new HashMap<Character,Integer>();
		for(char c:s.toCharArray()) {
			if("aeiou".indexOf(c)!=-1) {
			vov.put(c, vov.getOrDefault(c, 0)+1);
		}
		}
		System.out.println(vov);
		
		System.out.println(" ------------------- Viraj ----------------- ");
		
		String str=s.toLowerCase();
		String vovel="";
		String conso="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' 
					|| str.charAt(i)=='o' || str.charAt(i)=='u') {
				vovel=vovel+" "+str.charAt(i);
			}else {
				conso=conso+" "+str.charAt(i);
			}
		}
		System.out.println(vovel);
		System.out.println(conso);	
		int cap=0, small=0;
		for(char c:s.toCharArray()) {
			if(c>='A' && c<='Z') {
				cap++;
			}else {
				small++;
			}
		}
		System.out.println(cap);
		System.out.println(small);
		
		int num=1234;
		int digit=0,rev=0;
		while(num!=0) {
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println(rev);
		String reverse=String.valueOf(rev);
		System.out.println("---------------------------------------");
 
		
		System.out.println(" ------------- Viraj ------------------");
		StringBuffer result=new StringBuffer(reverse);
		String re=result.reverse().toString();
		System.out.println(re);
		
		int revNum=Integer.parseInt(re);
		System.out.println(revNum+200);
		
		
		String remove="@#$%^#$&Manoj Kushwaha 2wew435232";
		
		String newRev=remove.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(newRev);
		
	}
	
	@Test(priority = 1)
	public void testString() {
		String sss="manoj manoj kushwaha kushwaha";
		String words[]=sss.split(" ");
	
    Set<String> set=new LinkedHashSet<String>();
    for(String c:words){
        set.add(c);
    }
    StringBuffer result=new StringBuffer();
    for(String c:set){
        result.append(c).append(" ");
    }
     System.out.println("------Sarita Kushwaha-------");
    System.out.println(result);
    System.out.println("------Sarita Kushwaha End-------");
	
	}
	
	@Test(priority = 1)
	public void test1() {
		String s = "manoj kushwaha";
		String[] words = s.split(" ");
		String lon = "";
		for (String w : words) {
			if (w.length() > lon.length()) {
				lon = w;
			}
		}
		System.out.println(lon);
	}

	@Test(priority = 2)
	public void test2() {
		String s = "manoj kushwaha";
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			m.put(c, m.getOrDefault(c, 0) + 1);
		}
		System.out.println(m);
	}

	@Test(priority = 3)
	public void test3() {
		String s = "manoj kushwaha";
		int con = 0;
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		char[] b = s.toCharArray();
		for (char c : b) {
			if ("aeiou".indexOf(c) != -1) {
				m.put(c, m.getOrDefault(c, 0) + 1);
				con++;
			}
		}
		System.out.println(m);
		System.out.println(con);
	}

	@Test(priority = 4)
	public void test4() {
		String s = "manoj kushwaha";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		StringBuffer sb = new StringBuffer();
		for (char c : s.toCharArray()) {
			set.add(c);
		}
		for (char c : set) {
			sb.append(c);
		}
		System.out.println(sb);
	}

	@Test(priority = 5)
	public void test5() {
		String s = "manoj kushwaha";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse().toString());
		System.out.println("-----------------------------------");
		String newString = sb.toString();
		System.out.println(newString);

		for (int i = newString.length() - 1; i >= 0; i--) {
			System.out.print(newString.charAt(i));
		}
		System.out.println();

	}

	@Test(priority = 6)
	public void test6() {
		int n = 12321;
		int o = n;
		int digit = 0, rev = 0;
		while (n != 0) {
			digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		System.out.println(rev);
		if (rev == o) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Not");
		}
	}

	@Test(priority = 7)
	public void test7() {
		int n = 100;
		String num = String.valueOf(n);
		System.out.println(num + 100);
		int number = Integer.parseInt(num);
		System.out.println(number + 100);
	}

	@Test(priority = 8)
	public void test8() {
		String s = "Manoj Kushwaha Manoj Sarita Kushwaha Manavi Kushwaha";
		String words[] = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		StringBuffer result = new StringBuffer();
		for (String c : words) {
			set.add(c);
		}
		for (String c : set) {
			result.append(c).append(" ");
		}

		System.out.println(result);
	}

	@Test(priority = 9)
	public void test9() {
		String str = "Manoj Kushwaha Automation Engineer";
		String s = str.toLowerCase();
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();

		for (char c : s.toCharArray()) {
			if ("aeiou".indexOf(c) != -1) {
				m.put(c, m.getOrDefault(c, 0) + 1);
			}
		}
		System.out.println(s + " >>> " + m);

		for (char c : s.toCharArray()) {
			if ("aeiou".indexOf(c) == -1) {
				m.put(c, m.getOrDefault(c, 0) + 1);
			}
		}
		System.out.println(s + " >>> " + m);
	}

	@Test(priority = 11)
	public void test11() {
		String str = "Manoj Automation Engineer";
		String s = str.toLowerCase();
		String v = "";
		String con = "";
		for (char c : s.toCharArray()) {
			if ("aeiou".indexOf(c) != -1) {
				v += c + " ";
			} else {
				con += c + " ";
			}
		}
		System.out.println(v);
		System.out.println(con);
		int a = 0;
		a = str.length();

	}

	@Test(priority = 10)
	public void test10() {
		String str = "Manoj Automation Engineer";
		String s = str.toLowerCase();
		// HashMap<Character,Integer> m=new HashMap<Character,Integer>();

		String vowels = "";
		String consonants = "";

		for (char c : s.toCharArray()) {
			if ("aeiou".indexOf(c) != -1) {
				vowels += c + " ";
			} else {
				consonants += c + " ";
			}
		}
		System.out.println(vowels);
		System.out.println(consonants);
	}

}
