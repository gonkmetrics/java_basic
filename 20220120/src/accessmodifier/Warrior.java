package accessmodifier;

public class Warrior extends Commoner{
	
	public Warrior(String name) {
		super(name);
		
	}
	
	public void hunt() {
		setHp(getHp() - 1);
		setExp(getExp() + 10);
		System.out.println("Hunt");

	}
	
	public void doubleAttack() {
		setHp(getHp() - 4);
		setExp(getExp() + 25);
		System.out.println("Double Attack");

	}
	
	public void getInfo() {
		System.out.println("Hp: " + getHp() + '\n' + "Xp: " + getExp() + '\n' + "Mp: " + getMp()
		+ '\n' + "Lvl: " + getLv() + '\n' + "Name: " + getName());
	}
}
