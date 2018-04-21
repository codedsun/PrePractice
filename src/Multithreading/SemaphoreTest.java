package Multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    static Semaphore semaphore = new Semaphore(2);

    public static class ThreadSemaphore extends Thread{
        String name ;
        ThreadSemaphore(String name){
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name + " Acquiring lock");
            System.out.println(name + " Availaible permits now "+semaphore.availablePermits());
            try {
                semaphore.acquire();
                for(int i =1;i<5;i++){
                    System.out.println(name + " performing operation "+i+", availaible permits "+semaphore.availablePermits());
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                System.out.println(name + " realeasing lock");
                semaphore.release();
                System.out.println(name +" available permits now "+semaphore.availablePermits());
            }

        }
    }
    public static void main(String[] args) {
        ThreadSemaphore thread1 = new ThreadSemaphore("thread1");
        ThreadSemaphore thread2 = new ThreadSemaphore("thread2");
        ThreadSemaphore thread3 = new ThreadSemaphore("thread3");
        ThreadSemaphore thread4 = new ThreadSemaphore("thread4");
        ThreadSemaphore thread5 = new ThreadSemaphore("thread5");
        ThreadSemaphore thread6 = new ThreadSemaphore("thread6");
        thread1.start();
        thread2.start();
        thread3.start();;
        thread4.start();;
        thread5.start();
        thread6.start();
    }
}
