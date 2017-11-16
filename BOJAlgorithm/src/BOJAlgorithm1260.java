import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/* 	https://www.acmicpc.net/problem/1260
 	백준 알고리즘 1260번  : DFS와 BFS */
public class BOJAlgorithm1260 {
	static int N,M,V;
	static int visit[], graph[][];
	 
	static void DFS(int x) {
		visit[x]=1;
	    System.out.print(x+" ");
	    for(int i=1; i<=N; i++) {
	    	if(graph[x][i]==1 && visit[i]==0) {
	    		DFS(i);
	    	}
	    }
	}
	static void BFS() {
	    Queue<Integer> q = new LinkedList<Integer>();
	    visit[V] = 1;
	    q.add(V);
	    while(!q.isEmpty()) {
	    	int x = q.peek(); //Queue에서 제거하며 읽기
	    	q.poll(); //Queue에서 제거하지 않고 읽기
	    	System.out.print(x+" ");
	    	for(int i=1; i<=N; i++) {
	    		if(graph[x][i]==1 && visit[i]==0) {
	    			visit[i]=1;
	    			q.add(i);
	    		}
	    	}
	    }
	}
	 
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    N = sc.nextInt();
	    M = sc.nextInt();
	    V = sc.nextInt();
	     
	    graph = new int[N+1][N+1];
	    for(int i=1; i<=M; i++) {
	    	int x = sc.nextInt();
	    	int y = sc.nextInt();
	    	graph[x][y]=graph[y][x]=1;
	    }
	 
	    visit = new int[N+1];
	    DFS(V);
	    System.out.println();
	    visit = new int[N+1];
	    BFS();
	     
	}
}