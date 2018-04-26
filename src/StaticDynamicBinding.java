package CompetetiveProgramming;

public class StaticDynamicBinding {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.testInstanceMethod();
        cat.testClassMethod();
        Animal animal = cat;
        animal.testClassMethod();
        animal.testInstanceMethod();


    }
}

class Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}

class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }


}