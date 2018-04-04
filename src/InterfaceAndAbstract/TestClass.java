package InterfaceAndAbstract;

public class TestClass implements InterfaceTest {
    @Override
    public void print() {
        System.out.println("Hello from Interface test");
        InterfaceTest.printStatic();
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.print();
    }
}
