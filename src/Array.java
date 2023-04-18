package gao;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner Sc = new Scanner(System.in); 
//		  int[] aaa =new int[5];
//		  
//		  for (int i=0;i<aaa.length;i++){
//				aaa[i]=Sc.nextInt();
//			}
//		  Arrays.sort(aaa);
//		  System.out.println("最小"+aaa[0]+"最大"+aaa[4]);
		         // int a[] = {5,4,3,2,1};
		          int a[] = new int[5];
		          a[0] = 5;
		          a[1] = 4;
		          a[2] = 3;
		          a[3] = 2;
		          a[4] = 1;

		          ArrayList<Integer> b = new ArrayList<>();
		          b.add(5);
		          b.add(4);
		          b.add(3);
		          b.add(2);
		          b.add(1);

		          for (int tmp : a)
		              System.out.println(tmp);

		          System.out.println("XXXXXXXXXXXXXXXXXXX");
		          for (int tmp : b)
		              System.out.println(tmp);
		          System.out.println("XXXXXXXXXXXXXXXXXXX");

		          for (int i=0; i<a.length; i++){
		              if (a[i] == 2)
		                  System.out.println("有2");
		          }
		          System.out.println("有沒有2: "+ b.contains(2));

		          System.out.println("XXXXXXXXXXXXXXXXXXX");
		          Collections.sort(b);
		          for (int tmp : b)
		              System.out.println(tmp);


		      }
		  }
//	}
//}
