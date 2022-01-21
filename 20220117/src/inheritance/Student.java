package inheritance;

public class Student extends Person{
	//name, age from class Person is included in class Student
	//class Student is a child class of parent class Person, inheriting the properties of the parent class
	//this allows for creating new classes that reuse properties of existing classes
	//object class is the topmost class
	//private classes are not inherited
	public int studentNum;
	
	public void getStuInfo() {
		System.out.println("이름은"+name+"입니다"+"나이는"+age+"입니다"+"학번은"+studentNum+"입니다");
	}
}
