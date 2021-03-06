﻿import java.util.Scanner;

/* https://www.acmicpc.net/problem/2609
       백준 알고리즘 2609번 : 최대공약수와 최소공배수
 */
public class BOJAlgorithm2609 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      System.out.print("첫 번째 수를 입력 : "); 
      int a = sc.nextInt(); 
      System.out.print("두 번째 수를 입력 : "); 
      int b = sc.nextInt(); 
      int aa = a;
      int bb = b;
      while(a!=0){ 
        if(a<b){ 
          int temp = a; 
          a = b; 
          b = temp; 
        } 
        System.out.println("a값 : "+ a + " b값 : "+ b);
        a = a-b; 
      } 
      System.out.println("최대공약수: " + b);
      System.out.println("최소공배수: " + aa*bb/b);
    }
  
}
