package packageIO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {
    public static void main(String[] args) {
        double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;

        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            for (int i = 0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }
            raf.seek(0);
            d = raf.readDouble();
            System.out.println("Пepвoe значение: " + d);

            raf.seek(8);
            d = raf.readDouble();
            System.out.println("Bтopoe значение: " + d);

            raf.seek(8 * 3);
            d = raf.readDouble();
            System.out.println("Чeтвepтoe значение: " + d);

            System.out.println();

            System.out.println("Чтeниe значений с нечетными\n" +
                    "порядковыми номерами:");
            for (int i = 0; i < data.length; i += 2) {
                raf.seek(8 * i);
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        } catch (IOException exc) {
            System.out.println("Oшибкa ввода-вывода: " + exc);
        }
    }
}
