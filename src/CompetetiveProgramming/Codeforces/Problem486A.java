package CompetetiveProgramming.Codeforces;

/**
 * @author : codedsun
 * Created on 06/09/18
 */

import java.util.Scanner;

/**
 * <a href="http://codeforces.com/problemset/problem/486/A"></a>
 */
public class Problem486A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        double odd =  Math.ceil(t/2);
        double even = t - odd;
        double sum = Math.pow(even,2)+even - (Math.pow(odd,2));
        String s = String.format("%.0f",sum);
        System.out.println(s);
    }
}
