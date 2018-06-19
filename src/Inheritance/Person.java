package Inheritance;

/**
 * @author : codedsun
 * Created on 20/06/18
 */

/**
 * @see Inheritance.Animal for Inhertiance :)
 */
public class Person extends Animal {
    private String name;
    private String color;
    Person(String name, String color, boolean canReproduce, int legs) {
        super(canReproduce, legs);
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
        //Do stuff
        Person suneet = new Person("Suneet","White",true,2);
        System.out.println(suneet.canReproduce);
    }
}
