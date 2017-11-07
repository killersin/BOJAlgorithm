import java.util.Scanner;

//문자열 반복
public class BOJAlgorithm2675 {
	
	public static void main(String[] args) {
		char[] ch;
	    Scanner sc = new Scanner(System.in);
	    //test변수는 반복하려는 횟수
	    int test = Integer.parseInt(sc.nextLine());
	    for( int t=1; t<=test; t++){
	      //ch 배열은 반복하려는 문자열
	      ch = sc.nextLine().toCharArray();
	      int num = Integer.parseInt(String.valueOf(ch[0]));
	      for(int i=2; i<ch.length; i++){
	        char a = ch[i];
	        for(int j=0; j<num; j++){
	          System.out.print(a);
	        }
	      }
	      System.out.println();
	    }
	}

}
