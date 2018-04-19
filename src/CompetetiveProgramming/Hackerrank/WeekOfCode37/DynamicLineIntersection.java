package CompetetiveProgramming.Hackerrank.WeekOfCode37;

import java.util.ArrayList;
import java.util.Scanner;

class Line{
    int x;
    int b;
    Line(int x,int b){
        this.x = x;
        this.b = b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

public class DynamicLineIntersection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Line> lines = new ArrayList<>();
        int n = sc.nextInt();
        int k,b;
        String c ;int count =0 ;
        while(n-- >=1){

            c = sc.next();


            if(c.equalsIgnoreCase("+")){

                k = sc.nextInt();
                b = sc.nextInt();
                lines.add(new Line(k,b));
            }
            else if(c.equalsIgnoreCase("-")){

                k = sc.nextInt();
                b = sc.nextInt();
                lines.remove(new Line(k,b));
            }
            else if(c.equalsIgnoreCase("?")){
                int query = sc.nextInt();
                for(Line l : lines){
                    if(((query - l.getB())%l.getX())==0){
                        count++;
                    }
                }
                System.out.println(count);
                count = 0;

            }




        }
    }

}
