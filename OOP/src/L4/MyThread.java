package L4;

public class MyThread implements Runnable {

    Thread thrd;
    public static int runningThreads = 0;

    // Construct a new thread.
    MyThread(String name) {
        thrd = new Thread(this, name);
        runningThreads++;
    }

    // A factory method that creates and starts a thread.
    public static MyThread createAndStart(String name) {
        MyThread myThrd = new MyThread(name);

        myThrd.thrd.start(); // start the thread
        return myThrd;
    }

    // Entry point of thread.
    public void run() {
        System.out.println("Running thread count: " + runningThreads);
        System.out.println(thrd.getName() + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }

}
