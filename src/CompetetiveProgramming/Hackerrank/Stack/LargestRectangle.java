package CompetetiveProgramming.Hackerrank.Stack;

import java.util.Scanner;
import java.util.Stack;
/*
    @author : codedsun
    Problem : https://www.hackerrank.com/challenges/largest-rectangle/problem
 */
public class LargestRectangle {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x ;
      int i = 0;
      int max_area = 0;
      int area=0;
      Stack<Integer> stack = new Stack<>();
      int input[] = new int[n];
      int j=0;
      while(n-- >0){
          x = sc.nextInt();
          input[j] = x;
          j++;
          if(stack.isEmpty() || input[stack.peek()] <= x){
              stack.push(i++);
          }
          else{
              if(stack.isEmpty()){
                  area = input[stack.peek()]*i;
              }
              else
              {
                  int t = input[stack.peek()];
                  stack.pop();
                  if(stack.isEmpty()){
                      area = input[t]*i;
                  }
                  else
                      area = input[t]*(i-stack.peek()-1);
              }
              if(area>max_area){
                  max_area = area;
              }
          }
      }
      while(!stack.isEmpty()){
          int top = stack.peek();
          stack.pop();
          if(stack.isEmpty()){
              area = input[top]*i;
          }
          else {
              area = input[top] * (i - stack.peek() - 1);
          }
          if(area>max_area){
              max_area = area;
          }

      }
        System.out.println(max_area);
    }

}
