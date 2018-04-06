public class AnonymousInnerClass {

    public static void main(String[] args) {
        /*
        This was the method preferred but we chose to make anonymous inner class
         */
        Suneet suneet = new Suneet();
        suneet.getAge();
        /*Anonymous Inner Class*/
        Age oj1 = new Age() {
            @Override
            public void getAge() {
                System.out.println(age);
            }
        };

        oj1.getAge();
    }
}

interface Age{
    int age = 20;
    void getAge();
}

/*
    No need to make another class but still shown
 */
class Suneet implements Age{

    @Override
    public void getAge() {
        System.out.println(age);
    }
}
