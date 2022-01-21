package accessmodifier;

public class Commoner {
	private int hp;
	private int mp;
	private int lv;
	private int exp;
	private String name;
	
	public Commoner(String name) {
		hp = 20;
		mp = 10;
		lv = 1;
		exp = 0;
		this.name = name;
	}
	//generating getter/setter
	//go to source>generate getters and setters>select all

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

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
