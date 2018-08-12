package CompetetiveProgramming.Codeforces;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 12/08/18
 */

/**
 * http://codeforces.com/problemset/problem/122/A
 */
public class Problem122A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String number = n+"";
        char z; int c =0;
        for(int i =0;i <number.length();i++){
            z = number.charAt(i);
            if(!((z=='4') || (z=='7'))){
                if((n% 4 == 0 || n%7 ==0 ) && (((n/4)%2 ==0) || ((n/7)%2 ==0))){
                    System.out.println("YES");
                } else{
                    System.out.println("NO");

                }
                System.exit(0);
            }
            else{
                c=1;
            }
        }
        if(c == 1){
            System.out.println("YES");
        }

    }
}
