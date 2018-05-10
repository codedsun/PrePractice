package CompetetiveProgramming.Codeforces;


import java.util.Scanner;

/**
 * @author: codedsun
 * Created on 11/May/2018
 *
 */
public class Problem1A
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println(String.format("%.0f",Math.ceil(a/c)*Math.ceil(b/c)));
    }
}
