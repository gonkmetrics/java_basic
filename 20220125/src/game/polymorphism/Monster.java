package game.polymorphism;

public class Monster {
	private int hp;
	private int atk;
	private int exp;
	
	public Monster(int hp, int atk, int exp) {
		this.hp = hp;
		this.atk = atk;
		this.exp = exp;
	}
	
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		System.out.println("doBattle");
		//System.out.println("Monster HP: " + this.hp);
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

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	
	

}
