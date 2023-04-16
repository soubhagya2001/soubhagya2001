package StackB;
import java.util.Stack;

public class Bootom_push {

	public static void pushAtBottom(Stack<Integer> s, int data) {
		
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		//remove from top
		int temp = s.pop();
		pushAtBottom(s, data);
		s.push(temp);//add the removed element
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		
		pushAtBottom(s, 4);
		while(!s.isEmpty()) {
			System.out.print(s.pop());
		}
	}

}
