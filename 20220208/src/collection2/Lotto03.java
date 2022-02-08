package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lottoGen = new ArrayList<>();
		List<Integer> lottoRandGen = new ArrayList<>();
		Random random = new Random();
		int lottoNum;
		int counter = 0;
		for(int c = 0; c<1;) {
			lottoNum = random.nextInt(44);
			if(lottoGen.contains(lottoNum+1)) {
				continue;
			}else if(!(lottoGen.contains(lottoNum+1))){
				lottoGen.add((lottoNum+1));
				c++;
			}		
		}
		Collections.sort(lottoGen);
		System.out.println(lottoGen);
		
		while(true) {
			for(int c = 0; c<1;) {
				lottoNum = random.nextInt(44);
				if(lottoRandGen.contains(lottoNum+1)) {
					continue;
				}else if(!(lottoRandGen.contains(lottoNum+1))){
					lottoRandGen.add((lottoNum+1));
					c++;
				}
			}
			Collections.sort(lottoRandGen);
			System.out.println(lottoGen+" "+lottoRandGen);
			counter++;
			if(lottoGen.equals(lottoRandGen)) {
				System.out.println("Total: " + counter);
				break;
			} else {
				lottoRandGen.clear();
			}
		}
	}

}
