import java.util.Scanner;
/* 	https://www.acmicpc.net/problem/11403
 	백준 알고리즘 11403번 경로 찾기(DFS문제) */
public class BOJAlgorithm11403 {
	static int N;
	static int[][] adMatrix;
	
	static void DFS(int x, int[] visit, Boolean isFirst) {
	    if(isFirst) { 
	    	visit[x] = 1;
	    }
	    for(int i=1; i<=N; i++) {
	    	if(adMatrix[x][i]==1 && visit[i]==0) {
	    		DFS(i, visit, true);        
	    	}     
	    }
	}
	public static void main(String[] args) {
	  	Scanner sc = new Scanner(System.in);
	    N = sc.nextInt();
	    adMatrix = new int[N+1][N+1];
	    for(int i=1; i<=N; i++) {
	      for(int j=1; j<=N; j++) {
	        adMatrix[i][j] = sc.nextInt();
	      }
	    }
	    //알고리즘 풀이
	    for(int i=1; i<=N; i++) {
	    	int[] visit = new int[N+1];
	    	DFS(i, visit, false);
	    	for(int j=1; j<=N; j++) {
	    		System.out.print(visit[j]+" ");
	    	}
	    	System.out.println();
	    }
	    sc.close();
	}
	
}