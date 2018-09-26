package CompetetiveProgramming.Codeforces;

/**
 * @author : codedsun
 * Created on 14/09/18
 */

import java.util.Scanner;

/**
 * <a href="http://codeforces.com/problemset/problem/617/A"/>
 */
public class Problem617A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[]{5,4,3,2,1};
        int n = sc.nextInt();
        int c = 0;
        for(int i = 0; i<5; i++) {
            if(n >= a[i]) {
                c++;
                n = n - a[i];
                i = 0;
            }
        }

        System.out.println(c);


    }
}
