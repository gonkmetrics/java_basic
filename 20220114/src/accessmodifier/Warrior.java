package accessmodifier;

public class Warrior {
	
	protected int hp;
	private int strength;
	private String name;
	private int level;
	private int money;
	
	//constructor, name is input
	//hp 2 str 3 lvl 1 money 0
	public Warrior(String playerName) {
		hp = 20;
		strength = 3;
		level = 0;
		money = 0;
		name = playerName;
	}
	
	//setting the method as public allows the values within the method to be changed from any part of the program
	//you can block access to these values by setting the access modifier to private
	
	//public access modifier: access everywhere from the program
	//private access modifier: access within the class only. no access to values outside class
	//protected access modifier: access within the same package only. no access to values outside package
	
	
	public void hunt() {
		hp -= 2;
		money += 10;
		System.out.println("체력#: " + hp + " 돈#: " + money);
	}
}
