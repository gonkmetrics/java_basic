package arrays1;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int[] arrCopy = Arrays.copyOf(arr, 3);
		//the array is concatenated to index 3
		System.out.println(arrCopy);
		System.out.println(Arrays.toString(arrCopy));
		int[] arrCopy2 = Arrays.copyOf(arr, 10);
		//the array is expanded to index 10, filled with 0s for previously nonexistent values
		System.out.println(Arrays.toString(arrCopy2));

	}

}
