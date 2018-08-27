package CompetetiveProgramming.Codeforces;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 27/08/18
 */
public class Problem580A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int res = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            if (a[i - 1] <= a[i]) {
                c++;

            } else {
                if (c >= res) {
                    res = c;
                }
                c = 0;

            }
        }
        if(c >=res) {
            res = c;
        }
        System.out.println(res+1);

    }
}
