package greedy_algorithm;

import java.util.Arrays;

public class Min_absolute_difference_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,2,3};
		int B[] = {2,1,3};
		
		//Time complexity : O(n)
		Arrays.sort(A);
		Arrays.sort(B);
		
		int minDiff = 0;
		
		for(int i=0;i<A.length;i++) {
			minDiff += Math.abs(A[i]-B[i]);
		}

		System.out.println("min absolute diff of pairs = "+minDiff);
	}

}
