package CompetetiveProgramming.Hackerrank.WeekOfCode37;

import java.util.Scanner;

public class SimpleLanguage {
    ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = 0;
        String  s;
        long number;
        int n = sc.nextInt();
        while(n-- >=1){

            s = sc.next();

            switch (s){
                case "add" : number = sc.nextLong();
                            if(x<(number+x)){

                                x = number+x;
                            }
                            break;
                case "set" : number = sc.nextLong();
                            if(x<number){
                                x = number;
                            }break;
            }



        }
        System.out.println(x);

    }
}
