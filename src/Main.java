import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shotDown();


    }
}



class MyThread extends Thread{
    private boolean running = true;

    public void run(){
        while (running){
            System.out.println("Hello!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public  void shotDown(){
        this.running = false;
    }
}
