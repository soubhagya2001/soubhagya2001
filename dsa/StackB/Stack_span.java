package StackB;

public class Stack_span {

	public static void stockSpan(int stock[], int span[]) {
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int stocks[] = {100,80,60,70,60,85,100};
		int span[] = new int[stocks.length];
		stockSpan(stocks,span);
		
		for(int i=0;i<span.length;i++) {
			System.out.print(span[i]+" ");
		}
	}

}
