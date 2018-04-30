public class SwapObjectsSimple {

    public static void main(String[] args) {
        Car c = new Car(1);
        Car c1 = new Car(2);
        /* Before swap */
        System.out.println(" Before swap ");
        System.out.println(c.getClass() + " "+c.no);
        System.out.println(c.getClass() + " "+c1.no);
        swap(c,c1);
        System.out.println(" After swap ");
        System.out.println(c.getClass() +" "+c.no);
        System.out.println(c.getClass() +" "+c1.no);


    }

    private static void swap(Car c, Car c1){
        int temp = c.no;
        c.no = c1.no;
        c1.no = temp;
    }
}

class Car{

    public Car(int no) {
        this.no = no;
    }

    int no;
}
