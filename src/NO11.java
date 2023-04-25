import java.util.Scanner;


public class NO11 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int live[]=new int[10];
        String input =sc.next();
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(c>=48 && c<=57)
                live[c-48]++;
        }
        int maxCount=-1;
        for(int j=0;j<live.length;j++){
            if(maxCount<live[j])
                maxCount=live[j];
        }
        for(int k=maxCount;k>0;k--){
            for(int i=0;i<live.length;i++){
                if(live[i]==k){
                    System.out.println((char)(i+48));
                    return;
                }
            }
        }
    }
}
