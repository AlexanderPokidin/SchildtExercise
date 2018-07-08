package packageMultithreading.tickTock;

public class MyThread implements Runnable {
    Thread thrd;
    TickTock ttObj;

    MyThread(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttObj = tt;
        thrd.start();
    }

    @Override
    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 10; i++) {
                ttObj.tick(true);
            }
            ttObj.tick(false);
        } else {
            for (int i = 0; i < 10; i++) {
                ttObj.tock(true);
            }
            ttObj.tock(false);
        }
    }
}
