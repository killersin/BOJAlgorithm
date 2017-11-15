import java.util.Scanner;

/*	백준 알고리즘 2579번 계단오르기
 	https://www.acmicpc.net/problem/2579 */
public class BOJAlgorithm2579 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        for(int i=0; i<n; i++) {
          arr[i] = sc.nextInt();
        }
        int dp[] = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],0) + arr[1];
        dp[2] = Math.max(arr[0], arr[1])+ arr[2];
        for(int i=3; i<n; i++) {
          dp[i] = Math.max(dp[i-3]+arr[i-1], dp[i-2]) + arr[i];
        }
        System.out.println(dp[n-1]);
        sc.close();
          
    }
  
}
