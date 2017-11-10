import java.util.Scanner;
/* https://www.acmicpc.net/problem/9095
 백준 알고리즘 9095번 : 1,2,3 더하기 */
public class BOJAlgorithm11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //방법의 수를 테스트할 갯수
        int[] arr = new int[11];
     
        arr[1]=1; 
        arr[2]=2;
        arr[3]=4;
        //경우의 수 추출
        for(int i=0; i<T; i++){
            int n = sc.nextInt();
            for(int j=4; j<=n; j++){
                arr[j]=arr[j-3]+arr[j-2]+arr[j-1];
            }
            System.out.println(arr[n]);
        }
 
    }
}