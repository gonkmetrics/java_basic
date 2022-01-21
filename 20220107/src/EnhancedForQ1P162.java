import java.util.Arrays;

public class EnhancedForQ1P162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] math = {96,23,52,82,72,31,58};
		int[] eng = {62,42,68,31,80,77,45};
		int[] com = {10,28,39,74,65,90,98};
		//System.out.println(Arrays.toString(math));
		int mathAvg = 0;
		int engAvg = 0;
		int comAvg = 0;
		for(int mathCount : math) {
			mathAvg += mathCount;
		}
		for(int engCount : eng) {
			engAvg += engCount;
		}
		for(int comCount : com) {
			comAvg += comCount;
		}
		int arrayLength = math.length;
		System.out.println(mathAvg/arrayLength);
		System.out.println(engAvg/arrayLength);
		System.out.println(comAvg/arrayLength);


	}

}
