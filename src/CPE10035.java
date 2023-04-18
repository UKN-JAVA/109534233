package gao;

import java.util.Scanner;

public class CPE10035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
		int num=sc.nextInt();
		int num1=sc.nextInt();
		if(num==0 & num1==0) break;
		int count=0;
		int pcount=0;
		while(num!=0 || num1!=0) {
		int input=num%10;
		int inpu1=num1%10;
		if(input+inpu1+pcount>=10) {
			count++;
			pcount=1;
		}else {
			pcount=0;
		}
		num=num/10;
		num1=num1/10;
			}
		if(count==0) {
			System.out.println("No carry operation.");
		}else {
			if(count==1) {
				System.out.println("1 carry operation.");
			}else {
				System.out.println(count+" carry operations.");
			}
		}
		}
	}
}
