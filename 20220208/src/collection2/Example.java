package collection2;

public class Example {

	private int a;
	private int b;
	
	public Example() {
		this.a = 1;
		this.b = 2;
	}
	
	//toString overrides the method to print values in the method instead of the memory address

	@Override
	public String toString() {
		return "Example [a=" + a + ", b=" + b + "]";
	}
	
	


}
