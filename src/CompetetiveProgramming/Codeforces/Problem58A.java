package CompetetiveProgramming.Codeforces;

/**
 * @author : codedsun
 * Created on 11/08/18
 */

import java.util.*;

/**
 * http://codeforces.com/problemset/problem/58/A
 */
public class Problem58A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        String hello = "hello";
        int c = 0;
        for(int i = 0; i < s.length(); i++) {
            if(c==5 ){
                break;
            }
            if(hello.charAt(c) == s.charAt(i)) {
                c++;
                continue;
            }
            if( c > 0 &&  hello.charAt(c-1) == s.charAt(i)) {
                continue;
            }

        }

        if(c == hello.length() ) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }

}
