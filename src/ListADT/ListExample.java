package ListADT;

/**
 * @author : codedsun
 * Created on 01/May/2018
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class ListExample {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(0,2);
        System.out.println("1st element "+list.get(0));
        list.set(0,1);
//        list.add(2,3);// Throws IndexOutOfBoundsException
        list.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o.toString());
            }
        });
    }
}
