package Multithreading;

public class SynchronizedEx {

    public static void main(String[] args) {
        Loop loop = new Loop();
        ThreadSync threadSync = new ThreadSync(loop);
        ThreadSync threadSync1 = new ThreadSync(loop);
        threadSync.start();
        threadSync1.start();
    }
}

class ThreadSync extends Thread{
    Thread t;
    Loop loop;
    ThreadSync(Loop loop){
        this.loop = loop;
    }

    @Override
    public void run() {
        synchronized (loop){
            loop.execute();
        }
    }
}

class Loop {
    void execute(){
        for(int i =1;i<=10;i++){
            System.out.println("Id: "+ Thread.currentThread().getId()+" I = "+i);
        }
    }
}
