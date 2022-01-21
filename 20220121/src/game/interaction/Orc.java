package game.interaction;

public class Orc {
	private int hp;
	private int atk;
	
	public Orc() {
		this.hp = 5;
		this.atk = 3;
	}
	
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		System.out.println("Attacked by User. Orc HP: " + this.hp);
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
