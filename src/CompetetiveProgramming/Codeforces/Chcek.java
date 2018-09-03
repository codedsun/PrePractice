package CompetetiveProgramming.Codeforces;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 03/09/18
 */
public class Chcek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = "";
        for(int i = 0; i<s.length(); i++) {
            char z = s.charAt(i);
            int c =0;
            for(int j=0; j< s.length(); j++) {
                if(z== s.charAt(j)){
                    c++;
                }
            }
            result = result+z+c;
            s = s.replace(z+"", "");
            i=0;


        }
        System.out.println(result);
    }
}
