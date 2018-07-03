package CompetetiveProgramming.Codeforces;

/**
 * @author : codedsun
 * Created on 03/07/18
 */

import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/263/A
 */
public class Problem263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int i = 3;
        int j = 3;
        int i1 = 0, j1 = 0;
        for (int k = 1; k <= 5; k++) {
            s = sc.nextLine().replace(" ", "").trim();
            if (s.contains("1")) {
                i1 = k;
                j1 = s.indexOf("1") + 1;
            }
        }
        System.out.println(Math.abs(i1 - i) + Math.abs(j1 - j));

    }
}
