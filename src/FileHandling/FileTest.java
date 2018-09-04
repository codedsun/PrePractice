package FileHandling;

import java.io.File;

/**
 * @author : codedsun
 * Created on 05/09/18
 */
public class FileTest {

    public static void main(String[] args) {
        File f = new File( "Suneet.txt");
        System.out.println(f.exists());

    }
}
