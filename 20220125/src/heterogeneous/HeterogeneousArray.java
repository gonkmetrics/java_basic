package heterogeneous;

public class HeterogeneousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr = {1,2,3,4,5,6,7,8,9,10};
		//int[] iArr = {1,2,"a","b"};//throws error
		
		for(int array1:iArr) {
			System.out.println(array1);
		}
		
		//arrays type Object support multiple data types
		Object[] oArr = {"a","b",1,2,3.0,5.0};
		
		for(Object array2:oArr) {
			System.out.println(array2);
		}

	}

}
