import java.util.StringTokenizer;

/**
 * @author : codedsun
 * Created on 29/07/18
 */
public class TitleCase {
    public static void main(String[] args) {
        String s = "(suneet srivastava.. is .. good)";
        StringTokenizer st = new StringTokenizer(s);
        String shocal;
        String temp = "";
        int z;

        while (st.hasMoreTokens()) {
            shocal = st.nextToken();
            int i;
            for (i = 0; i < shocal.length(); i++) {
                z = shocal.charAt(i);
                if (z >= 97 && z <= 122) {
                    temp = temp+(shocal.charAt(i) + "").toUpperCase();
                    break;
                } else if (z >= 65 && z <= 90) {
                    break;
                } else {
                    temp += shocal.charAt(i);
                    continue;
                }
            }
            if (!temp.isEmpty()) {
                if(i<shocal.length()) {
                    System.out.println(temp + "" + shocal.substring(i+1, shocal.length()));
                }
                else
                    System.out.println(temp);
                temp = "";
            } else {
                System.out.print(shocal);
            }


        }

    }

//    public static String titleCase(String string) {
//        string = string.toLowerCase();
//        StringBuilder result = new StringBuilder(string.length());
//        String words[] = string.split("[\\ \\(]");
//        for (int i = 0; i < words.length; i++) {
//            if(words[i].isEmpty()){
//                result.append("(");
//            }else {
//                result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
//            }
//
//        }
//        return result.toString();
//    }
}
