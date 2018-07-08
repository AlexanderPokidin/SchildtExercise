package packageMultithreading.sumArray2;

public class MyThread implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    MyThread(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();
    }

    @Override
    public void run() {
        int sum;
        System.out.println(thrd.getName() + " - запуск");

        synchronized (sa){
            answer = sa.sumArray(a);
        }

        System.out.println("CУММA для " + thrd.getName() + ": " + answer);
        System.out.println(thrd.getName() + " - завершение");
    }
}
