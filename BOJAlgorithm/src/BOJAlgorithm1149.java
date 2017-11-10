import java.util.Scanner;
/* https://www.acmicpc.net/problem/1149
 백준 알고리즘 1149번 : RGB거리 */
public class BOJAlgorithm1149 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
      int[][] cost = new int[3][N];
      int r, g, b;
        
      cost[0][0] = scanner.nextInt();
      cost[1][0] = scanner.nextInt();
      cost[2][0] = scanner.nextInt();
        
      for(int i = 1; i < N; i++) {
        r = scanner.nextInt();
        g = scanner.nextInt();
        b = scanner.nextInt();
          
        cost[0][i] = r + Math.min(cost[1][i-1], cost[2][i-1]);
        cost[1][i] = g + Math.min(cost[0][i-1], cost[2][i-1]);
        cost[2][i] = b + Math.min(cost[0][i-1], cost[1][i-1]);
      }
      System.out.println(Math.min(cost[0][N-1], Math.min(cost[1][N-1], cost[2][N-1])));
      /*for(int i=0; i<N; i++) {
        for(int j=0; j<N; j++) {
          System.out.print(cost[i][j]+" ");
        }System.out.println();
      }*/
      scanner.close();
 
    }
}