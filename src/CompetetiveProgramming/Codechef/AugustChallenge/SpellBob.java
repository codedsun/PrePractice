package CompetetiveProgramming.Codechef.AugustChallenge;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 08/08/18
 */
public class SpellBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 1) {
            String up, down = "";
            up = sc.next();
            down = sc.next();
            int c = 0;
            String bob = "bob";
            for (int i = 0; i < 3; i++) {
                if ((bob.contains(up.charAt(i) + ""))) {
                    bob = bob.replaceFirst(up.charAt(i)+"" ,"");
                    continue;
                } else if (bob.contains(down.charAt(i) + "")) {
                    bob = bob.replaceFirst(down.charAt(i) + "", "");
                    continue;

                } else {
                    c = 1;
                    break;
                }
            }
            if (c == 0 && bob.length()==0){
                System.out.println("yes");
            }
            if(c==1){
                System.out.println("no");
            }
        }
    }
}
