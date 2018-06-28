package CompetetiveProgramming.Hackerrank.Stack;


import java.util.Scanner;
import java.util.Stack;

/*
https://www.hackerrank.com/challenges/balanced-brackets/problem
 */

public class BalancedBrackets {

    static boolean match(char a, char b){
        if(a=='(' && b==')') return true;
        if(a=='[' && b==']') return true;
        return a == '{' && b == '}';
    }
    static String isBalanced(String s) {
        // Complete this function
        Stack<Character> stack = new Stack();
        String input = "({[";
        String output=")}]";
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(input.contains(ch+"")){
                stack.push(ch);
            }
            else if(output.contains(ch+"")){
                if(stack.isEmpty()){
                    return "NO";

                }

                else if(!match(stack.pop(),ch)){
                    return "NO";
                }
            }
        }
        if(stack.isEmpty()) {
            return "YES";
        }
        else{
            return "NO";
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
