package StackB;
import java.util.Stack;
public class Reverse_String {

	public static String reverse(String str) {
		Stack<Character> s = new Stack<>();
		int idx = 0;
		
		while(idx<str.length()) {
			s.push(str.charAt(idx));
			idx++;
		}
		
		StringBuilder newStr = new StringBuilder("");
		
		while(!s.isEmpty()) {
			newStr.append(s.pop());
		}
		return newStr.toString();
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Soubhagya";
		System.out.println(reverse(str));
	}

}
