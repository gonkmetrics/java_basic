package math;

public class Math04P480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Math.random() is a random number generator (between 0 and 1)
		//double a = Math.random();
		double a;
		//System.out.println(a);
		
		for(int count = 0; count <= 20; count++) {
			a = Math.random();
			if(a<0.15) {
				System.out.println("강화에 성공했습니다");
			} else {
				System.out.println("강화에 실패했습니다");
			}
		}
		
		int b = (int) (Math.random()*6);
		System.out.println(b);

	}

}
