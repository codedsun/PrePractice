package CompetetiveProgramming.Hackerrank.Queue;

import java.util.Scanner;
import java.util.Stack;

public class QUEUESTACK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q  = sc.nextInt();
        Stack<Integer> front = new Stack();
        Stack<Integer> rear  = new Stack();

        while(q-- >=1){
            int type = sc.nextInt();
            if(type == 1){
                front.push(sc.nextInt());
            }

            if(type == 2){
                if(rear.isEmpty()){
                    while(!front.isEmpty()){
                        rear.push(front.pop());
                    }
                    rear.pop();
                }
                if(!rear.isEmpty()){
                    rear.pop();
                }
            }
            if(type == 3){
                if(rear.isEmpty()){
                    while(!front.isEmpty()){
                        rear.push(front.pop());
                    }
                    System.out.println(rear.peek());
                }
                else
                    System.out.println(rear.peek());
            }

        }
    }
}
