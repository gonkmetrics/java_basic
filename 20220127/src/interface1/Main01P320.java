package interface1;

public class Main01P320 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in the case of interfaces, there are no member variables
		//any methods in the interface are overridden
		//when initializing the parent methods there generally are no constraints
		
		//polymorphism applies as well
		Vehicle c1 = new Car("Chae");
		c1.accel();
		c1.showStatus();
		c1.breakSpeed();
		c1.showStatus();
		c1.reFuel();
		c1.showStatus();

	}

}
