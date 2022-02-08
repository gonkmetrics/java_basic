package collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02P447 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList
		List<String> list1 = new ArrayList<>();
		list1.add("사과");
		list1.add("딸기");
		list1.add("망고");
		list1.add("블루배리");
		list1.add("파인");
		System.out.println(list1);
		
		//.contains gives true/false over contents
		System.out.println(list1.contains("망고"));
		
		//.get(index) gets the element at a specified index
		System.out.println(list1.get(1));
		//System.out.println(list1.get(8)); out of bounds error
		
		//.size get the size of the array (max index)
		System.out.println(list1.size());
		
		//.isEmpty gives true/false over the array being populated by elements
		System.out.println(list1.isEmpty());
		
		List<Integer> list2 = new ArrayList<>();
		System.out.println(list2.isEmpty());

	}

}
