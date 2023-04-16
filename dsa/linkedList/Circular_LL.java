package linkedList;

import java.util.Scanner;

public class Circular_LL {

	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
		
		public static Node head ;
		public static Node tail;
		
		public static void add(int data) {
			Node newNode = new Node(data);
			
			if(head == null) {
				head = tail = newNode;
				newNode.next = head;
			}else {
				tail.next = newNode;
				tail = newNode;
				tail.next = head;
				
			}
		}
		
		public int delete() {
			Node curr = head.next;
			if(head == null) {
				System.out.println("LinkedList is empty");
				return -1;
			}
			
			while(curr.next!=head) {
				curr = curr.next;
			}
			
			int temp = head.data;
			curr.next = head;
			tail.next = null;
			tail = curr;
			
		}
		
		
		
		public void display() {
			Node current = head;
			if(head == null) {
				System.out.println("List is empty");
			}else {
				do{System.out.print(current.data+"->");
					current = current.next;
		          }while(current!=head);
			}
		}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Circular_LL ll = new Circular_LL();
		int ch;
		
		do {
			System.out.println("\n1. add");
			System.out.println("2. Delete");
			
			System.out.println("3. display");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1 :System.out.println("Enter element :"); 
					int tempNum = sc.nextInt();
					ll.add(tempNum);
					break;
					
			case 2 : System.out.println(ll.delete() +" removed");
					break;
					
					
			case 3 : ll.display();
					break;
					
			case 4 : System.out.println("Exit");
					return;
					
			default : System.out.println("Invalid choice");
			
			}
		}while(ch != 5);

	}
	

}
