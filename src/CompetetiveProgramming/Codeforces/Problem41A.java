package CompetetiveProgramming.Codeforces;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 27/08/18
 */
public class Problem41A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.next()).reverse();
        String a = sc.next();
        if(s.toString().equals(a)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
