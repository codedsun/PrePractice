package CompetetiveProgramming.Codeforces;

import java.util.*;

/**
 * @link http://codeforces.com/contest/988/problem/A
 * Created on 10/jun/2018
 * @author : codedsun
 */
public class DiverseTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList();
        Set<Integer> set = new LinkedHashSet<>();
        int n = sc.nextInt();
        int size = sc.nextInt();
        int a ;
        for(int i =0; i<n ; i++){
            a = sc.nextInt();
            scores.add(a);
        }
        set.addAll(scores);

        if(size>set.size()){
            System.out.println("NO");
        }else {
            System.out.println("YES");
            for(Integer i : set) {
                System.out.print((scores.indexOf(i)+1)+" ");
            }
        }



    }
}
