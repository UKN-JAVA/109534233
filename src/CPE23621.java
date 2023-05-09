
import java.util.Scanner;

public class CPE23621 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int caseon=0;
        while(true){
        caseon++;
        int n=sc.nextInt();
        int sum[]=new int[n];
        boolean b =false;
        for(int i=0;i<n;i++){
            sum[i]=sc.nextInt();
        }
        int sum1[]=new int[20001];
        Outer:
        for(int j=0;j<n-1;j++){
            for(int k=j;k<n;k++){ 
                int sum2=sum[j]+sum[k];
                if(sum1[sum2]>0){
                    b=true;
                    break Outer;
                }else{
                    sum1[sum2]=1;
                    }
                }
            }
            if(b){
                System.out.printf("Case #%d: It is not a B2-Sequence.%n",caseon);
            }else{
                System.out.printf("Case #%d: It is a B2-Sequence.%n",caseon);
            }
            System.out.println();
         }
    }
}
