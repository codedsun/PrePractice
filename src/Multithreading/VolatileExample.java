package Multithreading;

/**
 * @author : codedsun
 * Created on 26/April/2018
 */

public class VolatileExample {
    volatile int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

class WithoutVolatile{


    public static void main(String[] args) {
        VolatileExample volatileExample = new VolatileExample();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0;i < 6;i++){
                    volatileExample.count++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0;i<6;i++) {
                    System.out.println(volatileExample.getCount());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });



        t1.start();
        t2.start();

    }

}
