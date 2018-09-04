package Inheritance;

/**
 * @author : codedsun
 * Created on 04/09/18
 */
public class ParentClass {
    ParentClass(){
        System.out.println("Parent class constructor");
    }

    ParentClass(String s) {
        System.out.println(s+ " calling parent");
    }
}

class ChildClass extends ParentClass {
    ChildClass() {
        System.out.println("Child class constructor");
    }

    ChildClass(String s) {
        super(s);
        System.out.println(s+" calling child");
    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        ChildClass childClass1 = new ChildClass("Suneet");
    }
}
