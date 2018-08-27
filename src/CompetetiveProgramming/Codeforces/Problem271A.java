package CompetetiveProgramming.Codeforces;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author : codedsun
 * Created on 27/08/18
 */
public class Problem271A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n++;
        int n1 =n;
        Set<Integer> set = new LinkedHashSet<>();
        while(set.size() != 4) {
            set.clear();
            set.add(n1%10);
            n1 = n1/10;
            set.add(n1%10);
            n1 = n1/10;
            set.add(n1%10);
            n1 = n1/10;
            set.add(n1%10);

            n++;
            n1  = n;
        }
        System.out.println(n-1);

    }
}
