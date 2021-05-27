public class Main {

    public static void main(String[] args) {


        //IT IS NOT PARALLEL EXECUTION !!!  SINGLE CPU CORE
        Thread t1 = new Thread(new Runner1());
        Thread t2 = new Thread(new Runner2());

        t1.start();
        t2.start();
    }
}

class Runner1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner1:" + i);
        }
    }
}

class Runner2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner2:" + i);
        }
    }
}





