
public class ContinueQ2P123 {

	public static void main(String[] args) {
		
		
		//**********REFER TO ALTQ2**********
		
		
		
		// TODO Auto-generated method stub
		int[] math = {96,23,52,82,72,31,58};
		int[] eng = {62,42,68,31,80,77,45};
		int[] com = {10,28,39,74,65,90,98};
		//System.out.println(Arrays.toString(math));
		//int mathAvg = 0;
		//int engAvg = 0;
		//int comAvg = 0;
		int combinedAvg = 0;
		//int arrayLength = math.length;
		masterMath: for(int mathCount : math) {
			combinedAvg = 0;
			combinedAvg += mathCount;
			System.out.println(combinedAvg);
			eng: for(int engCount : eng) {
				combinedAvg += engCount;
				System.out.println(engCount);
				System.out.println(combinedAvg);
				break eng;
			}
			com: for(int comCount : com) {
				combinedAvg += comCount;
				System.out.println(comCount);
				System.out.println(combinedAvg);
				break com;
			}
			if(mathCount >= 60) {
				System.out.println("*******"+ (combinedAvg/3));
				} else {
					continue masterMath;
				}
				
				//break;
				}
				//continue masterMath;
				//break masterMath;
			//else {
			//	;
			//}
			
		}
	}


