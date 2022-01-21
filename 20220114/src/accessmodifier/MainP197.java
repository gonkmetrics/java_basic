package accessmodifier;

public class MainP197 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warrior warA = new Warrior("warrior1");
		for(int loop1 = 0; loop1<3; loop1++) {
			warA.hunt();
		}
		
		//note: as the variables in class Warrior are private, it is not possible to change
		//them from this class
		

	}

}
