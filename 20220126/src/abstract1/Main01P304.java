package abstract1;

public class Main01P304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//abstract classes cannot be constructed/instantiated?
		//Parent p1 = new Parent();
		
		//However, once a Child object is instantiated, the content of Parent is usable
		Parent c = new Child();
		c.getAge();
		
		//and a method from the abstract class
		c.getInfo();

	}
	
	
	

}
