import java.util.Scanner;

/*	백준 알고리즘 2566번 최댓값
	https://www.acmicpc.net/problem/2566 */
public class BOJAlgorithm2566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int dp[][] = new int[10][10];
	    int mi=0,mj=0;
	    for(int i=0; i<9; i++) {
	      for(int j=0; j<9; j++) {
	        dp[i][j]=sc.nextInt();
	        if(dp[mi][mj]<dp[i][j]) {
	          mi=i; mj=j;
	        }
	      }
	    }
	    System.out.println(dp[mi][mj]);
	    System.out.println(mi+1+" "+(mj+1));
	    sc.close();
	}
   
}
