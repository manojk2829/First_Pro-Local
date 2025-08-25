package day1_Arrays_String;

import java.util.Arrays;

public class ArraysPrograms {
	
	public static void main(String[] args) {
		second_largest_sort_method();
		second_with_duplicate();
		minMax();
		second_largest();
		second_largest_sort_method();
		first_and_last_number();
	}
	
	public static void second_with_duplicate() {
		int a[]= {4,5,2,6,1};
		int f=Integer.MIN_VALUE;
		int s=Integer.MIN_VALUE;
		for(int n:a) {
			if(n>f) {
				s=f;
				f=n;				
			}else if(n>s) {
				s=n;
			}
		}
		System.out.println(s);
	}
	
	
	public static void second_largest_sort_method() {
		System.out.println("((((((((((((((((((((((((((((((");
		int a[]= {4,15,12,16,11,7,0,7,0,70};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("((((((((((((((((((((((((((((((");
		System.out.println(a.length);
		Arrays.sort(a);
		int secondHightes=a[a.length-2];		
		System.out.println(secondHightes);		
		System.out.println("((((((((((((((((((((((((((((((");
	}
	
	public static void first_and_last_number() {
		int a[]= {4,5,2,6,8,10,50,32,1};
		Arrays.sort(a);
		int min=a[0];
		int max=a[a.length-1];
		System.out.println(min+"  >>> "+ max);		
	}	
	
	public static void minMax() {
		int a[]= {4,5,2,6,8,10,50,32,1};
		int min=a[0],max=a[0];
		for(int num:a) {
			if(num>max) max=num;
			if(num<min) min=num;
		}
		System.out.println(min);
		System.out.println(max);
	}
	
	public static void second_largest() {
		int a[]= {4,5,2,6,8,8,10,50,32,1};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int num:a) {
			if(num>first) {
				second=first;
				first=num;
			}else if(num>second && num<first) {
				second=num;
			}
		}		
		System.out.println(second);
	}

}
