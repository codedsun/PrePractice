package Multithreading;

/**
 * @author : codedsun
 * Created on : 17/04/2018
 *
 */
public class BlockSync{

    String name = "";
    public void setName(String name){
        System.out.println("Entering the sync block");
        synchronized (this){
            this.name = name;
            System.out.println(name +" "+Thread.currentThread().getId());
        }
        System.out.println("Exiting the sync block");
    }


}

class BlockThread extends Thread{
    BlockSync blockSync = new BlockSync();
    String name = "";
    BlockThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        blockSync.setName(name);
    }
}

class BlockMain {
    public static void main(String[] args) {
        String name = "Suneet";
        BlockThread thread = new BlockThread(name);
        BlockThread thread1 = new BlockThread(name);
        thread.start();
        thread1.start();

    }
}