package game.interaction;

public class Rabbit {
	private int hp;
	private int atk;
	
	public Rabbit() {
		this.hp = 2;
		this.atk = 0;
	}
	
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		System.out.println("Attacked by User. Rabbit HP: " + this.hp);
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
