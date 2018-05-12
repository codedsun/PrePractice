package CompetetiveProgramming.Codeforces;

import java.util.Scanner;

/**
 * @author  : codedsun
 * Created on 12/May/2018
 */
public class Problem158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int h = sc.nextInt();
        int c ; int count =0;
        int a [] = new int[n];
        for(int i =0; i<n;i++){
            a[i] = sc.nextInt();
        }
        h = a[h-1];
        for(int i =0;i<n;i++){
            if(a[i]>=h &&(a[i]!=0 || h!=0)){
                count++;
            }
        }
        System.out.println(count);
    }
}
