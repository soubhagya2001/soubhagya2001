package greedy_algorithm;
import java.util.*;

public class Activity_selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start[] = {1,3,0,5,8,5};
		int end[] = {2,4,6,7,9,9}; //endtime is already sorted
		
		/*
		 * for sorting :
		 * int activities[][] = new int[start.length][3];
		 * for(int i=0;i<start.length;i++){
		 * 		activities[i][0] = i;
		 * 		activities[i][1] = start[i];
		 * 		activities[i][2] = end[i];
		 * 	}
		 * 
		 * //Lambda function -> shortform
		 * Arrays.sort(activities, Comparator.comparingDouble( o -> o[2]));
		 */
		int maxAct =0;
		ArrayList<Integer> ans = new ArrayList<>();
		
		
		//1st activity
		maxAct = 1;
		ans.add(0);
		int lastEnd = end[0];
		for(int i=1;i<end.length;i++) {
			if(start[i] >= lastEnd) {
				
				//activity select
				maxAct++;
				ans.add(i);
				lastEnd = end[i];
				
			}
		}
		
		System.out.println("max activities = "+ maxAct);
		for(int i=0;i<ans.size();i++) {
			System.out.print("A"+ans.get(i)+" ");
		}
		
	}

}
