package collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01P447 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List interface and ArrayList and LinkedList
		//import both java.util.Arraylist and java.util.List methods
		//primitives cannot exist in <>
		
		
		List<Integer> list1 = new ArrayList<>();
		
		//adding resources. this occurs in left to right order
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		System.out.println(list1);
		list1.add(10);
		System.out.println(list1);
		//index of an added element can also be defined
		list1.add(1,100);
		System.out.println(list1);

	}

}
