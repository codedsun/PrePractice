package CompetetiveProgramming.Codeforces;

/**
 * @author : codedsun
 * Created on 12/08/18
 */

import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/131/A
 */
public class Problem131A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int current = 0;
        for (int i = 1; i < s.length(); i++) {
            current = s.charAt(i);
            if(!(current>=65 && current<=90)) {
                current = -1;
                break;

            }

        }
        if(current == -1){
            System.out.println(s);
        } else {
            current= s.charAt(0);
            if(current >=65 && current<=90) {
                s = s.toLowerCase();
                System.out.println(s);

            }

           else if(current >=97 && current <= 122) {
                current = current - 32;

                s = Character.toString((char)current) + s.substring(1, s.length()).toLowerCase();
                System.out.println(s);

            }

        }
    }


}
