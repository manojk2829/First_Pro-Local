package day_5_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListConcept {
	
	public static void main(String[] args) {
		Linkedlist_Method();
		//list_Method();
  
	}
	
	public static void list_Method() {
		List<Object> l=new ArrayList<>();
		
		l.add(1);
		l.add("Manoj");
		l.add("sarita");
		l.add("Sarita");
		l.add(true);
		l.add("Kushwaha");
		l.add('A');
		l.add('a');
		l.add('A');
		l.addLast("WebDriver");
		l.addFirst("Selenium");
		
		System.out.println("********************************************");
		System.out.println(l);
		System.out.println("********************************************");
		
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		
		System.out.println("Boolean value -- > " + l.contains(true));
		System.out.println("Boolean value -- > " + l.contains("Kushwaha"));
		System.out.println();
		l.add(2,"Manavi");
		System.out.println(l);
		l.set(2, "Viraj");
		System.out.println(l.size());
		System.out.println();
		System.out.println(l);
		System.out.println(l.size());
		l.remove(9);
		System.out.println(l.size());

		l.clear();
		boolean list_Flag=l.isEmpty();
		System.out.println(list_Flag);
		

		l.add("Sarita");
		l.add(true);
		l.add("Kushwaha");
		l.add('A');
		l.add('a');
		l.add('A');
		//
	
		
		System.out.println();
		l.set(2, "Viraj");
		System.out.println();
		System.out.println(l);

		for(Object o:l) {
			System.out.print(o+",");
		}
	}
		
		
		public static void Linkedlist_Method() {
			List<Object> l=new LinkedList<>();

			l.add(1);
			l.add("Manoj");
			l.add("sarita");
			l.add("Sarita");
			l.add(3,"Manoj");
			l.add(4,"Viraj");
			l.add(true);		
			System.out.println();
			l.set(2, "Viraj");
			System.out.println();
			System.out.println(l);	
			System.out.println(l.indexOf("Manoj"));
			System.out.println(l.lastIndexOf("Manoj"));
			System.out.println(l.indexOf("Viraj"));			
			System.out.println(l.lastIndexOf("Viraj"));
			l.addFirst("Selenium");
			l.addLast("WebDriver");
			System.out.println(l);
			
			LinkedList<String> linkedList = new LinkedList<>();
	        linkedList.addFirst("Pineapple");
	        linkedList.addLast("Grapes");
	        System.out.println("\nLinkedList: " + linkedList);
	        linkedList.removeFirst();
	        linkedList.removeLast();
	        System.out.println("After removeFirst & removeLast: " + linkedList);
			
	}

}



