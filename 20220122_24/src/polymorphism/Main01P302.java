package polymorphism;

public class Main01P302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("MyPerson", 30);
		Person sT1 = new Student("MyStudent", 20, 99);
		Person e1 = new Unemployed("MyUnemployed", 25, true);
		Person sL1 = new Soldier("MyStudent", 22, "Pvt.");
		
		//thanks to polymorphism the following can happen
		p1.showPerson();
		sT1.showPerson();
		e1.showPerson();
		sL1.showPerson();
		//however, s1 cannot modify values within class Student
		//and can only do so with superclass Person
		//it cannot call methods from student
		//but methods that exist in the superclass that are
		//overridden in the child class are still usable
		/*
+------------------------+-------------------------------------------------------------+--------------------+
| 스택                   | 힙                                                          |                    |
+------------------------+-------------------------------------------------------------+                    |
| main                   | 메모리 주소(n)                                              |                    |
+------------------------+-----------------------------------+---------------------+---+                    |
| object p1              | class Person                      | int age             | a |                    |
| object s1              | pointer 1/100번                   | String name         | b |                    |
|                        |                                   +---------------------+---+                    |
|                        |                                   | method getInfo()        |                    |
+------------------------+-----------------------------------+---------------------+---+                    |
| no objects referencing | class Student                     | INHERITS: age, name |   |                    |
|                        | pointer 2/200번                   | int grade           | c |                    |
|                        |                                   +---------------------+---+                    |
|                        |                                   | method getInfo()        |                    |
|                        |                                   | method getStudent()     |                    |
+------------------------+-----------------------------------+-------------------------+--------------------+
		 */
		//p1.showStudent();
		//s1.showStudent();
		//the above two do not work. in s1's case
		//it does not work because it only has
		//access to the superclass Person
		
		/*
+------------+--------------------------------------------------------------------------------------------------------------+
| 스택       | 힙                                                                                                           |
+------------+--------------------------------------------------------------------------------------------------------------+
| main       | 메모리 주소(n)                                                                                               |
+------------+------------------------------+---------------------------------------------------------+---------------------+
| object p1  | superclass Person            | int age                                                 | values from objects |
| object sT1 | pointer 1/100번              | String name                                             |                     |
| object e1  |                              +---------------------------------------------------------+---------------------+
| object sL1 |                              | method getInfo()                                        |                     |
+------------+------------------------------+------------------------+--------------------------------+---------------------+
|            |                              | child class Student    | Inherited variables: age, name |                     |
|            |                              | n = 200                | int grade                      | 99                  |
|            |                              +------------------------+--------------------------------+---------------------+
|            |                              | method getInfo() overrides getInfo()                    |                     |
|            |                              | method getStudent()                                     |                     |
|            |                              +------------------------+--------------------------------+---------------------+
|            |                              | child class Unemployed | Inherited variables: age, name |                     |
|            |                              | n = 300                | String rank                    | Pvt.                |
|            |                              +------------------------+--------------------------------+---------------------+
|            |                              | method getInfo() overrides                              |                     |
|            |                              | method getUnemployed                                    |                     |
|            |                              +------------------------+--------------------------------+---------------------+
|            |                              | child class Soldier    | Inherited variables: age, name |                     |
|            |                              | n = 400                | boolean isEmployed             | true                |
|            |                              +------------------------+--------------------------------+---------------------+
|            |                              | method getInfo() overrides                              |                     |
|            |                              | method getSoldier()                                     |                     |
+------------+------------------------------+---------------------------------------------------------+---------------------+
		 */

	}

}
