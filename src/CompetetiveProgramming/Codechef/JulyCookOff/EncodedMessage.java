package CompetetiveProgramming.Codechef.JulyCookOff;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 22/07/18
 */
public class EncodedMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        String s;
        StringBuilder sB;
        String rev;
        while (t-- >= 1) {
            rev = "";
            n = sc.nextInt();
            s = sc.next();
            sB = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i = i + 2) {
                sB.append(s.charAt(i));
                sB.append(s.charAt(i + 1));
                rev = rev + sB.reverse().toString();
                sB.setLength(0);
            }
            if (s.length() % 2 == 1) {
                rev = rev + s.charAt(s.length() - 1);
            }

            rev = swapCharacters(rev);
            System.out.println(rev);


        }
    }

    private static String swapCharacters(String swap) {
        String s1 = "";
        int c;
        swap = swap.toLowerCase();
        for (int i = 0; i < swap.length(); i++) {
            c = (97+(122 - swap.charAt(i)));
            s1= s1+(char) c;
        }
        return s1;
    }
}
