package CompetetiveProgramming.Hackerrank.Stack;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/game-of-two-stacks/problem
 */
public class GameTwoStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        while(g-- >=1){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int a [] = new int[n];
            int b[] = new int[m] ;
            int i;
            for(i = 0; i<n; i++){
                a[i] = sc.nextInt();
            }
            int j;
            for(j = 0; j<m; j++){
                b[j] = sc.nextInt();
            }
            int sum =0;
            i=0;j=0;int count =0;
            while(sum<x){
                if(i<n && j<m){
                    if(a[i]<b[j]){
                        sum = sum+a[i];
                        count++;
                        i++;

                    }
                    else {
                        sum = sum+b[j];
                        count++;
                        j++;
                    }
                }
                else{
                    break;
                }
            }
            System.out.println(count-1);
        }
    }
}
