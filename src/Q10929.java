package gao;

import java.util.Scanner;

public class Q10929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
		String positive=sc.next();
		if(positive.equals("0")) break;
		int num1=0;
		int num2=0;
		for(int i=0;i<positive.length();i++) {
			if(i%2==0) {
				num1+=Integer.valueOf(positive.charAt(i)+"");
			}else {
				num2+=Integer.valueOf(positive.charAt(i)+"");
			}
		}
		num1=Math.abs(num1-num2);
		if(num1%11==0 || num1==0) {
			System.out.println(positive+" is a multiple of 11.");
		}else {
			System.out.println(positive+" is not a multiple of 11.");
			}
		}
	}
}
