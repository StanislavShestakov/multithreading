public class Main {

    public static void main(String[] args) {

        Thread t1 = new Runner1();
        Thread t2 = new Runner2();


        t1.start();
        t2.start();
    }
}

class Runner1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Runner1:" + i);
        }
    }
}

class Runner2 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Runner2:" + i);
        }
    }
}





