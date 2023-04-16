package linkedList;

public class Floyds_cycle extends LinkedList{

	//Floyd's cycle to detect whether the linked list is a cycle or not
	public static boolean isCycle() {
		
		Node slow = head;
		Node fast = head;
		
		while(fast !=null && fast.next != null) {
			slow = slow.next; //+1 wali move for slow 
			fast = fast.next.next;  //+2 wali move for fast
			
			if(slow == fast) {
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = head;
		
		System.out.println(isCycle());
	}

}
