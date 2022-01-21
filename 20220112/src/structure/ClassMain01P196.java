package structure;

public class ClassMain01P196 {
	
	//Calling PersonClass together with supporting code is not necessary:

	public static void main(String[] args) {
		//1
		PersonClass pA = new PersonClass();
		pA.name="Chae";
		pA.age=  23;
		pA.weight= "53";
		pA.height= 164;
		pA.address= "500 Street";
		pA.getInfo();
				
		//2
		PersonClass pB = new PersonClass();
		pB.name="Park";
		pB.age=  24;
		pB.weight= "62";
		pB.height= 177;
		pB.address= "488 Street";
		pB.getInfo();
	}
}
