package multithreading;

/**
 * Created by APavlov on 30.11.2015.
 */
public class MultithreadingMain {
    public static void main(String[] args) {
        Thread otherThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("other thread begin");
                /*
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("other thread was interrupted");;
                }
                */
                while (!Thread.currentThread().isInterrupted()) {

                }
                System.out.println("other thread end");
            }
        });
        /*
        new Thread(() -> {               //replace with lambda
            System.out.println("other thread");
        });
        */
        //otherThread.setDaemon(true);  //we won't see "other thread end" - Daemon ends with end of main thread
        otherThread.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        otherThread.interrupt();
        System.out.println("main thread");


        try {
            otherThread.join();           //waits for finish of otherThread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main thread end");

    }
}
