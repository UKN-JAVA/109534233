package gao;

import java.util.Scanner;

public class UVA10062 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		while(true) {
			if(a==1) System.out.println();
		String str=sc.nextLine();
		a++;
		int asc[]=new int[96];
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c>=32 && c<=127) {
				asc[c-32]++;
			}
		}
		int SmallCount = -1; 
		for(int i=0; i<asc.length; i++) {
			SmallCount = (SmallCount<asc[i])? SmallCount : asc[i];
		}
		for(int j=0;j<asc.length;j++) {
			for(int k=asc.length-1; k>=0; k--) {
				if(asc[k] == j)
					if(asc[k] !=0)
					System.out.println((32+k)+" "+asc[k]);
				}
			}
			
		}
	}
}
