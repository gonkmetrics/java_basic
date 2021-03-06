package heapmemory;

import java.util.Arrays;

public class ArrayComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = arr1;
		int[] arr3 = {1,2,3,4,5};
		arr1[0]=10;
		//now the value at index 0 points to arr1, which is 10
		//arr2=arr1; does not create a arr2 array but rather points to arr1 in memory
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		
		arr1[0]=1;
		//now the array values are the same
		//BUT their memory addresses are not
		//therefore when comparing their memory addresses, the operator will throw a false
		System.out.println(arr1 == arr3);
		//as seen below this is stating the memory addresses of arr1==arr2 is the same
		System.out.println(arr1==arr2);
		
		//to get around this limitation, use equals()
		arr1.equals(arr3);
		System.out.println(arr1.equals(arr3));
		System.out.println(Arrays.equals(arr1,arr3));
		//System.out.print(Arrays.toString(arr1));

	}

}
