package static1;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static methods do not need to be constructed to be used in a class
		System.out.println(StaticTest.num2);
		//System.out.println(StaticTest.num1); the static method cannot refer to a non-static field/variable
		
		StaticTest.check();
		
		StaticTest st1 = new StaticTest();
		st1.check();

	}

}
