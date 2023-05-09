import java.util.Scanner;

public class N14 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int sum=0;
            int num=sc.nextInt();
            String symbol=sc.next();
            int num1=sc.nextInt();
            String symbol1=sc.next();
            int num2=sc.nextInt();

            if(symbol.equals("+"))
                    sum=num+num1;
                else
                    sum=num-num1;

            if(symbol1.equals("+"))
                     sum=sum+num2;
                 else
                     sum=sum-num2; 
            System.out.println(sum);
    }
           
    }
}
