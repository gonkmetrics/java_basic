package game.interaction;

public class Magician {
	private int hp;
	private int mp;
	private int atk;
	private int exp;
	private int lvl;
	
	public Magician() {
		this.hp = 10;
		this.mp = 20;
		this.atk = 2;
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
			System.out.println("Player HP:" + this.hp);
			System.out.println("XP: " + this.exp);
			return;
		} else {
			this.hp -= orc.getAtk();
		}
		System.out.println("Hunted Orc");
		System.out.println("Player HP:" + this.hp);
	}
	
	public void huntWolf(Wolf wolf) {
		if(wolf.getHp() <= 0) {
			System.out.println("늑대가 이이 죽은 상태입니다");
			return;
		}
		wolf.doBattle(this.atk);
		if(wolf.getHp() <= 0) {
			System.out.println("늑대가 죽었습니다");
			this.exp += 20;
			System.out.println("Player HP:" + this.hp);
			System.out.println("XP: " + this.exp);
			return;
		} else {
			this.hp -= wolf.getAtk();
		}
		System.out.println("Hunted Wolf");
		System.out.println("Player HP:" + this.hp);
	}
	
	public void huntGoblin(Goblin goblin) {
		if(goblin.getHp() <= 0) {
			System.out.println("고블린이 이미 죽은 상태입니다");
			return;
		}
		goblin.doBattle(this.atk);
		if(goblin.getHp() <= 0) {
			System.out.println("고블린이 죽었습니다");
			this.exp += 5;
			System.out.println("Player HP:" + this.hp);
			System.out.println("XP: " + this.exp);
			return;
		} else {
			this.hp -= goblin.getAtk();
		}
		System.out.println("Hunted Goblin");
		System.out.println("Player HP:" + this.hp);
	}
	
	public void huntRabbit(Rabbit rabbit) {
		if(rabbit.getHp() <= 0) {
			System.out.println("토끼가 이미 죽은 상태입니다");
			return;
		}
		rabbit.doBattle(this.atk);
		if(rabbit.getHp() <= 0) {
			System.out.println("토끼가 죽었습니다");
			this.exp += 5;
			System.out.println("Player HP:" + this.hp);
			System.out.println("XP: " + this.exp);
			return;
		} else {
			//this.hp -= rabbit.getAtk();
		}
		System.out.println("Hunted Goblin");
		System.out.println("Player HP:" + this.hp);
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
