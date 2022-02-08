package collection2;

import java.util.ArrayList;
import java.util.List;

public class Lotto02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		
		l1.add(77);
		l1.add(2);
		l1.add(699);
		
		l2.add(2);
		l2.add(699);
		l2.add(77);
		
		
		
		System.out.println(l1==l2); //address
		System.out.println(""+l1+l2); //contents
		System.out.println(l1.equals(l2)); //compares t/f

	}

}
