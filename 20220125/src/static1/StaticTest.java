package static1;

public class StaticTest {
	public int num1;
	
	public static int num2 = 0;
	
	public StaticTest() {
		this.num1 += 5;
		num2 += 1;
		System.out.println(num1);
		System.out.println(num2);
	}

}
