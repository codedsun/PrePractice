package CompetetiveProgramming.Codeforces;

/**
 * @author : codedsun
 * Created on 03/07/18
 */

import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/96/A
 */
public class Problem96A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if((s.contains("1111111"))||(s.contains("0000000"))){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
