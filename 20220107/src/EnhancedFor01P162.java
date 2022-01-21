import java.util.Arrays;

public class EnhancedFor01P162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enhanced for loop
		//steps through the array in sequential order
		
		int[] arr1 = {100, 211, 339, 475, 591, 600, 700};
		System.out.println(Arrays.toString(arr1));
		// for(){int:array)
		//	expression
		//}
		
		for(int abcd : arr1) {
			System.out.println(abcd);
		}
		
		//technical: when a class is initialized, the whole block of code
		//in the class under main is transferred to the stack
		//int abcd in the for loop cannot be used outside of the loop
		//the for loop executes 7 times to print all 7 values in the array
		//what is occurring is that the enhance for loop, reading the array
		//sequentially, is transferring values from the array to the int abcd
		//so the first value transferred is 100, then 211, so on
		//until the whole array is read
		
		//stack to heap (memory/RAM)

	}

}
