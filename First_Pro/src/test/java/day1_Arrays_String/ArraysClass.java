package day1_Arrays_String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ArraysClass {

	 public static void main(String[] args) {
		 second_hightest_nuumber();
		 sortingArrays();
		 remove_Duplicate_String();
		 remove_Duplicate_CharOccurance();
		 eachCharOccurance();
		 StringLongestWords();
		 sorting_the_Arrays();
		 minMax();
		 duplicateNumber();
	        
	}
	 
	 public static void second_hightest_nuumber() {
		 int[] arr = {101, 5, 78, 3, 5,10}; 
		 int first=Integer.MIN_VALUE;
		 int sec=Integer.MIN_VALUE;
		 for(int num:arr) {
			 if(num>first) {
				 sec=first;
				 first=num;
			 }else if(num>sec && num<first) {
				 sec=num;
			 }
		 }
		 System.out.println(sec);
		 
	 }
	 
	 
	 public static void sortingArrays() {
		 int[] arr = {101, 5, 78, 3, 5,10}; 
		 Arrays.sort(arr);
		 System.out.println(Arrays.toString(arr));
		 
	 }
	 
	 
	 public static void remove_Duplicate_String() {
			String s="manoj kushwaha eng manoj eng";
			Set<String> set=new LinkedHashSet<String>();
			StringBuffer sb=new StringBuffer();
			for(String c:s.split(" ")) {
			   set.add(c);
			}
			for(String c:set) {
				sb.append(c).append(" ");
		   }
			System.out.println(sb);
		 }
	 
	 public static void remove_Duplicate_CharOccurance() {
			String s="manoj kushwaha eng";
			Set<Character> set=new LinkedHashSet<Character>();
			StringBuffer sb=new StringBuffer();
			for(char c:s.toCharArray()) {
			   set.add(c);
			}
			for(char c:set) {
				sb.append(c);
		   }
			System.out.println(sb);
		 }
	 
	 public static void eachCharOccurance() {
			String s="manoj kushwaha eng";
			Map<Character,Integer> ma=new HashMap<Character,Integer>();
			for(char c:s.toCharArray()) {
				if("aeiou".indexOf(c)!=-1) {
				ma.put(c, ma.getOrDefault(c, 0)+1);
			}
		   }
			System.out.println(ma);
		 }
	 
	 public static void StringLongestWords() {
		String s="manoj kushwaha eng";
		String lo="";
		String[] words=s.split(" ");
		for(String wo:words) {
			if(wo.length()>lo.length()) {
				lo=wo;
			}
		}
		System.out.println(lo);
	 }
	 
	 
	 public static void duplicateNumber() {
		 int[] arr = {101, 5, 78, 3, 5,10}; 
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	 }
	 
	 
	 public static void minMax() {
		 int[] arr = {101, 5, 78, 3, 425,10}; 
		 int min=arr[0];
		 int max=arr[0];
		 
		 for(int num:arr) {
			 if(num>max) max=num;
			 if(num<min) min=num;
		 }
		 System.out.println(min);
		 System.out.println(max);
	 }
	 
	 
	 public static void sorting_the_Arrays() {
		 int[] arr = {10, 5, 78, 3, 45,10};
	     Arrays.sort(arr);
	     System.out.println(Arrays.toString(arr));
	 }
	 
	 public static void min_n_max_arrays_number() {
		 int[] arr = {10, 5, 78, 3, 45,10};
	        int max=arr[0];
	        int min=arr[0];
	        for(int a:arr) {
	        	if(a>max)
	        		max=a;
	        	if(a<min)
	        		min=a;
	        }	        
	        System.out.println("Max: " + max);
	        System.out.println("Min: " + min);
	    
	 }
	 
	 public static void duplicate_arrays_number() {
		 int[] arr = {10, 5, 78,5,78, 3, 45,10};
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]==arr[j]) {
					 System.out.print(arr[i]+", ");
				 }
			 }
		 }	            
	 }
	 
	 
	 
	 
}
