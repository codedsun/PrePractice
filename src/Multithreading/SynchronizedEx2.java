package Multithreading;


/*
    @author : codedsun
    @date : 14/April/2018
 */
//Class to send msg provides the method send

class Sender{
   void send(String msg) throws InterruptedException {
        System.out.println("Sending "+msg+ " ID : "+Thread.currentThread().getId());
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Msg Sent");
    }
}

//Class for sending msg using thread

class SendThread extends Thread{
    private String msg;
    private Thread t;
    Sender sender;

    SendThread(String msg, Sender obj){
        this.msg = msg;
        this.sender = obj;
    }

    @Override
    public void run() {
        synchronized (sender){
            try {
                sender.send(msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class SynchronizedEx2 {

    public static void main(String[] args) throws InterruptedException {
        Sender sender = new Sender();
        SendThread sendThread = new SendThread("Hi",sender);
        SendThread sendThread1 = new SendThread("Hello",sender);
        sendThread.start();
        sendThread1.start();

    }


}
