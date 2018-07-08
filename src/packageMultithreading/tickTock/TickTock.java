package packageMultithreading.tickTock;

public class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if (!running) {
            state = "ticked";
            notify();
            return;
        }
        try {
            wait(500);
        } catch (InterruptedException exc) {
            System.out.println("Пpepывaниe потока");
        }
        System.out.print("Tick ");
        state = "ticked";
        notify();
        try {
            while (!state.equals("tocked")) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("Пpepывaниe потока");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) {
            state = "tocked";
            notify();
            return;
        }
        try {
            wait(500);
        } catch (InterruptedException exc) {
            System.out.println("Пpepывaниe потока");
        }
        System.out.println("Tock");
        state = "tocked";
        notify();
        try {
            while (!state.equals("ticked")) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("Пpepывaниe потока");
        }
    }
}
