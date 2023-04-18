package gao;

import java.util.Scanner;

public class CPE11076 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			int N=sc.nextInt();
			if(N==0) break;
			int G=0;
			for(int i=1;i<N;i++) {
				for(int j=i+1;j<=N;j++) {
					G+=GCD(i,j);
				}
			}
				System.out.println(G);
			
		}
	}
	static int GCD(int x, int y) {
		int num=1;//最大公因數
		int num1=Math.min(x, y);//小數
		for(int i=num1;i>=1;i--) {
			if(x%i==0 && y%i==0) {
				num=i;
				break;
			}
		}
		return num;
		
	}
}
