package heapmemory;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Hallo";
		
		System.out.println(str1);
		//gets the memory address/pointer
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		//strings cannot be modified in arrays post-hoc
		//str1[0] = "j";
		
		//str1,str2 having the same string content, will be assigned to the same address
		//however, by using the new keyword, identical strings can be saved to different addresses
		String str4 = new String("Hello");
		System.out.println(str4);
		System.out.println(str4.hashCode());
		System.out.println(str1==str4);
		
		//

	}

}
