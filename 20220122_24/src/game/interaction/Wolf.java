package game.interaction;

public class Wolf {
	private int hp;
	private int atk;
	
	public Wolf() {
		this.hp = 10;
		this.atk = 5;
	}
	
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		System.out.println("Attacked by User. Wolf HP: " + this.hp);
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
