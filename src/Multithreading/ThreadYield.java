package Multithreading;

import java.util.TimeZone;
import java.util.Timer;

public class ThreadYield extends Thread {
    @Override
    public void run() {
        for(int i =0 ;i <5;i++){
            System.out.println(Thread.currentThread().getName()+" ` Running");
            Thread.yield();
        }
    }



}

class Yield{
    public static void main(String[] args) {
        ThreadYield threadYield = new ThreadYield();
        threadYield.setName("Suneet");
        threadYield.start();
        ThreadYield threadYield1 = new ThreadYield();
        threadYield1.setPriority(Thread.MAX_PRIORITY);
        threadYield1.setName("Sakshi");
        threadYield1.start();

    }
}

class ThreadSleep implements Runnable{

    @Override
    public void run() {

        int i = 0;
        while (i < 4) {
            try {
                System.out.println("Hi " + System.currentTimeMillis());
                i++;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


    public static void main(String[] args) {
        Thread t = new Thread(new ThreadSleep());
        t.start();
    }
}

