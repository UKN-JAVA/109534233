import java.util.Scanner;

public class N12 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input=sc.next();
        while(true){
        String input1=sc.next();
        String str="";
        int A=0;
        int B=0;

        for(int i=0;i<input.length();i++){
            str=input1.charAt(i)+"";
            int first=input.indexOf(str); 
            if(first >= 0){
                if(i==first){
                 A++;
                }else{
                    B++;
                }
            }      
        }

        System.out.println(A+"A"+B+"B");
        if(A==4)
        System.out.println("END");
        }
    }
}
