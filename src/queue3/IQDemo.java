package queue3;

public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;

        char ch;
        int i;

        // FixedQueue
        iQ = q1;

        for (i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }

        System.out.print("Coдepжимoe фиксированной очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        // DynQueue
        iQ = q2;
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('Z' - i));
        }

        System.out.print("Coдepжимoe динамической очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        // CircularQueue
        iQ = q3;

        for (i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }

        System.out.print("Coдepжимoe кольцевой очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        // Поместить больше символов в кольцевую очередь
        for (i = 10; i < 20; i++) {
            iQ.put((char) ('A' + i));
        }

        System.out.print("Coдepжимoe кольцевой очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("\nCoxpaнeниe и использование данных кольцевой очереди");
        for (i = 0; i < 20; i++){
            iQ.put((char) ('А' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
    }
}
