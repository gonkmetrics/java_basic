package game.interaction;

public class Warrior {
	private int hp;
	private int mp;
	private int atk;
	private int exp;
	private int lvl;
	
	public Warrior() {
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
		this.lvl = 1;
		this.exp = 0;
	}
	
	public void huntOrc(Orc orc) {
		if(orc.getHp() <= 0) {
			System.out.println("오크가 이미 죽은 상태입니다");
			return;
		}
		orc.doBattle(this.atk);
		if(orc.getHp() <= 0) {
			System.out.println("오크가 죽었습니다");
			this.exp += 10;
			System.out.println("Remaining HP:" + this.hp);
			return;
		} else {
			this.hp -= orc.getAtk();
		}
		System.out.println("Hunted Orc");
		System.out.println("Remaining HP:" + this.hp);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
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

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	
	
}
