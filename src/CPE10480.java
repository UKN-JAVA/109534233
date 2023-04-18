package gao;

import java.util.Scanner;

public class CPE10480 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			int num=sc.nextInt();
			int num1=sc.nextInt();
			int n=0;
			if(num==0 && num1==0) break;
			for(int i=1;i<=num1;i++) {
				int ger=i*i;
				if(ger>=num && ger<=num1) {
					n++;
				}
				if(ger>=num1)
				break;
			}
			System.out.println(n);
		}
	}
}
