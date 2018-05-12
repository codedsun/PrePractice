package CompetetiveProgramming.Codeforces;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 12/May/2018
 */

public class Problem118A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        char dot = '.';
        s = s.replace("a","");
        s = s.replace("e","");
        s = s.replace("i","");
        s = s.replace("o","");
        s = s.replace("u","");
        s = s.replace("y","");
        String s1 = "";
        for(int i =0;i<s.length();i++){
            s1 = s1+dot+s.charAt(i);
        }
        System.out.println(s1);


    }
}