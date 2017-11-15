import java.util.Scanner;

/*	백준 알고리즘 11052번 붕어빵 판매하기
	https://www.acmicpc.net/problem/11052 */
public class BOJAlgorithm11052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n+1];
	    for(int i=1; i<=n; i++) {
	      arr[i] = sc.nextInt();
	    }
	    int dp[] = new int[n+1];
	    for(int i=1; i<=n; i++) {
	      for(int j=1; j<=i; j++) {
	        dp[i] = Math.max(dp[i], dp[i-j]+arr[j]);
	      }
	    }
	    System.out.println(dp[n]);
	    sc.close();
	}
   
}
