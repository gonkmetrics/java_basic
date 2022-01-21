import accessmodifier.Warrior;
//or Warrior followed by ctrl+space
public class MainP197 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warrior w2 = new Warrior("warB");
		//w2.hp = 100000;
		//the method hunt() is able to be used in this class as the class holding the method was imported
		//however, since it is not a subclass, the values in Warrior() still cannot be modified from here
		w2.hunt();
		w2.hunt();
		w2.hunt();
		
	}

}
