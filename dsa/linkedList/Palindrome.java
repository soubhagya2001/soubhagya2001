package linkedList;

public class Palindrome extends LinkedList {

	public Node findMid(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next; //+1
			fast = fast.next;//+2
		}
		
		return slow; //slow is middle node 
	}
	
	
	public boolean checkPalindrome() {
		
		if(head == null || head.next == null) {
			return true;
		}
		
		//step 1 - find mid
		Node midNode = findMid(head);
		
		//step2 - reverse 
		Node prev = null;
		Node curr = midNode;
		Node next;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		Node right = prev;
		Node left = head;
		
		//step 3 - check left half and right half
		while(right != null) {
			if(left.data != right.data) {
				return false;
			}
			
			left = left.next;
			right = right.next;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
