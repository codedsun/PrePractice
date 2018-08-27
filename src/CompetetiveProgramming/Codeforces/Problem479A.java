package CompetetiveProgramming.Codeforces;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 27/08/18
 */
public class Problem479A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long res1 = a+b+c;
        long res2 = a*b*c;
        long res3 = (a+b)*c;
        long res4 = a+(b*c);
        long res5 = a*(b+c);
        long res6 = (a*b)+c;
        long result = res1;
        if(result <  res2){
            result = res2;
        } if(result <  res3){
            result = res3;
        } if(result <  res4){
            result = res4;
        } if(result <  res5){
            result = res5;
        } if(result <  res6){
            result = res6;
        }

        System.out.println(result);

    }
}
