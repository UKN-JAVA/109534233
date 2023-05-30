import java.util.Scanner;

public class N19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String input=sc.nextLine();
		int Max=0;
		String Maxs="";
		int io=input.length();
		for(int i =9;i>=0;i--){
			for(int j =io;j>0;j--){
				String str=String.valueOf(i).repeat(j);
				if(input.indexOf(str)>=0){
					if(Max<=j){
						Max=j;
						Maxs=str;
					}
					break;
				}
			}
			}
			System.out.println(Maxs);
		}
}
