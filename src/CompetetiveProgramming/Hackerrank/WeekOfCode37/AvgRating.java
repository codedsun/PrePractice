package CompetetiveProgramming.Hackerrank.WeekOfCode37;

import java.util.Scanner;

public class AvgRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float total = 0;
        int count = 0;
        int number =0;
        while(n-- >=1){
            number = sc.nextInt();
            if(number >=90 ){
                total += number;
                count++;
            }
        }


        float avg = (total/count);

        avg = (float) (Math.round(avg*100));
        avg = avg/100;
        System.out.println(String.format("%.2f",avg));
    }
}
