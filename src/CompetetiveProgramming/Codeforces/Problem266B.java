package CompetetiveProgramming.Codeforces;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 27/08/18
 */
public class Problem266B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        StringBuilder queue; String input = sc.next();
        queue = new StringBuilder(input);
        while (t-- >= 1) {
            for(int i = 0; i<queue.toString().length()-1; i++) {
                if(queue.charAt(i) == 'B' && queue.charAt(i+1) =='G') {
                    queue.setCharAt(i,'G');
                    queue.setCharAt(i+1,'B');
                    i= i+1;
                }
            }
        }
        System.out.println(queue.toString());
    }
}
