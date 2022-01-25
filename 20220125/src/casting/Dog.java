package casting;

public class Dog extends Animal{

	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public void sleep() {
		System.out.println("개가 자고 있습니다");
	}
	
	public void sit() {
		System.out.println("개가 앉습니다");
	}
	

}
