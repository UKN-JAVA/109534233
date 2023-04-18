package gao;
import java.util.Scanner;

public class CPE22811{
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        while(true){
        	int nn=sc.nextInt();
            for(int i=0;i<nn;i++){
            int n=sc.nextInt();
            int num[]=new int[n];
            for(int j=0;j<num.length;j++){
                num[j]=sc.nextInt();
            }
            int n1=0;
            for(int k=0;k<num.length;k++) {
            	for(int o=0;o<num.length;o++) {
            		int exist=0;
            		if(o==num.length-1) {
						continue;
					}  
            		if(num[o]>num[o+1]) {
            			n1++;
            			exist=num[o+1];
            			num[o+1]=num[o];
            			num[o]=exist;
            		}
            	}
            }
            System.out.printf("Optimal train swapping takes %d swaps.",n1);
            System.out.println();
            }
            
        }
    }
}
