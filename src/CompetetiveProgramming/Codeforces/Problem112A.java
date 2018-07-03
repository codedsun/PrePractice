package CompetetiveProgramming.Codeforces;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 03/07/18
 */

/*
http://codeforces.com/problemset/problem/112/A
 */
public class Problem112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        String s1 = sc.next().toLowerCase();
        int r = (s.compareTo(s1));
        if (r > 0) {
            System.out.println("1");
        } else if (r < 0) {
            System.out.println("-1");
        } else{
            System.out.println(r);
        }
    }
}
