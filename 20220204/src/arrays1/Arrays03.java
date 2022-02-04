package arrays1;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays.copyOfRange() is similar to copyOf()
		//format copyOfRange(start index, end index+1)
		int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
		
		int[] arrCopy = Arrays.copyOfRange(arr, 3, 7);
		System.out.println(Arrays.toString(arrCopy));
		//a new array with values between index 3-7 is created from arr
		
		int[] arrCopy2 = Arrays.copyOfRange(arr, 0, 12);
		System.out.println(Arrays.toString(arrCopy2));
		

	}

}
