public class Main {

    public  static int counter;


    //in 1 time - 1  access
    public static synchronized void increment(){
        counter++;
    }

    public static  void process(){

        Thread t1 = new Thread(new Runnable(){

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    increment();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The counter is: " + counter);
        counter = 0;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            process();
        }

    }


}



