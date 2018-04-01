package java8;

public class InterfaceClassTest implements InterfaceTest,InterfaceTest1 {
    @Override
    public void method1() {
        //
    }

    @Override
    public void method2() {
        InterfaceTest.method3();
    }

    public static void main(String args[]){
        InterfaceClassTest interfaceClassTest = new InterfaceClassTest();
        interfaceClassTest.method2();
    }




}
