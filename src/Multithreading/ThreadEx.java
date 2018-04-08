package Multithreading;

public class ThreadEx extends Thread{

    public static void main(String[] args) {
        Thread t= new Thread();
        t.setName("Suneet ");
        t.run();
        System.out.println(t.getName());
        //t.interrupt();
    }

    @Override
    public void run() {
        System.out.println("GHello");
    }

    @Override
    public synchronized void start() {
        System.out.println("Thread running");
    }

    @Override
    public void interrupt() {

        System.out.println("Thread Interrupted");
    }
}
