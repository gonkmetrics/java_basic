package game.polymorphism;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monster orc1 = new Orc();
		Warrior war1 = new Warrior("war1");
		System.out.println("---------------");
		war1.hunt(orc1);
		war1.hunt(orc1);
		Monster skel1 = new Skeleton();
		Monster wolf1 = new Wolf();
		System.out.println("---------------");
		war1.hunt(skel1);
		System.out.println("---------------");
		war1.hunt(wolf1);

	}

}
