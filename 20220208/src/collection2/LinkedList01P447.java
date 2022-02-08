package collection2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01P447 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList
		List<String> list1 = new LinkedList<>();
		
		list1.add("java");
		list1.add("jsp");
		list1.add("spring");
		list1.add("sql");
		System.out.println(list1);
		
		//.remove()
		//.remove(index) removes an element at the specified index
		//.remove("element") removes the specified element
		list1.remove(0);
		System.out.println(list1);
		
		list1.remove("sql");
		System.out.println(list1);
		
		//.clear() to delete all the elements in a list
		list1.clear();
		System.out.println(list1);
		System.out.println(list1.isEmpty());
		
		list1.add("python");
		list1.add("c++");
		list1.add("javascript");
		list1.add("mongoDB");
		
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		
		//arraylist vs linkedlists
		
		//arraylists are organized as stacks/dynamic arrays 
		//where deleting or inserting an element changes the
		//index of all other elements in the arraylist and is slow as a result
		//+ better for storing and accessing data
		//- modifying is problematic
		
		//linkedlist elements exist separately in the heap and are linked to each other
		//by their memory addresses. therefore changing one element does not affect the others
		//by using a doubly linkedlist, no bit shifting is required(i.e. index is intact)
		//+ better for manipulating data
		//- slower at fetching data

	}

}
