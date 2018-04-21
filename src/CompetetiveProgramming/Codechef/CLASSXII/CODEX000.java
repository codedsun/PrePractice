package CompetetiveProgramming.Codechef.CLASSXII;

import java.util.Scanner;
import java.util.Stack;

public class CODEX000 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        Stack<String> stack = new Stack<>();
        String x,y;String t ;
        for(int i = s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(!((ch == '+' || ch=='-' || ch== '/' || ch=='*'))){
                stack.push(ch+"");
            }
            else{
                x = stack.pop();
                y = stack.pop();
                t = x+y+""+ch;
                stack.push(t);
            }
        }
        System.out.println(stack.pop());
    }
}
