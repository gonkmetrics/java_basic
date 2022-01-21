package overloading;

public class Calculator {
	public void plus(int a) {
		System.out.println(a + "one more is" + (a+1));
	}
	
	public void plus(int a, int b) {
		System.out.println((a + b) + "is a plus b");
	}
	
	public void plus(double c) {
		System.out.println(c += 0.5);;
	}
	
	public void plus(String str) {
		System.out.println("not a number");
	}
}
