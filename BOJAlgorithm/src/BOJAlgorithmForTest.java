import java.util.Scanner;
 /* https://www.acmicpc.net/step/3
 for문 사용해보기 */
public class BOJAlgorithmForTest {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      System.out.println("2739=======================");
      for(int i=1; i<=9; i++){ //2739번
        System.out.println(a+" * "+i+ " = "+ a*i);
      }
      System.out.println("2741=======================");
      for(int i=1; i<=a; i++){ //2741번
        System.out.println(i);
      }
      /*System.out.println("2742=======================");
      for(int i=a; a>=1; a--){ //2742번, a값이 변해서 주석처리했습니다.
        System.out.println(a);
      }*/
      System.out.println("2438=======================");
      for(int i=1; i<=a; i++){ //2438번
        for(int j=1; j<=i; j++){
          System.out.print("*");
        }System.out.println();
      }
      System.out.println("2439=======================");
      for(int i=1; i<=a; i++){ //2439번
        for(int j=a-i; j>0; j--){
          System.out.print(" ");
        }
        for(int k=i; k>0; k--){
          System.out.print("*");
        }
        System.out.println();
      }
      System.out.println("2440=======================");
      for(int i=a; i>=1; i--){ //2440번
        for(int j=1; j<=i; j++){
          System.out.print("*");
        }System.out.println();
      }
      System.out.println("2441=======================");
      for(int i=0; i<a; i++){
        for(int j=a-i; j<a; j++){
          System.out.print(" ");
        }
        for(int k=a-i; k>0; k--){
          System.out.print("*");
        }
        System.out.println();
      }
    }
    System.out.println("8393==============");
      System.out.print("수를 입력 : ");
      int a = sc.nextInt();
      int sum = 0;
      for(int i=0; i<a; i++){
        sum = sum + i;
      }
      System.out.println(a + "의 합 "+ sum);
      System.out.println("11720==============");
      int n = sc.nextInt();
      String num = sc.next();
      int result = 0;
      for(int i=0; i<n; i++){
        result = result + num.charAt(i) - 48;
      }
      System.out.println(result);
      System.out.println("11721==============");
        String words = sc.next();
        if(words.length()>0 && words.length()<=100){  //0보다 크며 100길이를 넘지 않는 조건
            for(int i=0; i<=words.length(); i++){
                int x = i*10; //
                int y = x+10; //
                String word="";
                if(x==0){ 
                  word = words.substring(0, 10); //substring(), x부터 y전까지 위치의 문자열을 가져오는 함수
                  System.out.println(word);
                }else if(y<=words.length()){
                  word = words.substring(x, y);
                  System.out.println(word);
                }else{
                  word = words.substring(x, words.length());
                  System.out.println(word);
                  break;
                }
            }
        }else{
          System.out.println("글자수를 초과하거나 부족합니다.");
        }
         
    }      
}
