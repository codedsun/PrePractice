package CompetetiveProgramming.Codeforces;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 27/08/18
 */
public class Problem110A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = 0;
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == '4' || s.charAt(i) == '7') {
                c++;
            }
        }
        String c1 = c+"";
        for(int i =0; i<c1.length(); i++){
            if(!(c1.charAt(i) == '4' || c1.charAt(i) == '7')){
                c1 = null;
                break;
            }
        }
        if(c1 == null) {
            System.out.println("NO");
        }else
        {
            System.out.println("YES");
        }
    }
}
