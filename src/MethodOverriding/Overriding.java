package MethodOverriding;

/**
 * @author : codedsun
 * Created on 01/07/18
 */

/**
 * Method overriding is also known as dynamic dispatch or runtime polymorphism
 */
class Parent{
    void show(){
        System.out.println("Parent Class");
    }
}

class Child extends Parent{
    @Override
    void show() {
        System.out.println("Child class");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.show();

        Parent parent1 = new Child();
        parent1.show();

        Child child = new Child();
        child.show();
    }

}
