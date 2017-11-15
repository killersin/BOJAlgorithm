import java.util.Scanner;

/*백준 알고리즘 1003번 피보나치 함수
 https://www.acmicpc.net/problem/1924 */
public class BOJAlgorithm1924 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int day=0;
        for(int i=1; i<x; i++){
        	if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12){
        		day+=31;
        	}
        	if(i==2){
        		day+=28;
        	}
        	if(i==4 || i==6 || i==9 || i==11){
        		day+=30;
        	}
        }
         
        day+=y;
        int week= day%7;
        switch(week){
          case 0:
            System.out.println("SUN");
            break;
          case 1:
            System.out.println("MON");
            break;
          case 2:
            System.out.println("TUE");
            break;
          case 3:
            System.out.println("WED");
            break;
          case 4:
            System.out.println("THU");
            break;
          case 5:
            System.out.println("FRI");
            break;
          case 6:
            System.out.println("SAT");
            break;
        }
          
    }
  
}
