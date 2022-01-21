package accessmodifier;

public class Magician extends Commoner {

	public Magician(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void hunt() {
		System.out.println("hunt");
		//hp -= 2;
		//the above can't be used as the method hp is private
		//therefore, use a public setter
		//setHp(5) sets hp to 5
		//this is possible because setter and getter methods were generated in the superclass
		setHp((getHp())-2);
		setExp(getExp() + 10);
	}
	
	public void getInfo() {
		System.out.println("Hp: " + getHp() + '\n' + "Xp: " + getExp() + '\n' + "Mp: " + getMp()
		+ '\n' + "Lvl: " + getLv() + '\n' + "Name: " + getName());
		
	}
	
	public void fireball() {
		setMp(getMp() - 3);
		setExp(getExp() + 20);
		System.out.println("Fireball");
	}
		
		
	
	
}
