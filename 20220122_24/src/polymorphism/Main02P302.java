package polymorphism;

public class Main02P302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("MyPerson", 30);
		Person sT1 = new Student("MyStudent", 20, 99);
		Person e1 = new Unemployed("MyUnemployed", 25, true);
		Person sL1 = new Soldier("MyStudent", 22, "Pvt.");
		
		//if the child class types are changed such that they are constructed
		//using the child's constructor, then the methods in the
		//child class are available to use.
		//otherwise if constructed from the superclass
		//the expected outcome occurs
		
		p1.showPerson();
		sT1.showPerson();
		e1.showPerson();
		sL1.showPerson();

	}

}
