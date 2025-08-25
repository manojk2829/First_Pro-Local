package day_6_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConcept {
	
	public static void main(String[] args) {
		set_all_Classes();
	}
	
	public static void set_all_Classes() {
		
		Set<Object> s=new HashSet<>();
		s.add("Sarita");
		s.add("Manoj");
		s.add("Manavi");
		s.add(1);
		s.add('a');
		s.add("Sa");
		s.add(true);
		System.out.println("*************************");
		System.out.println(s);
		s.remove('a');
		
		System.out.println(s);
		System.out.println("**************************************");
		
		Set<Object> s1=new LinkedHashSet<>();
		s1.add("Sarita");
		s1.add("Manoj");
		s1.add("Manavi");
		s1.add(1);
		s1.add('a');
		s1.add("Manavi");
		s1.add("Sa");
		s1.add(true);
		System.out.println(s1);
		s1.remove('a');
		s1.addAll(s);
		System.out.println("**************************************");
		System.out.println(s1);
		System.out.println("**************************************");

				
		Set<Object> s2=new TreeSet<>();
		s2.add("Sarita");
		s2.add("Manoj");
		s2.add("Manavi");
		System.out.println(s2);

		
	}
}


