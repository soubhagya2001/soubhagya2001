package StackB;
import java.util.Stack;

public class Next_Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {6,8,0,1,3};
		Stack<Integer> s = new Stack<>();
		int nextGreater[] = new int[arr.length];

		for(int i=arr.length-1;i>=0;i--) {
			
			//1st while 
			while(!s.isEmpty() && arr[s.peek()]<=arr[i]) {
				s.pop();
			}
			
			//2nd if else
			if(s.isEmpty()) {
				nextGreater[i] = -1;
			}else {
				nextGreater[i] = arr[s.peek()];
			}
			
			//3rd push in
			s.push(i);
			
			
		}
		
		for(int j=0;j<nextGreater.length;j++) {
			System.out.print(nextGreater[j]+" ");
		}
	}

}
