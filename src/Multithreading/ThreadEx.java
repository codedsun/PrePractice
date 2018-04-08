package Multithreading;

public class ThreadEx extends Thread{

    @Override
    public void run() {
        System.out.println("Thread " +currentThread().getName()+" is Running");
    }
}

class Multithread {
    public static void main(String[] args) {
        for(int i =1;i<=5;i++) {
            ThreadEx threadEx = new ThreadEx();
            threadEx.run();
        }
    }
}
