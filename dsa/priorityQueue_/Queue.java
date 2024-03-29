package priorityQueue_;

import java.util.Scanner;

public class Queue {
	

		int n = 20 ;
		int queue[] = new int[n];
		int front =-1;
		int rear = -1;
		
		
		
		public void insert(int data) {
			int val;
			if(rear == n-1) {
				System.out.println("Queue overflow");
				return;
			}
			
			if(front == -1) {
				front = rear = 0;
				queue[rear] = data;
				return;
			}
			
			++rear;
			queue[rear] = data;
		}
		
		public void delete() {
			if(front == -1) {
				System.out.println("Queue underflow");
				return;
			}
			
			System.out.println("element deleted : "+queue[front]);
			queue[front] = 0;
			front++;
		}
		
		public void frontElement() {
			if(front == -1) {
				System.out.println("Queue is empty");
				return;
			}
			
			System.out.println("Front element is "+queue[front]);
		}
		
		public void display() {
			if(front == -1) {
				System.out.println("Queue is empty");
				return;
			}
			
			for(int i = front;i<=rear;i++) {
				System.out.print(queue[i]+" ");
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter size of the queue");
		Queue q = new  Queue();
		int ch;
		
		
		do {
			System.out.println("\n1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. front element");
			System.out.println("4. display");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1 :System.out.println("Enter element :"); 
					q.insert(sc.nextInt());
					break;
					
			case 2 : q.delete();
					break;
					
			case 3 : q.frontElement();
					break;
					
			case 4 : q.display();
					break;
					
			case 5 : System.out.println("Exit");
					return;
					
			default : System.out.println("Invalid choice");
			
			}
		}while(ch != 5);
	}

}
