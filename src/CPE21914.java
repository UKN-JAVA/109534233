package gao;

import java.util.Scanner;

public class CPE21914 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0;
		String str="";
		String input[]=new String[100];
		while(sc.hasNext()) {
			String input1=sc.nextLine();
			if(input1.isEmpty()) {
				break;
			}else {
				input[n]=input1;
				n++;
			}
		}
		String input2[]=new String[n];
		for(int i=0;i<input2.length;i++) {
		try {
			 str=input[i].charAt(i)+"";
		} catch(Exception e) {
			str="";
			}
		}
	}
}