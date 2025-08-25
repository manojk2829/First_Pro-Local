package day_4_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {
	
	// Map is Interface
	
	public static void main(String[] args) {
		testMethod();
		//mapConcept_test();

		//hashMap_Concept();
		//treeMap_Concept();
		//linked_hashMap_Concept();
		
			
  }
	
	
	public static void testMethod() {
		Map<Integer, Object> m=new HashMap<>();
		m.put(1, "Manoj");
		m.put(2, 'a');
		m.put(5, "Viraj");
		m.put(4, 6);
		m.put(3, "Manavi");
		System.out.println(m);
		
		System.out.println(m.get(2));
		m.remove(2);
		System.out.println(m.containsKey(2));
		m.put(2, "Sarita");
		System.out.println(m);
		System.out.println(m.containsValue("Sarita"));
		m.clear();
		System.out.println(m.isEmpty());
		m.put(1, "Manoj");
		m.put(2, 'a');
		m.put(5, "Viraj");
		m.put(5, 6);
		m.put(3, "Manavi");
		
		for(Map.Entry<Integer,Object> e:m.entrySet()) {
			System.out.println(e.getKey()+" >>> "+ e.getValue());
		}
		System.out.println(m.size());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void hashMap_Concept() {
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "manoj");
		map.put(4, "viraj");
		map.put(2, "sarita");
		map.put(3, "manavi");
		System.out.println(map);
		
		System.out.println(map.get(2));
		
		map.remove(3);
		System.out.println(map);
		map.put(3, "MANAVI");
		
		System.out.println(map.containsKey(4));
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("Manavi"));
		System.out.println(map.containsValue("MANAVI"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.putIfAbsent(3,"Vijay"));
		System.out.println(map.putIfAbsent(5,"Sushila"));
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		
		for(Map.Entry<Integer, String> en:map.entrySet()) {
			System.out.println(en.getKey()+" >> "+ en.getValue());
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	}
	
	public static void treeMap_Concept() {
		Map<Integer, String> map=new TreeMap<>();
		map.put(1, "manoj");
		map.put(4, "viraj");
		map.put(2, "sarita");
		map.put(3, "manavi");
		System.out.println(map);		
		System.out.println(map.get(2));
		
		map.remove(3);
		System.out.println(map);
		map.put(3, "MANAVI");
		
		System.out.println(map.containsKey(4));
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("Manavi"));
		System.out.println(map.containsValue("MANAVI"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.putIfAbsent(3,"Vijay"));
		System.out.println(map.putIfAbsent(5,"Sushila"));
		
		for(Map.Entry<Integer, String> en:map.entrySet()) {
			System.out.println(en.getKey()+" >> "+ en.getValue());
		}
		System.out.println();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	}
	
	public static void linked_hashMap_Concept() {
		Map<Integer, String> map=new LinkedHashMap<>();
		map.put(1, "manoj");
		map.put(4, "viraj");
		map.put(2, "sarita");
		map.put(3, "manavi");
		System.out.println(map);		
		System.out.println(map.get(2));
		
		map.remove(3);
		System.out.println(map);
		map.put(3, "MANAVI");
		
		System.out.println(map.containsKey(4));
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("Manavi"));
		System.out.println(map.containsValue("MANAVI"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.putIfAbsent(3,"Vijay"));
		System.out.println(map.putIfAbsent(5,"Sushila"));
		
		for(Map.Entry<Integer, String> en:map.entrySet()) {
			System.out.println(en.getKey()+" >> "+ en.getValue());
		}
	}
	
	public static void mapConcept_test() {
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "Manoj");
		map.put(4, "Viraj");
		map.put(3, "Manavi");
		map.put(2, "Sarita");
		System.out.println(map);
		System.out.println(map.get(2));
		map.remove(2);
		System.out.println();
		System.out.println(map.containsKey(2));
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("Manavi"));
		
		System.out.println();
		map.put(2, "MANAVI");
		map.put(2, "Sarita");
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		for(Map.Entry<Integer, String> en:map.entrySet()) {
			System.out.println(en.getKey()+" --> " + en.getValue());
		}
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
