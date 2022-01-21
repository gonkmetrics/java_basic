import java.util.Arrays;

public class Array01P146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrays: saving multiple values to a single variable
		//arrays are not a data type. therefore an array
		//declared by [], can be an int array, double, etc.
		
		int dw101[] = {1,2,3,4};
		
		//Homogeneous collection: same data type in array
		//Heterogeneous collection: different data types in list
		//array sizes are not dynamic. their sizes are static.
		//array.length indicates the length of an array.
		//Arrays.tostring allows the values of an array to be printed
		//without this class, the memory address of the array is printed
		System.out.println(Arrays.toString(dw101));
		System.out.println(dw101);
		//arrays are assembled into stacks (abstract data) before being moved
		//to memory, where it gets assigned a hexadecimal address.
		//whereas simple variables are only assigned to the stack explicitly
		
		//array example 2
		double[] c = {5.1, 6.3, 7.2, 8.77};
		System.out.println(Arrays.toString(c));
		System.out.println(c);
		
		//setting up an empty array of size 10
		int[] d = new int[10];
		System.out.println(Arrays.toString(d));
		System.out.println(d);
		
		//searching arrays
		//a single block of data from an array can be searched for
		//by specifying the index of the data being searched
		//this process is called indexing
		System.out.println(dw101[0]);
		
		//finding the length of an array
		System.out.println(dw101.length);
		
	}

}
