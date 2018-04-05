package InterfaceAndAbstract;

public class InterfaceClass {
    public interface publicInteface{
        void show();
    }

    protected interface protectedInterface{
        void printMe();
    }

    private interface privateInterface{
        void printMe();
    }
}

class Suneet implements InterfaceClass.protectedInterface,InterfaceClass.publicInteface{

    @Override
    public void show() {
        System.out.println("Hi I am public interface");
    }

    @Override
    public void printMe() {
        System.out.println("Hi i am Protected interface");
    }

    public static void main(String[] args) {
        Suneet s = new Suneet();
        s.show();
        s.printMe();
    }
}