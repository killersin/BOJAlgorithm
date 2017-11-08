import java.util.Scanner;
/* https://www.acmicpc.net/problem/11053
 백준 알고리즘 11053번 : 가장 긴 증가하는 부분 수열 */
public class BOJAlgorithm11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //수열의 크기 N, N크기의 수열 arr[], 증가하는 부분 수열의 길이 dp[i]
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++){
        arr[i] = sc.nextInt();
        }
        int max=1;
        int dp[] = new int[N];
        for(int i=0; i<N; i++){
            dp[i]=1;
            for(int j=0; j<i; j++){
                if(arr[i]>arr[j] && dp[i]<=dp[j]){
                    dp[i]+=1;
                    if(max<dp[i]){
                        max = dp[i];
                    }
                }
            }
        }
        System.out.println(max);
        sc.close();
 
    }
}