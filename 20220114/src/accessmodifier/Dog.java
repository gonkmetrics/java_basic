package accessmodifier;

public class Dog {
	public String nameDog;
	private int hpDog;
	private int levelDog;
	private int atkDog;
	
	public Dog(String name) {
		nameDog = name;
		hpDog = 10;
		levelDog = 1;
		atkDog = 4;
	}
	
	public void trainDog() {
		levelDog++;
		atkDog += 2;
		System.out.println(nameDog + " 을 훈련 시켰으며 ATK" + atkDog + "증가했다");
	}
}
