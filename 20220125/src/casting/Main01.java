package casting;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal("animal1", 2);
		Animal c1 = new Cat("cat1", 3);
		Animal d1 = new Dog("dog1", 4);
		
		a1.sit();
		c1.sit();
		d1.sit();
		
		//c1.jump(); does not work
		//to type cast
		Cat cat1 = (Cat)c1;
		//changes c1 from type Animal to type Cat
		cat1.jump();
		
		
		

	}

}
