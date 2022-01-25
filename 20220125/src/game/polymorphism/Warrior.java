package game.polymorphism;

public class Warrior {
	private String name;
	private int hp;
	private int mp;
	private int atk;
	private int playerExp;
	
	public Warrior(String name) {
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
		this.name = name;
		this.playerExp = 0;
	}
	
	public void hunt(Monster monster) {
		monster.doBattle(this.atk);
		this.hp -= monster.getAtk();
		System.out.println("Player HP: " + this.hp);
		System.out.println(monster.getClass().getSimpleName() + " HP: " + monster.getHp());
		if(monster.getHp() <= 0) {
			this.playerExp += monster.getExp();
			System.out.println("Player Exp: " + this.playerExp);
			System.out.println(monster.getClass().getSimpleName() + " 죽었습니다");
			return;
		}
		
	}
	
	
	
	
	
}
