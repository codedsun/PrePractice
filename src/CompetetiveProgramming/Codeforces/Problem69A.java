package CompetetiveProgramming.Codeforces;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 27/08/18
 */
public class Problem69A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;
        while(n -- >=1){
            x = x + sc.nextInt();
            y = y + sc.nextInt();
            z = z + sc.nextInt();

        }
        if(x == 0 && y==0 && z==0) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
