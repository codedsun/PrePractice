/**
 * @author : codedsun
 * Created on 30/Arpil/2018
 */
public class SwapObjectsSimple {

    public static void main(String[] args) {
        Car c = new Car(1);
        Car c1 = new Car(2);
        CarWrapper carWrapper = new CarWrapper(c);
        CarWrapper carWrapper1 = new CarWrapper(c1);
        /* Before swap */
        System.out.println(" Before swap ");
        System.out.println(c.getClass() + " "+c.no);
        System.out.println(c.getClass() + " "+c1.no);
        swapWrapperMethod(carWrapper,carWrapper1);
        System.out.println(" After swap ");
        System.out.println(c.getClass() +" "+carWrapper.c.no);
        System.out.println(c.getClass() +" "+carWrapper1.c.no);


    }
    /*
    Normal Approach to swap the Objects
     */
    private static void swap(Car c, Car c1){
        int temp = c.no;
        c.no = c1.no;
        c1.no = temp;
    }

    /*
    The objects doesn't get swap :P as parameters are passed by value and they create the copy of these references
     */
    private static void swapMethod(Car c, Car c1){
        Car temp = c;
        c = c1;
        c1 = temp;
    }

    /*
    Another solution is to use wrapper class to swap objects
     */
    private static void swapWrapperMethod(CarWrapper car, CarWrapper car1){
        Car c = car.c;
        car.c = car1.c;
        car1.c = c;
    }
}

class Car{

    public Car(int no) {
        this.no = no;
    }

    int no;
}
class CarWrapper{
    Car c;
    CarWrapper(Car c){
        this.c = c;
    }
}