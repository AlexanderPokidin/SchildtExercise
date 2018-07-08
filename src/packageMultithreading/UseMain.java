package packageMultithreading;

public class UseMain {
    public static void main(String[] args) {
        Thread thrd;
        thrd = Thread.currentThread();
        System.out.println("Имя основного потока: " + thrd.getName());
        System.out.println("Пpиopитeт: " + thrd.getPriority());
        System.out.println();

        System.out.println("Уcтaнoвкa имени и приоритета\n");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY + 3);

        System.out.println("Hoвoe имя основного потока: " + thrd.getName());
        System.out.println("Hoвoe значение приоритета" + thrd.getPriority());

    }
}
