package dsa;
import java.util.Scanner;

public class DijkAlgo {
	
	public int minDistance(int dist[] , Boolean b[], int n) {
		int min = Integer.MAX_VALUE, index =-1;
		for(int x=0;x<n;x++) {
			if(b[x] == false && dist[x] <= min) {
				min = dist[x];
				index = x;
			}
		}
		return index;
	}

	public void dijkstra(int graph[][], int src, int n) {
		int dist[] = new int[n];
		Boolean b[] = new Boolean[n];
		
		for(int i=0;i<n;i++) {
			dist[i] = Integer.MAX_VALUE;
			b[i] = false;
		}
		
		dist[src] = 0;
		for(int count=0;count<n;count++) {
			int u = minDistance(dist,b,n);
			b[u] = true;
			
			for(int x=0;x<n;x++) {
				if(!b[x] && graph[u][x]!=0 && dist[u]!= Integer.MAX_VALUE && dist[u]+graph[u][x]<dist[x]) {
					dist[x] = dist[u]+graph[u][x];
				}
			}
		}
		printGraph(dist,n);
	}
	
	public static void printGraph(int[] dist , int n) {
		System.out.println("Distance from source to Destination is :");
		System.out.println("Source      Destination       distance");
		for(int i=0;i<n;i++) {
			System.out.println("0               "+i+"            "+dist[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of nodes: ");
		int n = input.nextInt();
		int graph[][] = new int[n][n];
		System.out.println("Enter the adjacency matrix:");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				graph[i][j] = input.nextInt();
			}
		}
		System.out.print("Enter the source node: ");
		int src = input.nextInt();
		input.close();
		
		DijkAlgo p = new DijkAlgo();	
		p.dijkstra(graph,src,n);
	}
}
