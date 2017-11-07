import java.util.Scanner;

//백준 알고리즘 1929번 : 소수 구하기
public class BOJAlgorithm1929 {
  public static void main(String[] args) {
    System.out.print("수를 입력 : ");
    Scanner sc = new Scanner(System.in);
    int scInt = sc.nextInt();
    System.out.print("수를 입력 : ");
    int scInt2 = sc.nextInt();
    for(int i=scInt; i<=scInt2; i++){
      for(int j=2; j<=i; j++){
        if(i%j==0){
          if(i==j){
            System.out.print(i+" ");
          }else break;
        }
      }
    }
    System.out.println();
    System.out.println(scInt+"이상 "+scInt2+"이하의 소수입니다.");
  }
   
}
