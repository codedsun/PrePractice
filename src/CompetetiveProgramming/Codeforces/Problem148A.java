package CompetetiveProgramming.Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 27/08/18
 */
public class Problem148A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 1; i <= d; i++) {
            ar.add(i);
        }
        try {
            for (int i = k; i <= d; i = i + k) {
                ar.remove(new Integer(i));
            }
            for (int i = l; i <= d; i = i + l) {
                ar.remove(new Integer(i));
            }
            for (int i = m; i <= d; i = i + m) {
                ar.remove(new Integer(i));
            }
            for (int i = n; i <= d; i = i + n) {
                ar.remove(new Integer(i));
            }
        }catch (Exception e){

        }
        System.out.println(d-ar.size());

    }
}
