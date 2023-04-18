package gao;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in); 
		int[] aa =new int[10];
		int i;
		int even=0;
		int number=0;
		for (i=0;i<aa.length;i++){
			aa[i]=Sc.nextInt();
		}
		for (i=0;i<aa.length;i++){
			System.out.println(aa[i]);
			if (aa[i] % 2==0) {
				 even++;
			 }else {
				number++; 
			 }
		}			 
		 System.out.println("偶數："+even+",奇數："+number);
	}

}
