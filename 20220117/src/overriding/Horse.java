package overriding;

public class Horse extends Animal{
	public int rank;
	
	//there already is a method howl in class animal
	//so creating a new method with the same name overrides
	//the inherited method
	public void howl() {
		System.out.println("히히힝");
	}
	
	public void getHorseInfo() {
		System.out.println(name+age+gender+rank);
	}
	
	
}
