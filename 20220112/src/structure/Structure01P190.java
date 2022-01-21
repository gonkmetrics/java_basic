package structure;

public class Structure01P190 {

	public static void main(String[] args) {//boilerplate
		//breaking down the boilerplate code:
		//in this main method, we will only deal with executing code
		//other functions and logic will be contained in another .java file
		
		//custom designed datatypes:
		//new datatype();
		Person p1 = new Person();
		System.out.println(p1);
		//in format: p1.variablename = value to be substituted in
		p1.name="Chae";
		//sysout(p1) will print the memory address to which the values substituted to p1 are sent
		p1.age=20;
		p1.pNum= "01012345678";
		p1.uNum= 32;
		System.out.println(p1.age);
		System.out.println(p1.age);
		System.out.println(p1.pNum);
		System.out.println(p1.uNum);
		
		
		/* visual:
		+----------------------+--------------------+
		|         stack        |        heap        |
		+======================+====================+
		|         main         |       memory       |
		+----------------------+------+-------------+
		|          P2          | name | Chae        |
		|        (data in      +------+-------------+
		|       memory)        | age  | 20          |
		+----------------------+------+-------------+
		| from Structure01 --> | pNum | 01012345678 |
		| values are being     +------+-------------+
		| substituted          | uNum | 32          |
		+----------------------+------+-------------+
		*/
		
		//To add another person into this
		Person p2 = new Person();
		System.out.println(p2);
		//sysout(p2) will print the memory address to which the values substituted to p2
		//which is a memory address different than that of p1, which means that
		//any changes to p2 will not affect p1
		p2.name="Kim";
		p2.age=  22;
		p2.pNum= "01043215678";
		p2.uNum= 34;
		System.out.println(p2.age);
		System.out.println(p2.age);
		System.out.println(p2.pNum);
		System.out.println(p2.uNum);
		
		System.out.println("compare: " + p1.name);
		System.out.println("compare: " + p2.name);
		
		/* visual:
		+----------------------+--------------------+
		|         stack        |        heap        |
		+======================+====================+
		|         main         |       memory       |
		+----------------------+------+-------------+
		|          P1          | name | Kim         |
		|        (data in      +------+-------------+
		|       memory)        | age  | 22          |
		+----------------------+------+-------------+
		| from Structure01 --> | pNum | 01043215678 |
		| values are being     +------+-------------+
		| substituted          | uNum | 34          |
		+----------------------+------+-------------+
		*/

	}

}
