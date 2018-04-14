package Multithreading;

class Line{
    synchronized public void getLine() throws InterruptedException {
        for(int i =1;i<10;i++){
            System.out.println("Thread id "+Thread.currentThread().getId()+" I= "+i);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}

class Train extends Thread{
    Line line;
    Train(Line line){
        this.line = line;
    }

    @Override
    public void run() {
        try {
            line.getLine();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MethodSync {
    public static void main(String[] args) {
        Line line = new Line();
        Train train = new Train(line);
        Train train1 = new Train(line);
        train.start();
        train1.start();
    }
}
