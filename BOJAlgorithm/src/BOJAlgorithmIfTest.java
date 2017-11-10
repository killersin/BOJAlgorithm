import java.util.Scanner;
 /* https://www.acmicpc.net/step/4
 if문 사용해보기 */
public class BOJAlgorithmIfTest {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("========9498번========");
        int score = sc.nextInt();
        if(score>0 && score<=100){
            if(score>=90){
                System.out.println("A");
            }else if(score>=80 && score<90){
                System.out.println("B");
            }else if(score>=70 && score<80){
                System.out.println("C");
            }else if(score>=60 && score<70){
                System.out.println("D");
            }else{
                System.out.println("F");
            }
        }else{
            System.out.println("올바른 점수를 입력하세요.");
        }
        /*System.out.println("========10817번========");
        int[] data = new int[3];
        for(int a=0; a<data.length; a++){
            data[a] = sc.nextInt();
        }
        for(int i=0; i<data.length;i++){
            for(int j=i+1; j<data.length; j++){
                if(data[i]>data[j]){
                    int imsi=data[i];
                    data[i]=data[j];
                    data[j]=imsi;
                }  //if end
            }  //for1 end
        }  //for2 end
        System.out.println(data[1]);
        System.out.println("========10871번========");
        int n = sc.nextInt();
        int x = sc.nextInt();
        int data[] = new int[n];
     
        for(int i=0; i<data.length; i++){
            data[i] = sc.nextInt();
        } //for1 end
        for(int i=0; i<data.length; i++){
            if(data[i]<x){
                System.out.print(data[i]+" ");
            } //if end
        } //for2 end
*/        System.out.println("========1546번========");
        int n = sc.nextInt();
        int data[] = new int[n];
        for(int i=0; i<data.length; i++){
            data[i] = sc.nextInt();
        }
        double sum=0;
        double avg=0;
        for(int i=0; i<data.length;i++){
            for(int j=i+1; j<data.length; j++){
                if(data[i]>data[j]){
                    int imsi=data[i];
                    data[i]=data[j];
                    data[j]=imsi;
                }
            }System.out.print(data[i]+" ");
        }System.out.println();
        for(int i=0; i<data.length; i++){
            if(data[i]>0 && data[i]<=100){
                sum += (double) data[i]/data[data.length-1]*100;
            }else{
                System.out.println("정확한 점수를 입력하세요.");
            }
            avg = sum/data.length;
        }
        System.out.println("평균 : "+String.format("%.2f", avg));
        

    }      
}
