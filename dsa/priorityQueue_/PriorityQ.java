package priorityQueue_;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.PriorityQueue;

public class PriorityQ {

	static class Student implements Comparable<Student>{
		String name;
		int rank;
		
		public Student(String name, int rank) {
			this.name = name;
			this.rank = rank;
		}
		
		@Override
		public int compareTo(Student s2) {
			return this.rank - s2.rank;
		}
	}
	
	static PriorityQueue<Student> pq = new PriorityQueue<>();
	
	static void insert(String name , int rank) {
		pq.add(new Student(name,rank));
	}
	
	static void remove() {
		System.out.println("Removed : "+pq.peek().name+" -> "+pq.peek().rank);
		pq.remove();
	}
	
	static void display() {
		while(!pq.isEmpty()) {
//			System.out.println(pq.peek().name+" -> "+pq.peek().rank); //O(log 1)
//			pq.remove(); //O(log n)
			
			Iterator value = pq.iterator();
			while(value.hasNext()) {
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		pq.add(new Student("A",4)); //O(log n)
		pq.add(new Student("B",5));
		pq.add(new Student("C",2));
		pq.add(new Student("D",12));
		
		System.out.println("1. Insert \n2.remove \n3.display \n4.Exit");
		int choice = 0;
		do {
			System.out.println("Enter choice : ");
			choice = sc.nextInt();
			switch(choice) {
				case 1 : System.out.println("Enter name and rank :");
				           insert(sc.next(),sc.nextInt());
				           break;
				           
				case 2 : remove();
							break;
				
				case 3 : display();
							break;
				
				case 4 : return;
				           
			}
		}while(choice != 4);
		
	}

}
