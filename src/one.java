package gao;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double height=sc.nextDouble()/100;
		double weight=sc.nextDouble();
		double BMI=0;
		BMI=weight/(height*height);
		if(BMI>=20 && BMI<=25) {
			System.out.printf("第四題結果:最小BMI值=%.0f"+"，正常",BMI);
		}else {
			System.out.printf("第四題結果:最小BMI值=%.0f"+"，不正常",BMI);
		}
		System.out.println();
	}
}
