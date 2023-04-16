package StackB;
import java.util.Stack;
public class reverseStack extends Bootom_push {

	public static void reverse(Stack<Integer> s) {
		
		if(s.isEmpty()) {
			return;
		}
		
		int top = s.pop();
		reverse(s);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
