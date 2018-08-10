package CompetetiveProgramming.Codeforces;

/**
 * @author : codedsun
 * Created on 11/08/18
 */

import java.util.Scanner;

/**
 * Problem 116A http://codeforces.com/problemset/problem/116/A
 */
public class Problem116A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long max = 0;
        long prev = 0;
        int a, b;
        while (n-- >= 1) {
            a = sc.nextInt();
            b = sc.nextInt();
            max = (max - a) + b;
            if (prev < max) {
                prev = max;
            }
        }
        System.out.println(prev);
    }
}
