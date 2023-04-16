package StackB;
import java.util.Stack;

public class Valid_parenthesis {

	public static boolean isValid(String str) {
		Stack<Character> s = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			//opening parenthesis
			if(ch=='(' || ch=='{' || ch=='[') {
				s.push(ch);
			}else {
				//closing parenthesis
				if(s.isEmpty()) {
					return false;
				}else {
					if((s.peek()=='(' && ch==')') ||
						(s.peek()=='{' && ch=='}')	||
						(s.peek()=='[' && ch==']')) {
						s.pop();
					}else {
						return false;
					}
				}
			}
		}
		
		if(s.isEmpty()) {
			return true;
		}else {
			return false; 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "({})[]";
		System.out.println(isValid(str));
	}

}
