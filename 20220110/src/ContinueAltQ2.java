
public class ContinueAltQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] math = {96,23,52,82,72,31,58};
		int[] eng = {62,42,68,31,80,77,45};
		int[] com = {10,28,39,74,65,90,98};
		int combinedAvg = 0;
		int counter = -1;
		masterMath: for(int mathCount : math) {
			combinedAvg = 0;
			counter++;
			combinedAvg += math[counter];
			combinedAvg += eng[counter];
			combinedAvg += com[counter];
			if(mathCount >= 60) {
				System.out.println(combinedAvg/3);
				continue masterMath;
			}
		}
	}

}


