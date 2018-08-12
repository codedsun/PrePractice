package CompetetiveProgramming.Codeforces;

/**
 * @author : codedsun
 * Created on 12/08/18
 */

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * http://codeforces.com/problemset/problem/236/A
 */
public class Problem236A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> set = new LinkedHashSet<>();
        for(int i = 0; i<s.length(); i++) {
            set.add(new Character(s.charAt(i)));
        }

        if(set.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
