package MethodOverloading;

/**
 * @author : codedsun
 * Created on 01/07/18
 */

/**
 * The function overloading is also known as <b> Static Polymorphism </b>
 * Function overloading advantages are that they cause not to remember extra names of function
 *
 */
public class FunctionOverloading {

    public void fun1(int a, int b){
        System.out.println(a+b);
    }

    public void fun1(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        FunctionOverloading obj = new FunctionOverloading();
        obj.fun1(1);
        obj.fun1(1,3);
    }


}
