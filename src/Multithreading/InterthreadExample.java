package Multithreading;

import java.util.Scanner;

public class InterthreadExample {
    public static void main(String[] args) throws InterruptedException {
        Communication communication = new Communication();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    communication.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    communication.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t.start();
        t1.start();
        t.join();
        t1.join();
    }


    static class Communication {
        public void produce() throws InterruptedException {
            synchronized (this) {
                System.out.println("Producer thread running");
                wait();
                //Waiting and then released
                System.out.println("Resuming Producer Thread");
            }

        }

        public void consume() throws InterruptedException {
            Thread.sleep(1000);//to make the producer thread complete
            Scanner sc = new Scanner(System.in);
            synchronized (this) {
                System.out.println("Waiting for the next key to resume");
                sc.next();
                System.out.println("Key Pressed");
                //notifying the producer thread to wake up
                notify();

                Thread.sleep(2000);
            }
        }
    }
}

