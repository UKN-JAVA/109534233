import java.util.Scanner;

public class N04 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char [][] live =new char[3][3];
        String input=sc.nextLine();
        for(int i=0;i<input.length();i++){
                live[0][i]=input.charAt(i);
            }
            String input1=sc.nextLine();
            for(int i=0;i<input1.length();i++){
                live[1][i]=input1.charAt(i);
            }
            String input2=sc.nextLine();
            for(int i=0;i<input2.length();i++){
                live[2][i]=input2.charAt(i);
            }
        char win='-';
        if(live[0][0]==live[0][1] && live[0][1]==live[0][2]) win=live[0][0];
        if(live[1][0]==live[1][1] && live[1][1]==live[1][2]) win=live[1][0];
        if(live[2][0]==live[2][1] && live[2][1]==live[2][2]) win=live[2][0];
        if(live[0][0]==live[1][0] && live[1][0]==live[2][0]) win=live[0][0];
        if(live[0][1]==live[1][1] && live[1][1]==live[2][1]) win=live[0][1];
        if(live[0][2]==live[1][2] && live[1][2]==live[2][2]) win=live[0][2];
        if(live[0][0]==live[1][1] && live[1][1]==live[2][2]) win=live[0][0];
        if(live[0][2]==live[1][1] && live[1][1]==live[2][0]) win=live[0][2];
        System.out.println(win);
    }
}
