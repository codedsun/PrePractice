package FileHandling;

import java.io.*;
import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 05/09/18
 */
public class FileReading {

    private static String PATH = "/Users/suneetsrivastava/Desktop/suneet.rtf";

    public static void main(String[] args) throws IOException {

        //1st Method
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(new File(PATH)));
        String st;
        while ((st = bufferedReader.readLine()) != null) {
            System.out.println(st);

        }

        //2nd method
        FileReader fr = new FileReader(PATH);
        int i;
        while ((i = fr.read()) != -1) {
            System.out.println((char) i);
        }

        //3rd method
        Scanner sc = new Scanner(new File(PATH));
        while(sc.hasNext()) {
            System.out.println(sc.nextLine());
        }

    }
}
