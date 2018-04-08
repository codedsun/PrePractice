package Multithreading;

public class ThreadRunnableEx implements Runnable {
    @Override
    public void run() {
        System.out.println("hello! Thread running");
    }

    public static void main(String[] args) {
        ThreadRunnableEx threadRunnableEx = new ThreadRunnableEx();
        threadRunnableEx.run();
    }
}
