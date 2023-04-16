package StackB;
import java.util.Stack;

public class Duplicate_parenthesis {

	public static boolean duplicate(String str) {
		Stack<Character> s = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			//closing
			if(ch==')') {
				int count = 0;
				while(s.peek() != '(') {
					s.pop();
					count++;
				}
				
				if(count<1) {
					return true;  //duplicate
				}else {
					s.pop(); //opening pair
				}
			}else {
				//opening condition
				s.push(ch);
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "((a-b))";
		System.out.println(duplicate(str));
		
		String str2 = "(a-b)";
		System.out.println(duplicate(str2));
	}

}
