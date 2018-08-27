package CompetetiveProgramming.Codeforces;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 27/08/18
 */
public class Problem476A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b;
        int c = 0;
        while (n-- >= 1) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (b - a > 1) {
                c++;
            }

        }
        System.out.println(c);
    }
}
