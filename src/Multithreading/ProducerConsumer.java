package Multithreading;

import java.util.LinkedList;

/**
 * @author : codedsun
 * created on : 17/04/2018
 */

class ThreadProducerConsumer{
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        Thread t1 = new Thread(()->{
            try {
                producerConsumer.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(()->{
            try {
                producerConsumer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }


}

public class ProducerConsumer {

    LinkedList<Integer> linkedList = new LinkedList<>();
    int count = 2;

    public void produce() throws InterruptedException{
        int value = 0;
       while(true){
           synchronized (this){
               while(linkedList.size() == count)
                   wait();

               System.out.println("Producer Produced "+value);
               linkedList.add(value++);
               notify();
               Thread.sleep(1000);
           }
       }

    }

    public void consume()throws InterruptedException{
        int value ;
        while (true){
            synchronized (this){
                while(linkedList.size() == 0)
                    wait();

                value = linkedList.removeFirst();
                System.out.println("Consumer consumed "+value);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}

