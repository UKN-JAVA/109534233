import java.util.Scanner;

public class NO2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<num;i++){
            String op=sc.next();
            int x=sc.nextInt();
            int y=sc.nextInt();
           switch(op){
            case "+":
            System.out.println(x+y);
            break;
            case "-":
            System.out.println(x-y);
            break;
            case "*":
            System.out.println(x*y);
            break;
            case "/":
            System.out.println(x/y);
            break;
           }
        }
    }
}
