import java.util.Scanner;
/* https://www.acmicpc.net/problem/14501
 백준 알고리즘 14501번 : 퇴사*/
public class BOJAlgorithm14501 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[16]; //상담을 처리해야하는 기간
        int[] p = new int[16]; //상담 완료 후 받을 수 있는 금액
        int[] dp = new int[16]; //얻을 수 있는 최대 수익
     
        for(int i=1; i<=n; i++){
          t[i] = sc.nextInt(); 
          p[i] = dp[i] = sc.nextInt(); 
        }
     
        for(int i=2; i<=n; i++){
          for(int j=1; j<i; j++){
            if(t[j]<=i-j){
              dp[i] = Math.max(p[i]+dp[j], dp[i]);
            }
          }
        }
     
        int max=0;
        for(int i=1; i<=n; i++){
          if(t[i]+i<=n+1){
            if(max<dp[i]){
              max = dp[i];
            }
          }
        }
        System.out.println(max);
        sc.close();
 
    }
}