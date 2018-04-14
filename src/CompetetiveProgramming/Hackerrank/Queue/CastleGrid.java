package CompetetiveProgramming.Hackerrank.Queue;

import Queue.LinkedQueue;
import Queue.Queue;

import java.util.LinkedList;
import java.util.Scanner;

public class CastleGrid {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedQueue<String>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] grid = new String[n];
        int i =0;
        while(i<=n){
            grid[i]= sc.next();
        }
        int startX = sc.nextInt();
        int startY = sc.nextInt();
        int goalX = sc.nextInt();
        int goalY = sc.nextInt();
    }
}
