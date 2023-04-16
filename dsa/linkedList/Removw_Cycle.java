package linkedList;

import linkedList.LinkedList.Node;

public class Removw_Cycle extends LinkedList {

	public static void removeCycle() {
		
		//check cycle
		Node slow = head;
		Node fast = head;
		boolean cycle = false;
		
		while(fast !=null && fast.next != null) {
			
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				cycle = true;
				break;
			}
		}
		
		if(cycle = false) {
			return ;
		}
		
		//find meeting point
		slow = head;
		Node prev = null;
		while(slow != fast) {
			prev = fast;
			slow = slow.next;
			fast = fast.next;
		}
		
		//remove the cycle --> last.next = null
		prev.next = null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		head = new Node(1);
		Node temp = new Node(2);
		head.next = temp;
		head.next.next = new Node(3);
		head.next.next.next = head;
				 
	}

}
