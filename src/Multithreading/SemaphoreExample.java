package Multithreading;


import java.util.concurrent.Semaphore;

/**
 * @author : codedsun
 * Created on 21/Apr/2018
 */

class Shared{
    static int count = 0;
}
public class SemaphoreExample extends Thread{

    Semaphore s;
    String threadName;
    SemaphoreExample(Semaphore s, String threadName){
        this.s = s;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        if(this.threadName.equalsIgnoreCase("Thread1")){
            System.out.println("Starting "+threadName);

            try {
                System.out.println(threadName+ "  is waiting for the permit");
                s.acquire();
                System.out.println(threadName + " Get's a permit");
                for(int i= 0; i<5;i++){
                    System.out.println(threadName+ " Count : "+Shared.count);
                    Shared.count++;
                    Thread.sleep(10);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName +" Releases the permit");
            s.release();
        }

        else{
            System.out.println("Starting "+threadName );
            try {
                System.out.println("Waiting to get the permit "+threadName);
                s.acquire();
                System.out.println(threadName+" Get's a permit");
                for(int i =0 ;i<5;i++){
                    Shared.count--;
                    System.out.println(threadName+ " Count : "+Shared.count);
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName+ " Releases the permit");
            s.release();
        }
    }
}

class SemaphoreDemo {
    public static void main(String[] args) throws InterruptedException {
        // Attached the no of permits allowed
        Semaphore semaphore = new Semaphore(1);
        SemaphoreExample thread1 = new SemaphoreExample(semaphore, "Thread1");
        SemaphoreExample thread2 = new SemaphoreExample(semaphore, "Thread2");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Shared count final "+Shared.count);

    }
}
