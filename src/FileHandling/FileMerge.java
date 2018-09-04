package FileHandling;

import java.io.*;
import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 05/09/18
 */
public class FileMerge {
    private static String PATH = "/Users/suneetsrivastava/Desktop/";
    private static String FILE1 = "/Users/suneetsrivastava/Desktop/suneet.txt";
    private static String FILE2 = "/Users/suneetsrivastava/Desktop/s2.txt";

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File(PATH + "merge.txt");
       // FileInputStream file1 = new FileInputStream(FILE1);
       // FileInputStream file2 = new FileInputStream(FILE2);
        PrintWriter pr = new PrintWriter(f);
        int b;
        FileOutputStream fileOutputStream = new FileOutputStream(f, true);
        try {
            Scanner file1 = new Scanner(new File(FILE1));
            while(file1.hasNext()){
                System.out.println(file1.nextLine());
                pr.append(file1.nextLine());
            }
            System.out.println();

           Scanner file2  = new Scanner(new File(FILE2));
           while (file2.hasNext() ){
               pr.append(file2.nextLine());
           }

        } catch (Exception e)

        {
            e.printStackTrace();
        }
    }
}
