package CompetetiveProgramming.Hackerrank.Arrays;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/sparse-arrays
 */

public class SparseArrays {
    private static String[] s;
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        s = new String[n];

        for(int i=0;i<n;i++){
            s[i] = sc.next();
        }

        int q = sc.nextInt();
        for(int i =0;i<q;i++){
            String query  = sc.next();
            System.out.println(count(query));
        }
    }

    public static int count(String query){
        int count = 0;
        for(int i =0;i<s.length;i++){
            if(s[i].equalsIgnoreCase(query)){
                count++;
            }
        }
        return count;
    }
}
