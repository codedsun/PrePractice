package CompetetiveProgramming.Codeforces;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 12/08/18
 */
public class Problem133A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); int c = 0;
        String check = "HQ9";
        for(int i = 0;i < check.length(); i++){
            if(s.contains(check.charAt(i)+"")){
                c= 1;
                break;
            }
        }

        if(c==1){
            System.out.println("YES");
        }else
        {
            System.out.println("NO");
        }
    }

}
