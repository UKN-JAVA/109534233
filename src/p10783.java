package gao;

import java.util.Scanner;

public class p10783 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		int times=sc.nextInt();
		if(times==0)break;
		int put[]=new int[50];
		for(int i=0;i<times;i++) {
		int num=sc.nextInt();
		int num1=sc.nextInt();
		int sum=0;
		for(int j=num;j<=num1;j++) {
			if(j%2!=0) {
				sum+=j;
					}
				}
			put[i]=sum;
			}
		for(int k=0;k<times;k++) {
		System.out.println("Case "+(k+1)+": "+put[k]);
			}
		}
	}
}
