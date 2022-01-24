package polymorphism;

public class Student extends Person{
	
	private int grade;

	public Student(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
		// TODO Auto-generated constructor stub
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("Grade: " + this.grade);
	}
	
	public void showStudent() {
		System.out.println("저는 학생입니다");
	}

}
