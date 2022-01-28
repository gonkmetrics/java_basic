package exception3;

public class Exception03P355 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {1,2,3,4,5,0};
		try {
			for(int i=0; i<6; i++) { //outofbounds
				System.out.println(number[i]);
			}
			System.out.println("div by 0, cycling");
			System.out.println(number[4]/number[5]);
		} catch(ArithmeticException ae) { //arithmeticexception
			System.out.println("계산 오류(arithmetic exception)");
		} catch(ArrayIndexOutOfBoundsException ai) {
			//exception e in the statement is catch-all for most errors. you can specify as in this code block
			System.out.println("index is out of bounds");
		} catch(Exception e) {
			System.out.println("default error");
		}
	}

}
