import java.util.Scanner;
import java.util.Stack;

public class N16 {
    public static void main(String[] args) throws Exception {
        Stack<String> st =new Stack<String>();
        Scanner sc = new Scanner(System.in);
        String input[]=sc.nextLine().split(" ");

        for(int i=0;i<input.length;i++){
            String str=input[i];
            char c = str.charAt(0);
            if(c>=48 && c<=57){
                System.out.print(str+" ");
            }else{
                if(st.empty()==true){
                    st.push(str);
                }else{
                    if(c==42 || c==47){
                        while(true){
                            if(!st.empty()) break;
                            char xx =st.peek().charAt(0);
                            if(xx==43 || xx==45) break;
                            System.out.print(st.pop());
                        }
                    }else{
                        if(!st.empty()){
                        String x=st.pop();
                    }
                    st.push(str);
                }
            }
        }
        }
        while(!st.empty()){
            System.out.print(st.pop());
        }
    }
}
