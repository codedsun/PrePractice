package CompetetiveProgramming.Codeforces;

/**
 * @author : codedsun
 * Created on 03/07/18
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/339/A
 */
public class Problem339A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replace("+", "");
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        for (int i = 0; i <ch.length-1; i++){
            System.out.print(ch[i]+"+");
        }
        System.out.print(ch[ch.length-1]);
    }
}
