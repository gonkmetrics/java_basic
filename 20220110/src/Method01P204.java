
public class Method01P204 {

	public static void example(String[] args) {
		// TODO Auto-generated method stub
		//methods are blocks of code that run only when
		//called. using methods, you can reuse code
		//you can also pass resources and data values into
		//a method. using the return function, you can
		//get the output of a method
		
		//all methods are coded under the class
	}
	
	public static void add(int a) {
		//this is a method called "add"
		//"incomplete" code can be written within
		//a method, like the line below
			System.out.println(a + 1);
		//in this form, variable a is not initialized
		//but a is initialized outside of the method so
		//this "incomplete" code works regardless
	}
	
	public static void main(String[] args) {
		//in order to call a method, add parentheses next
		//to the method name
		//the below is method add
		add(10); //holding
		//this assigns the value 10 to int a, then executes
		//the expression a + 1, to yield 10 + 1 = 11
	}
}

