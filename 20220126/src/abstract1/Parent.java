package abstract1;

//abstract class
//an abstract class can have both abstract and non-abstract methods
//
public abstract class Parent {
	private int age;
	
	public Parent() {
		this.age = 40;
		
	}
	
	//abstract method, or methods without body
	//overridden when inherited
	
	public abstract void getAge();
	
	//regular method
	public void getInfo() {
		System.out.println("regular method");
	}

}
