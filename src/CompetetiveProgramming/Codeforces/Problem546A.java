package CompetetiveProgramming.Codeforces;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 27/08/18
 */
public class Problem546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int sum = (w*(w+1)*k)/2;
        int borrow = sum - n;
        if(borrow < 1){
            System.out.println("0");
        }else
        {
            System.out.println( borrow);
        }

    }
}
