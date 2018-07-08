package packageIO;

import java.io.FileInputStream;
import java.io.IOException;

public class CompFiles {
    public static void main(String[] args) {
        int i = 0, j = 0;

        if (args.length != 2) {
            System.out.println("Иcпoльзoвaниe: packageIO.CompFiles файл1 файл2");
//            return;
        }

        try (FileInputStream f1 = new FileInputStream("E:\\StudioProjects\\Exercise\\Second.txt");
             FileInputStream f2 = new FileInputStream("E:\\StudioProjects\\Exercise\\src\\First")) {
            do {
                i = f1.read();
                j = f2.read();
                if (i != j) {
                    break;
                }
            } while (i != -1 && j != -1);
            if (i != j) {
                System.out.println("Coдepжимoe файлов отличается");
            } else {
                System.out.println("Coдepжимoe файлов совпадает");
            }
        } catch (IOException exc) {
            System.out.println("Omибкa ввода-вывода: " + exc);
        }
    }
}