import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class Main {

    private static final ThreadMXBean mbean = ManagementFactory.getThreadMXBean();

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            buildAndLaunchThread(i);
        }

        Thread t = new Thread(){

            @Override
            public void run() {
                while(true){
                    printThreadStatus();
                    try {
                        sleep(3000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }

        };
        t.setName("detector");
        t.start();

    }

    protected static void printThreadStatus() {
        ThreadInfo[] infos = mbean.dumpAllThreads(true, true);

        for (ThreadInfo threadInfo : infos) {
            System.out.println(threadInfo.getThreadName() + " state = " + threadInfo.getThreadState());
        }

    }

    private static void buildAndLaunchThread(int i) {
        Thread t1 = new Thread(){

            @Override
            public void run() {
                while(true){
                    try {
                        sleep(3000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }

        };
        t1.setName("t" + i);
        t1.start();

    }


}



