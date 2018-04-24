package Algorithms.Sorting;

/*
 @author : codedsun
 created on 24 April/2018
 */

import java.util.Scanner;

/*
Sorting algorithm Complexity O(n^2)
Its the basic sorting algorithm that works by comparing the next/ajacent  element in the array
In this over one iteration, it's guranteed that the one element will be in the correct place
 */
public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a [] = new int[n];
        int i =0;
        int temp;
        while(i<n){
            a[i] = sc.nextInt();
            i++;
        }
        for(i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                // n-i-1 is done for ignoring the elements that have already been sorted
                if(a[j]>a[j+1]){
                   temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
                }
            }
        }
        for(i = 0 ; i<n;i++){
            System.out.println(a[i]);
        }

    }
}
