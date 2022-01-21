package garbagecollection;

public class MainP201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item i1 = new Item(1);
		Item i2 = new Item(2);
		i2 = null;
		Item i3 = new Item(3);
		System.gc();
		Item i4 = new Item(4);
		i4 = null;
		Item i5 = new Item(5);
		i1 = null;
		Item i6 = new Item(6);
		//null is no value
		//empty is zero
		System.gc();
	}

}
