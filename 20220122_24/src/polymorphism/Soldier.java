package polymorphism;

public class Soldier extends Person{
	private String rank;

	public Soldier(String name, int age, String rank) {
		super(name, age);
		this.rank = rank;
		// TODO Auto-generated constructor stub
	}
	public void showPerson() {
		super.showPerson();
		System.out.println("Rank: " + this.rank);
	}
	
	public void showSoldier() {
		System.out.println("저는 군인입니다");
	}

}
