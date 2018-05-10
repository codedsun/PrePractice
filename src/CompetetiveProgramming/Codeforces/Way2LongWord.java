package CompetetiveProgramming.Codeforces;

import java.util.Scanner;

/**
 * @author :codedsun
 * Created on 11/May/2018
 */
public class Way2LongWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        while(n-- >=1){
            String s = sc.next();
            if(s.length()>10){
                System.out.println(s.charAt(0)+""+(s.length()-2)+""+s.charAt(s.length()-1));
            }
            else
                System.out.println(s);
        }
        }


}
