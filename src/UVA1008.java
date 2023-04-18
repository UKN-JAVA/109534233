package gao;

import java.util.Scanner;

public class UVA1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true){
			//計數A-Z 出現次數
			int upperCount[]=new int[26];
			int num =sc.nextInt();
			sc.nextLine();
			for(int i=0;i<num;i++) {
				char tmp[] = sc.nextLine().toUpperCase().toCharArray();
				for(int j=0; j<tmp.length; j++) {
					char c =tmp[j];
					if(c>=65 && c<=90) {
						upperCount[c-65]++;
					}
				}
			}
			//找出最大的count
			int maxCount = -1; 
			for(int i=0; i<upperCount.length; i++) {
				//maxCount = (maxCount<upperCount[i])? upperCount[i] : maxCount;
				if(maxCount<upperCount[i])
					maxCount = upperCount[i];
			}
			//從最大的count英文字母 開始往下輸出
			for(int count=maxCount; count>0; count--) {
				for(int j=0; j<upperCount.length; j++) {
					if(upperCount[j] == count)
						System.out.println( ((char)(j+65))+" "+upperCount[j]);
				}
			}
			
			
//			for(int k=0;k<uppercount.length;k++) {
//				for(int o=0;o<uppercount.length;o++) {
//					int temp=0;
//					String temp1="";
//					String temp2="";
//					String temp3="";
//					String temp4="";
//					if(o==uppercount.length-1) {
//							continue;
//						}
//					if(uppercount[o]>uppercount[o+1]) {
//						temp=uppercount[o+1];
//						uppercount[o+1]=uppercount[o];
//						uppercount[o]=temp;
//						temp1=uppercount1[o+1];
//						uppercount1[o+1]=uppercount1[o];
//						uppercount1[o]=temp1;
//					}
//					if(uppercount[o]==uppercount[o+1]) {
//						temp2=uppercount1[o];
//						temp3=uppercount1[o+1];
//						char c =temp2.charAt(0);
//						char c1 =temp3.charAt(0);
//						System.out.println(c+" "+c1);
//						if(c>c1) {
//							temp4=uppercount1[o];
//							uppercount1[o]=uppercount1[o+1];
//							uppercount1[o+1]=temp4;
//						}
//					}
//				}
//			}
//			for(int k=uppercount.length-1;k>=0;k--) {
//				if(uppercount[k]!=0) {
//					System.out.println(uppercount1[k]+" "+uppercount[k]);
//				}
//			}
		}
	}
}
