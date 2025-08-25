package day_8_Arrays;

import java.util.Arrays;

public class Interview_Arrays {
	
	public static void main(String[] args) {
		duplicate_number_from_Arrays();
	
		second_hightest_without_SortingMethod();
		System.out.println("**************************");
		min_max_with_sorting_method();
		second_hightest();
		min_max_without_sorting();
		
	}
	
	public static void duplicate_number_from_Arrays() {
		int a[]= {4,34,55,3,456,3,1,3,55};
        for(int i=0;i<a.length;i++) {
        	for(int j=i+1;j<a.length;j++) {
        		if(a[i]==a[j]) {
        			System.out.print(a[i]+", ");
        		}
        	}
        }
        System.out.println();
	}
	
	
	public static void min_max_with_sorting_method() {
		int a[]= {4,34,55,3,456,3,1};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int min=a[0];
		int max=a[a.length-1];
		System.out.println(min + " >>>>  "+max);
	}
	
	public static void min_max_without_sorting() {
		int a[]= {4,34,55,3,456,3,1};
		int min=a[0],max=a[0];
		for(int num:a) {
			if(num>max) max=num;
			if(num<min) min=num;
		}
		System.out.println(min+" >>> " +max);
	}

	
	public static void second_hightest() {
		int a[]= {4,34,55,3,456,3,1};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int sec=a[a.length-2];
		System.out.println(sec);
	}
	
	
	public static void second_hightest_without_SortingMethod() {
		int a[]= {4,34,55,3,456,3,1};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int first=Integer.MIN_VALUE;
		int sec=Integer.MIN_VALUE;
		
		for(int num:a) {
			if(num>first) {
				sec=first;
				first=num;
			}else if(num >sec && num<first) {
				sec=num;
			}
		}
		System.out.println(sec);
	}

}
