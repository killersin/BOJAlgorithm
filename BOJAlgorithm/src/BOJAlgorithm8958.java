import java.util.Scanner;

/* https://www.acmicpc.net/problem/8958
백준 알고리즘 8958번 : OX퀴즈 */
public class BOJAlgorithm8958 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
         
        for(int i=0; i<n; i++) {
          String input = sc.nextLine();
          int result=0;
          int score=0;
          for(int j=0; j<input.length(); j++) {
            if(input.charAt(j)=='O') {
              score++;
              result +=score;
            }else {
              score=0;
            }
          }
          System.out.println(result);
        }
          
    }
  
}
