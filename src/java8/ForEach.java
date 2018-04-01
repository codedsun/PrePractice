package java8;

/*Java8 Introduces for each comparatable interface*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class ForEachTest {

    private static List<String> names = new ArrayList<>();

    public static void main(String args[]){
        names.add("Suneet");
        names.add("Vineet");
        names.add("John");
        names.add("Carl");
        names.add("Naval");
        names.add("Lyla");

        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        /*Using lambda expression*/

        Consumer<String> consumer = names -> {System.out.println(names);};
        names.forEach(consumer);

    }

}

