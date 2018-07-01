/**
 * @author : codedsun
 * Created on 01/07/18
 */

/**
 * Shadowing is the concept in which the base class and derived class have same static methods,
 * then the derived class method shadows the base class method
 */

class A {
    static void fun() {
        System.out.println("A");
    }

}

class B extends A {
    static void fun() {
        System.out.println("B");
    }
}

public class ShadowingStaticFunction {
    public static void main(String[] args) {
        A obj = new B();//Shadowing happens
        obj.fun();
    }
}
