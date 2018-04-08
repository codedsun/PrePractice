package Multithreading;

public class ThreadJoinEx2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 5) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " Running ");
            System.out.println(" i = "+i);
            i++;
        }
    }

}

class Example2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadJoinEx2 thread1 = new ThreadJoinEx2();
        ThreadJoinEx2 thread2 = new ThreadJoinEx2();
        thread1.start();
        thread1.join();
        thread2.start();


    }
}
