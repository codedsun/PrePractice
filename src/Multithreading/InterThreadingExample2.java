package Multithreading;

import java.util.Scanner;

public class InterThreadingExample2 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Communicate communicate = new Communicate();
        Thread mainThread = new Thread(new Runnable() {
            @Override
            public void run() {
                communicate.init();
                int n = sc.nextInt();
                while(n!=-1){
                    Thread thread1 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {

                                communicate.sender();
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
//                                e.printStackTrace();
                            }
                        }
                    });

                    Thread thread2 = new Thread(()->{
                        try {
                            Thread.sleep(2000);

                            communicate.receiver();
                        } catch (InterruptedException e) {
//                            e.printStackTrace();
                        }
                    });
                    thread1.start();
                    thread2.start();
                    n = sc.nextInt();
                }
            }
        });
        mainThread.start();
    }


    //Nested inner Static Class

    static class Communicate{

        public void sender() throws InterruptedException {
            synchronized (this) {
                System.out.println("Sender: Enter msg");
                System.out.println(sc.next());
                wait();
            }
        }


        public void receiver(){
            synchronized (this) {
                System.out.println("Reciever: Enter msg");
                System.out.println(sc.next());
                notify();

            }
        }
        public void init(){
            System.out.println("Hello the chat app messenger installs!");
            System.out.println(">>>>>>>>>>>> WELCOME <<<<<<<<<<<<<<<<");
            System.out.println("Enter -1 to exit");
        }
    }
}
