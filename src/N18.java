import java.util.Scanner;

public class N18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int sum =sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine().replace("(", "");
		str=str.replace(")","");
		String input[] =str.split(",");
		int num[] =new int [input.length/2];
		String Over="";
		for(int i= 1;i<input.length;i+=2){
			num[(i-1)/2]=Integer.valueOf(input[i]);
		}
		for(int j=0;j<num.length;j++){
			if(2*j+1>=num.length) break;
			if(Math.abs(num[j]-num[2*j+1])<=sum)
				Over=Over+(" "+(char)(j+65)+(char)((2*j+1)+65));

				if(Math.abs(num[j]-num[2*j+2])<=sum){
					Over=Over+(" "+(char)(j+65)+(char)((2*j+2)+65));
		}
	}
	
		System.out.println(Over.substring(1));
		}
}
