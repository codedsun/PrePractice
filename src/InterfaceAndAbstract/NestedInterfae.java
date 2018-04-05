package InterfaceAndAbstract;

public class NestedInterfae implements Nested1.Nested2{

    @Override
    public void show() {
        System.out.println("Hello from Nested2 Interface");
    }

    public static void main(String[] args) {
        NestedInterfae nestedInterfae = new NestedInterfae();
        nestedInterfae.show();
    }
}

interface Nested1{
    interface Nested2{
        void show();
    }
}
