package Map;

/**
 * @author : codedsun
 * Created on 08/08/18
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Consumer;

/**
 * A program to count the number of words in string!
 */
public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        Integer count ;
        Map<String, Integer> wordCount = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            count = wordCount.get(s.charAt(i)+"");
            if(count == null){
                count = 0;
            }
            wordCount.put(s.charAt(i)+"", count+1);
        }

        wordCount.entrySet().forEach(new Consumer<Map.Entry<String, Integer>>() {
            @Override
            public void accept(Map.Entry<String, Integer> stringIntegerEntry) {
                System.out.println(stringIntegerEntry.getKey()+ "   "+stringIntegerEntry.getValue());
            }
        });

    }
}
