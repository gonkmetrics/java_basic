package arrays1;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//binary search is a function used in searching arrays in java
		//1: the array should not contain duplicate values
		//2: the function counts from index = 0. i.e. smallest to largest
		//therefore, it takes more time the larger the array is
		
		//arrays not sorted in numerical order cannot be searched
		//therefore arr1.sort()
		int[] arr1 = {5,7,6,1,3,9,0,12};
		
		int a = Arrays.binarySearch(arr1,0);
		System.out.println(a);
		
		int[] arr2 = {1,4,6,8,11,14};
		System.out.println(Arrays.binarySearch(arr2,13));
		//returns the index of the first value greater than or equal to the key
		//
		//if the result is undefined or nonexistent, the return is -a.length(of key)-1
		//therefore if the value of a nonexistent key is "13", it only counts array
		//length until the last value before "13"
		//returns index of key = 3
		
		int[] arr3 = {0,2,4,6,8,10,12,14,16,18,20};
		int c = Arrays.binarySearch(arr3, 14);
		System.out.println(c);
		

	}

}
