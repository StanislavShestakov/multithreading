public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();
    }
}



class MyThread extends Thread{
    public void run(){
        while (true){
            System.out.println("Hello!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
