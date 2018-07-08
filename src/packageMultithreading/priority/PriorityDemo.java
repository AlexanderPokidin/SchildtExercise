package packageMultithreading.priority;

public class PriorityDemo {
    public static void main(String[] args) {
        Priority mt1 = new Priority("High priority");
        Priority mt2 = new Priority("Low priority");

        mt1.thrd.setPriority(Thread.NORM_PRIORITY + 2);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY - 2);

        mt1.thrd.start();
        mt2.thrd.start();

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Пpepывaниe основного потока");
        }
        System.out.println("\nCчeтчик потока High Priority: " + mt1.count);
        System.out.println("\nCчeтчик потока Low Priority: " + mt2.count);
    }
}
