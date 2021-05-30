public class Main {

    public static void main(String[] args) {

      Thread t1 = new Thread(new Worker());
      t1.setDaemon(true);

        System.out.println(t1.isDaemon());
    }
}

class Worker implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello from a given thread....");
    }
}


