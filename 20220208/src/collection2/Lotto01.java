package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lottoGen = new ArrayList<>();
		Random random = new Random();
		int lottoNum;
		for(int c = 0; c<6;) {
			lottoNum = random.nextInt(44);
			if(lottoGen.contains(lottoNum+1)) {
				continue;
			}else if(!(lottoGen.contains(lottoNum+1))){
				lottoGen.add((lottoNum+1));
				c++;
			}		
		}
		//if(contains) {lottoNum = random.nextInt(44);}
		Collections.sort(lottoGen);
		System.out.println(lottoGen);
		
		
		

	}

}
