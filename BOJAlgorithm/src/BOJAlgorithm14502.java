import java.util.Scanner;

/*	백준 알고리즘 14502번 연구소(DFS 문제)
	https://www.acmicpc.net/problem/14502 */
public class BOJAlgorithm14502 {
	static int N, M;
	static int totalCNT;
	static int[] dx = {0, -1, 0, 1};
	static int[] dy = {-1, 0, 1, 0};
	static int[][] adMatrix, visit;
	//벽 3개 세우기
	static void DFS(int v, int cnt) {
		int row = v/M;
	    int col = v%M;
	    if(cnt==3) {
	    	for(int i=0; i<N; i++) {
	    		for(int j=0; j<M; j++) {
	    			visit[i][j]=adMatrix[i][j];
	    		}
	    	}
	    	for(int i=0; i<N; i++) {
	    		for(int j=0; j<M; j++) {
	    			if(visit[i][j]==2) {
	    				spreadVirus(i, j);
	    			}
	    		}
	    	}	
	      safetyArea();
	    }else {
	      for(int i=v+1; i<N*M; i++) {
	    	  int row2 = i/M;
	    	  int col2 = i%M;
	    	  if(adMatrix[row2][col2]==0) {
	    		  adMatrix[row2][col2]=1;
	    		  DFS(i, cnt+1);
	    	  }
	      	}
	    }
	    adMatrix[row][col]=0;
	  }
	//바이러스 확산 메소드
	static void spreadVirus(int row, int col) {
		for(int i=0; i<4; i++) {
	    	int nextRow = dx[i]+row;
	    	int nextCol = dy[i]+col;
	    	if(nextRow>=0 && nextRow<N && nextCol>=0 && nextCol<M) {
	    		if(visit[nextRow][nextCol]==0) {
	    			visit[nextRow][nextCol]=2;
	    			spreadVirus(nextRow, nextCol);
	    		}
	    	}
	    }
	}
	//안정 영역 크기 구하기
	static void safetyArea() {
	    int cnt=0;
	    for(int i=0; i<N; i++) {
	    	for(int j=0; j<M; j++) {
	    		if(visit[i][j]==0) {
	    			cnt++;
	    		}
	    	}
	    }
	    if(totalCNT<cnt) {
	    	totalCNT = cnt;
	    }
	}
	  
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    N = sc.nextInt();
	    M = sc.nextInt();
	    adMatrix = new int[N][M];
	    visit = new int[N][M];
	    for(int i=0; i<N; i++) {
	    	for(int j=0; j<M; j++) {
	    		adMatrix[i][j] = sc.nextInt();
	    	}
	    }
	    //알고리즘 풀이
	    for(int i=0; i<N*M; i++) {
	    	int row = i/M;
	    	int col = i%M;
	    	if(adMatrix[row][col]==0) {
	    		adMatrix[row][col]=1;
	    		DFS(i, 1);
	    		adMatrix[row][col]=0;
	    	}
	    }
	    System.out.println(totalCNT);
	    sc.close();
	}  
}
