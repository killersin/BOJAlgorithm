import java.util.Scanner;

//백준 알고리즘 1003번 피보나치 함수  
public class BOJAlgorithm1003 {
    private static int fiboZero = 0;
    private static int fiboOne = 0;
  
    public static int fibonacci(int n) {
        if(n==0){
            fiboZero++;
            return 0;
        }else if(n==1){
            fiboOne++;
            return 1;
        }else
            return fibonacci(n-1) + fibonacci(n-2);
    }
  
    public static void main(String[] args) {
      System.out.print("반복할 횟수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=0; i<num; i++) {
            fibonacci(sc.nextInt());
            System.out.println(i+"번째 수"+fiboZero + " "+(i+1)+"번째 수" + fiboOne);
            //초기화 부분
            fiboZero = 0;
            fiboOne = 0;
        }
          
    }
  
}
