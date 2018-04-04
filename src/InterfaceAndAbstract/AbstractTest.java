package InterfaceAndAbstract;

public class AbstractTest extends AbstractClass {
    @Override
    void print() {
        System.out.println("Hello From Abstract Class ");
    }

    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractTest();
        abstractClass.print();
    }
}
