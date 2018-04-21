package CompetetiveProgramming.Codechef.CLASSXII;

import java.util.Scanner;

public class CODEX003 {

    public static boolean isVowel(char a){
        return (a=='a'||a=='e'||a=='o'||a=='u'||a=='i');

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        String f = "";
        for(int i =0;i <s.length();i++){
           if(!(isVowel(s.charAt(i)))&&(s.charAt(i)!=' ')) {
               f = f+s.charAt(i)+'o'+s.charAt(i);

           }
           else{
               f = f+s.charAt(i);
           }

        }
        System.out.println(f);
    }
}
