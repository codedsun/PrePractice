package Multithreading;



public class StartRunExample implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        StartRunExample startRunExample = new StartRunExample();
        Thread thread = new Thread(startRunExample);
        thread.start(); //This will create a seperate stack calling frame <3
        startRunExample.run();
    }
}
