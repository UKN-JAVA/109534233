package gao;

import java.util.Scanner;

public class Q10035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
		String str=sc.nextLine();
		String input[]=str.split(" ");
		int b=0;
		int e=input[0].length();
		int e1=input[1].length();
		int n=0;
		if(Integer.valueOf(input[0])==0 && Integer.valueOf(input[1])==0) break; 
		if(input[0].length()<=input[1].length()) b=1;
		for(int i=input[b].length()-1;i>=0;i--) {
				e=e-1;
				if(e<0) {
					input[0]="0";
					e=0;
				}
				e1=e1-1;
				if(e1<0) {
					input[1]="0";
					e1=0;
				}
				int sum=0;
				int sum1=0;
				if(n>0) sum1++;
				sum=(Integer.valueOf(input[0].charAt(e)+""))+(Integer.valueOf(input[1].charAt(e1)+""))+sum1;
				if(sum>=10) n++;
			}	
		if(n==1) 
			System.out.println(n+" carry operation.");
		if(n>=2) 
			System.out.println(n+" carry operations.");
		if(n==0) 
			System.out.println("No carry operation.");
		}
	}
}
