package greedy_algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class Fractional_KnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int val[] = {60,100,120};
		int weight[] = {10,20,30};
		int w = 50;
		
		double ratio[][] = new double[val.length][2];
		
		for(int i=0;i<val.length;i++) {
			ratio[i][0] = i;
			ratio[i][1] = val[i]/(double)weight[i];
		}
		
		Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
		int capacity = w;
		int finalVal =0;
		
		for(int i=ratio.length-1;i>=0;i--) {
			int idx = (int)ratio[i][0];
			if(capacity >= weight[idx]) {
				//include full item
				finalVal += val[idx];
				capacity -= weight[idx];
			}else {
				//include fractional item
				finalVal += (ratio[i][1] * capacity);
				capacity = 0;
				break;
			}
		}
		
		System.out.println("final value = "+ finalVal);
	}

}
