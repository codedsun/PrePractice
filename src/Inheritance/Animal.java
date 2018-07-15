package Inheritance;

/**
 * @author : codedsun
 * Created on 20/06/18
 */

/**
 * Inheritance is the technique by which one class can inherit the properties/methods
 * of another class. Eg Mammal -> Person, Parents -> Child // Please don;t assume them as Kotlin operator lol
 */
public class Animal {
    public int var = 10;
    boolean canReproduce;
    int legs;

    Animal(boolean canReproduce, int legs) {
        this.canReproduce = canReproduce;
        System.out.println(this.getClass());
        System.out.println(this.hashCode());
        this.legs = legs;
    }

    public boolean isCanReproduce() {
        return canReproduce;
    }

    public void setCanReproduce(boolean canReproduce) {
        this.canReproduce = canReproduce;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}


