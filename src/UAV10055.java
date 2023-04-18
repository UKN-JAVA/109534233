package gao;

import java.util.Scanner;

public class UAV10055 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
		long number=sc.nextLong();
		long number1=sc.nextLong();
		number=Math.abs(number-number1);
		System.out.println(number);
		}
	}
}
