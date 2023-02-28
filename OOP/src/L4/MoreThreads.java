package L4;

public class MoreThreads {

    /*
    Several threads have to be launched.
    At the beginning of each thread’s run the number of already running threads should be printed out.
     */

    public static void main(String args[]) {
        System.out.println("Main thread starting.");

//        MyThread mt1 = MyThread.createAndStart("Child #1");
//        MyThread mt2 = MyThread.createAndStart("Child #2");
//        MyThread mt3 = MyThread.createAndStart("Child #3");

        MyThread[] thr = new MyThread[15];
        for(int i = 0; i < thr.length; i++) {
            thr[i] = MyThread.createAndStart("Child #" + i);
        }

//        for(int i = 1; i <= 15; i++) {
//            MyThread thr = MyThread.createAndStart("Child #" + i);
//        }

        for(int i=0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");
    }

}
