package Multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : codedsun
 * created on 19/April/2018
 */

class Work implements Runnable{
    private String name;

    Work(String name){
        this.name = name;
    }
    /*
    Print task name and date/time and then sleeps for 1 sec,
    this process is executed for 5 times
     */
    @Override
    public void run() {
        for(int i =0;i<6;i++){
            if(i==0){
                Date d = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
                System.out.println("Executing task "+name+ " at "+simpleDateFormat.format(d));
            }
            else{
                Date d = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
                System.out.println("Executing the task "+name + " "+simpleDateFormat.format(d));
            }
            //Sleeping the thread for 1 sec
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Completed " +name);
    }
}
public class ThreadPool {

    public static void main(String[] args) {
        int max_poolsize = 3;
        Work work1 = new Work("Work 1");
        Work work2 = new Work("Work 2");
        Work work3 = new Work("Work 3");
        Work work4 = new Work("Work 4");
        Work work5 = new Work("Work 5");

        ExecutorService pool = Executors.newFixedThreadPool(max_poolsize);
        pool.execute(work1);
        pool.execute(work2);
        pool.execute(work3);
        pool.execute(work4);
        pool.execute(work5);

        pool.shutdown();
    }
}
