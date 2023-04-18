package gao;

import java.util.Scanner;

public class CPE22131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0;
		while(true) {
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			char input=str.charAt(i);
			if(input=='"') {
				n++;
				if(n==1) {
					System.out.print("``");
				}else {
					 n=0;
					System.out.print("''");
				}
				}else {
					System.out.print(input);
				}
			}
			System.out.println();
		}
	}
}
