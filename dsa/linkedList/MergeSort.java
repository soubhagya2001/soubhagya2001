package linkedList;
import linkedList.LinkedList.Node;

public class MergeSort {

	private Node getMid(Node head) {
		Node slow = head;
		Node fast = head.next;
		
		while(fast != null && fast.next == null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
	public Node mergeSort(Node head) {
		
		if(head==null || head.next!=null ) {
			return head;
		}
		//find mid
		Node mid = getMid(head);
		
		//left and right node sort
		Node rightHead = mid.next;
		mid.next = null;
		Node newLeft = mergeSort(head);
		Node newRight = mergeSort(rightHead);
		
		//merge left and right
		return sort(newLeft,newRight);
	}
	
	private Node sort(Node head1, Node head2) {
		Node mergedLL = new Node(-1);
		Node temp = mergedLL;
		
		while(head1 !=null && head2 != null) {
			if(head1.data <= head2.data) {
				temp.next = head1;
				head1 = head1.next;
				temp = temp.next;
			}else {
				temp.next = head2;
				head2 = head2.next;
				temp = temp.next;
			}
		}
		//remaining elements of 1st ll
		while(head1 != null) {
			temp.next = head1;
			head1 = head1.next;
			temp = temp.next;
		}
		
		//remaining elements of 2nd ll
		while(head2 != null) {
			temp.next = head2;
			head2 = head2.next;
			temp = temp.next;
		}
		
		return mergedLL.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.addFirst(4);
		ll.addFirst(5);
		ll.addFirst(6);
		
		ll.print();
		ll.head = ll.mergeSort(ll.head);
		ll.print();
		
		
	}

}
