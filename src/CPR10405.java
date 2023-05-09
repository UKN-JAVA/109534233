
import java.util.Scanner;

public class CPR10405 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        while(true){
        int n=sc.nextInt();
        int sum[]=new int[n];
        for(int i=0;i<n;i++){
            sum[i]=sc.nextInt();
        }
        int scope[]=new int[n];
        boolean b =true;
        for(int i=0;i<n-1;i++){
            int sum1=Math.abs(sum[i]-sum[i+1]);
            if(sum1>0 && sum1<n){
                if(scope[sum1]==0){
                    scope[sum1]=1;
                }else{
                    b=false;
                    break;
                }
            }else{
                b=false;
                break;
            }
        }
            if(b){
                System.out.println("Jolly");
            }else{
                System.out.println("Not jolly");
            }
         }
    }
}
