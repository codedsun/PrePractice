package Multithreading;

public class ThreadJoin implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 5) {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello "+Thread.currentThread().getName());
            i++;
        }
    }
}

class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread threadJoin = new Thread(new ThreadJoin());
        Thread threadJoin1 = new Thread(new ThreadJoin());
        Thread threadJoin2 = new Thread(new ThreadJoin());
        threadJoin.start();

        threadJoin1.start();
        threadJoin1.join();

        threadJoin2.join(1000);
        threadJoin2.start();


    }
}
