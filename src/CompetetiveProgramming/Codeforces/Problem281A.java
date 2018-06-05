package CompetetiveProgramming.Codeforces;

import java.util.Scanner;

public class Problem281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char first = s.charAt(0);
        first = Character.toUpperCase(first);
        System.out.println(first+s.substring(1,s.length()));
    }
}
