package InterfaceAndAbstract;

public interface InterfaceTest {

    public static final int val = 9;

    void print();

    /*
      Prior to JDK 8 we can have static, final methods and implementation in Interface itself
     */
    public static void printStatic(){
        System.out.println("Heello from static");
    }
}
