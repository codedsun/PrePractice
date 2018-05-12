package CompetetiveProgramming.Codeforces;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 13/May/2018
 */
public class Problem231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;int total= 0;int j;
        for(int i =1; i<=n*3;i++){
            j = sc.nextInt();
            total = total+j;
            if(i%3 == 0 ){
                if(total>=2){
                    c++;
                }
                total = 0;
            }
        }
        System.out.println(c);

    }
}
