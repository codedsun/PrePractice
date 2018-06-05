package CompetetiveProgramming.Codeforces;


import java.util.Scanner;

public class Problem282A {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x = 0;
        int n = sc.nextInt();String s;
        while(n-- >=1){
            s = sc.next();
            if((s.charAt(0)=='+')){
                ++x;
            }
            else if((s.charAt(0)=='-')){
                --x;
            }
            else if(s.charAt(1)=='+'){
                x++;
            }
            else {
                x--;
            }
        }
        System.out.println(x);
    }
}
