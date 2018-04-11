package CompetetiveProgramming.Hackerrank.Stack;

import java.util.Scanner;
import java.util.Stack;

/*
  @author : codedsun

  https://www.hackerrank.com/challenges/simple-text-editor/problem

 */

public class SimpleTextEditor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        int q = sc.nextInt();
        String s = "";
        while(q-- >=1){

            int n = sc.nextInt();
            sc.reset();
            switch (n){
                case 1 : String w = sc.next();
                    s = s+w;
                    stack.push(s);
                    break;

                case 2 :
                    int k = sc.nextInt();
                    s=s.substring(0,s.length()-k);
                    stack.push(s);
                    break;

                case 3 :
                    int k1 = sc.nextInt();
                    System.out.println(s.charAt(k1-1));
                    break;

                case 4 :
                    stack.pop();

                    if(stack.isEmpty()){
                        s="";
                    }
                    else{
                        s = stack.peek();
                    }

                    break;
            }


        }

    }
}
