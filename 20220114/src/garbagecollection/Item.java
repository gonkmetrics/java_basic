package garbagecollection;

public class Item {
	
	public int num;
	
	public Item(int n) {
		num = n;
		System.out.println(num + " created");
	}
	
	protected void finalize() {
		System.out.println(num + " deleted");
	}

}
