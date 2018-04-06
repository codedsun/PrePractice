package Hackerrank.Stack;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int check = Integer.MIN_VALUE;
        ArrayList<Integer> arr = new ArrayList();
        ArrayList<Integer> max = new ArrayList();
        Integer x ;

        while(n-- >=1){
            int choice = sc.nextInt();
            switch (choice){

                case 1: x = sc.nextInt();
                        if(x>check){
                            check = x;
                        }
                        max.add(check);
                        arr.add(x);
                        break;
                case 2: arr.remove(arr.size()-1);
                        max.remove(max.size()-1);
                      if(max.size()>0){
                        check = max.get(max.size()-1);
                     }else{
                        check = Integer.MIN_VALUE;
                     }
                      break;
                case  3:
                    System.out.println(max.get(max.size()-1));

            }
        }
    }
}


