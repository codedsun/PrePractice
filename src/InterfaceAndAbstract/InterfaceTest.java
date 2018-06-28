package InterfaceAndAbstract;

public interface InterfaceTest {

    int val = 9;

    void print();

    /*
      Prior to JDK 8 we can have static, final methods and implementation in Interface itself
     */
    static void printStatic(){
        System.out.println("Heello from static");
    }
}
