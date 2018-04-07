package CompetetiveProgramming.Hackerrank.Arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {
    /*
     * Complete the arrayManipulation function below.
     */
    static int arr[];



    static int arrayManipulation(int n, int[][] queries) {
        /*
         * Write your code here.
         */
        int max = 0;
        arr = new int[n];
        int a, b, c=0;
        for(int i=0;i<queries.length;i++){
            a = queries[i][0];
            b = queries[i][1];
            c = queries[i][2];
            update(a,b,c);
        }
        Arrays.sort(arr);
        return arr[0];

    }
    private static void update(int a, int b, int c){
        for(int i =a;i<=b;i++){
            arr[i] = arr[i]+c;
        }
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[][] queries = new int[m][3];

        for (int queriesRowItr = 0; queriesRowItr < m; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 3; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
