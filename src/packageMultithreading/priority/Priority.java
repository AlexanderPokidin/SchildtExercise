package packageMultithreading.priority;

public class Priority implements Runnable {

    static boolean stop = false;
    static String currentName;

    int count;
    Thread thrd;

    Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        do {
            count++;

            if (currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("B " + currentName);
            }
        } while (stop == false && count < 10_000_000);
        stop = true;

        System.out.println("\n" + thrd.getName() + " - завершение");
    }
}
