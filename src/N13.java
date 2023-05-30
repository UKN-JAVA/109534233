import java.util.Scanner;

public class N13 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n=0;
            boolean yes =true;
            String str =sc.next();
            if(str.equals("end")) break;
            for(int i =0;i<str.length();i++){
                char c = str.charAt(i);
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                    if (yes==false) continue;
                    n++;
                    yes=false;
                    continue;
                }
                yes=true;
            }
            System.out.println(n);
        }  
    }
}
