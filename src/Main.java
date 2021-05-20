public class Main {

    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        MyThread myThread2 = new MyThread();
//        myThread2.start();
//
        System.out.println("Im Going to sleep!");
        Thread.sleep(3000);
        System.out.println("Im awake!");
    }
}

class MyThread extends Thread{
    public void run(){
        for (int i = 0; i <1000 ; i++) {
            System.out.println("Hello My Thread!" + i);
        }

    }
}
