package CompetetiveProgramming.Codechef.SudoPlacement;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author : codedsun
 * Created on 24/07/18
 */
public class StackDesign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int q, q1, push;
        while (t-- >= 1) {
            Stack<Integer> s = new Stack<>();
            q = sc.nextInt();
            while (q-- >= 1) {
                q1 = sc.nextInt();
                switch (q1) {
                    case 1:
                        push = sc.nextInt();
                        s.push(push);
                        break;
                    case 2:
                        if (!s.empty()) {
                            s.pop();
                        }
                        break;
                    case 3:
                        if (s.empty()) {
                            System.out.println("-1");
                        } else {
                            System.out.println(s.peek());
                        }
                }

            }
        }
    }
}
