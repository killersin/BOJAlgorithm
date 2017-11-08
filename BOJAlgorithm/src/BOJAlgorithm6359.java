import java.util.Scanner;
/* https://www.acmicpc.net/problem/6359
 백준 알고리즘 6359번 : 만취한 상범
*/
public class BOJAlgorithm6359 {
    public static void main(String[] args) {
        //테스트 수 T, 방의개수 n, 방 room[], 열린 방의 수 cnt,라운드 round, 문 상태 door 
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int cnt=0;
            int n = sc.nextInt();
            boolean room[] = new boolean[n];
            for(int round=1; round<=n; round++){
                for(int door=0; door<n; door++){
                    if((door+1)%round==0){
                        if(room[door]==false){
                            cnt++;
                            room[door]=true;
                        }else{
                            cnt--;
                            room[door]=false;
                        }
                    }
                }
            }
        System.out.println(cnt);
        }
        sc.close();
    }
}