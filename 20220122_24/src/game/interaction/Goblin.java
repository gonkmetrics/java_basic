package game.interaction;

public class Goblin {
	private int hp;
	private int atk;
	
	public Goblin() {
		this.hp = 3;
		this.atk = 2;
	}
	
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		System.out.println("Attacked by User. Goblin HP: " + this.hp);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}
	

}
