package CompetetiveProgramming.Codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 27/08/18
 */
public class Problem337A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[m];
        int b[] = new int[m-n+1];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int c = 0;
        for (int i = 0; i < m - n + 1; i++) {
            b[c] = a[i + (n) - 1] - a[i];
            c++;
        }
        Arrays.sort(b);

        System.out.println(b[0]);


    }
}
