import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/* 	https://www.acmicpc.net/problem/2667
 	백준 알고리즘 2667번 : 단지번호붙이기 */
public class BOJAlgorithm2667 {
	static int N;
	static int[][] adMatrix;
	static int[][] visit;
	static int dx[] = {0, -1, 0, 1};
	static int dy[] = {-1, 0, 1, 0};
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	static int DFS(int row, int col, int totalCNT, int cnt) {
		cnt++;
	    visit[row][col] = 1; //1 true, 0 false
	    for(int i=0; i<4; i++) {
	    	int nextRow = row + dx[i];
	    	int nextCol = col + dy[i];
	    	if(nextRow>0 && nextRow<=N && nextCol>0 && nextCol<=N) {
	    		if(adMatrix[nextRow][nextCol]==1 && visit[nextRow][nextCol]==0) {
	    			cnt = DFS(nextRow, nextCol, totalCNT, cnt);
	    		}
	    	}
	    }
	    return cnt;
	}
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    N = sc.nextInt();
	    adMatrix = new int[N+1][N+1];
	    visit = new int[N+1][N+1];
	    String[] s = new String[N+1];
	    for(int i=1; i<=N; i++) {
	    	s[i] = sc.next();
	    	for(int j=1; j<=N; j++) {
	    		adMatrix[i][j] = s[i].charAt(j-1)-'0';
	    	}
	    }
	     
	    int totalCNT=0;
	    for(int i=1; i<=N; i++) {
	    	for(int j=1; j<=N; j++) {
	    		if(adMatrix[i][j]==1 && visit[i][j]==0) {
	    			totalCNT++;
	    			int cnt = DFS(i,j, totalCNT, 0);
	    			list.add(cnt);
	    		}
	    	}
	    }
	    Collections.sort(list); //오름차순 정렬함수
	    System.out.println(totalCNT);
	    for(int x : list) {
	    	System.out.println(x);
	    }
	    sc.close();
	}
	  
}