package MethodOverloading;

/**
 * @author : codedsun
 * Created on 01/07/18
 */

/**
 * Yes, We can overload static methods, let 's check how
 */
/**<b>
 * We can't overload methods, that differ only by  static keyword
 * </b>
 */
public class StaticMethodsOverloading {

    public static void fun1(int a){
        System.out.println(a);
    }

    public static void fun1(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        fun1(2);
        fun1(2,3);
    }
}
