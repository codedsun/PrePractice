package Multithreading;

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
