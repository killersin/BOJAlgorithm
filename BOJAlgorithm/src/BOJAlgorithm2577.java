import java.util.Scanner;
/* https://www.acmicpc.net/problem/2577
 백준 알고리즘 2577번 : 숫자의 개수 */
public class BOJAlgorithm2577 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        int array[] = new int[3];
        int result = 1;
       
        for(int i=0; i<3; i++){
            array[i] = sc.nextInt();
        }
        result = array[0] * array[1] * array[2];
        //System.out.println(result);
 
        while(result>0) {
            int chk = result % 10; //나머지를 chk번째 배열에 넣어 1씩 추가
            result = result / 10;
            num[chk] += 1;
        }
       
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
 
    }
}