import java.util.Scanner;

/*	백준 알고리즘 11399번 ATM
https://www.acmicpc.net/problem/11399 */
public class BOJAlgorithm11399 {
    public static void main(String[] args){
	    System.out.println("백준알고리즘 11399번 ATM");
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt(); //인원 수 입력
	    int[] people = new int[N]; //배열 생성
	    for(int i=0; i<N; i++){
	    	people[i] = sc.nextInt();
	    }
	    for(int i=0; i<people.length; i++){ //정렬
	    	for(int j=i+1; j<people.length; j++){
	    		if(people[i]>people[i+1]){
	    			int imsi = people[i];
	    			people[i] = people[i+1];
	    			people[i+1] = imsi;
	    		}
	    	}
	    }
	    int min=0;
	    for(int i=0; i<people.length; i++){
	    	for(int j=0; j<=i; j++){
	    		min += people[j];
	    	}
	    }
	    System.out.println(min);
    }
  
}
