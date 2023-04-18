package gao;

import java.util.Scanner;

public class CPE10425 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		String map="134567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
		String str=sc.nextLine().toLowerCase();
		int first=0;
		for(int i=0;i<str.length();i++) {
			char input=str.charAt(i);
			if(input==' ') {
				System.out.print(' ');
				continue;
			}
			first=map.indexOf(input);
			first=first-2;
			char c=map.charAt(first);
			System.out.print(c);
		}
		System.out.println();
		}
	}
}
