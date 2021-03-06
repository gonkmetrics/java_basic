package thiskeyword;

public class Main01P224 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person pe1 = new Person("Chae", 28, 5000000, "CS");
		pe1.getInfo();
		Person pe2 = new Person("Kim", 25, 3500000, "Math");
		pe2.getInfo();
		//a variable within a class in Java is called a field
		
		//this is a reference to the current object, i.e. if the object is defined as pe1, then
		//this is passed onto the constructor as pe1. where fields (like namePerson) are shadowed
		//by the constructor Person
		//thus methods prefixed with this. start
		//referencing pe1 (i.e. in the style of pe1.namePerson, etc.)
		
		
		
		
		/*
+------------+-------------------------------------------------------------------+
| 스택        | 힙                                                                |
+------------+-----------------------------------+---------------+---------------+
| main       | 메모리 주소(n)                       | pointer 1     | pointer 2     |
+------------+-----------------------------------+-----+---------+-----+---------+
| Person pe1 | (String) keyword this.namePerson  | pe1 | Chae    | pe2 | Kim     |
|            +-----------------------------------+-----+---------+-----+---------+
|            | (int) keyword this.agePerson      | pe1 | 28      | pe2 | 26      |
|            +-----------------------------------+-----+---------+-----+---------+
|            | (int) keyword this.moneyPerson    | pe1 | 5000000 | pe2 | 3500000 |
|            +-----------------------------------+-----+---------+-----+---------+
|            | (String) keyword this.majorPerson | pe1 | CS      | pe2 | Math    |
|            +-----------------------------------+-----+---------+-----+---------+
|            | 											methods: getInfo()       |
+------------+-------------------------------------------------------------------+
		 */
		//getInfo in pointer 2 references the local variable, i.e. the fields that correspond to 
		//pe2. it does not grab values from within pointer 1 even if the variable names are the same
		
		//adding the this. keyword to the getInfo method makes sure the values being grabbed are
		//from the fields linked to pe2, as opposed to just the local variable

	}

}
