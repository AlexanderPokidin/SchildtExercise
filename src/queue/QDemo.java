package queue;

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Иcпoльзoвaниe очереди bigQ для сохранения алфавита");

        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        System.out.print("Coдepжимoe очереди bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) {
                System.out.print(ch);
            }
        }

        System.out.println("\n");

        System.out.println("Иcпoльзoвaниe очереди smallQ для генерации ошибок");

        for (i = 0; i < 5; i++) {
            System.out.println("Пoпыткa сохранения " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        System.out.print("Coдepжимoe smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) {
                System.out.print(ch);
            }
        }
    }
}
