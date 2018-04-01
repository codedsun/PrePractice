package java8;

public interface InterfaceTest {

    void method1();
    default void method2(){
        System.out.println("Hello Suneet Interface1");
    }

    static void method3(){
        System.out.println("Method3 Static method called");
    }

}
