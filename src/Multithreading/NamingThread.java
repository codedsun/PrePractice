package Multithreading;

public class NamingThread extends Thread {

    public static void main(String[] args) {
        NamingThread  namingThread = new NamingThread();
        namingThread.setName("Suneet");
        System.out.println(namingThread.getName());
    }
}
