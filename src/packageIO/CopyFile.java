package packageIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        if (args.length != 2) {
            System.out.println("Иcпoльзoвaниe: packageIO.CopyFile откуда куда");
            return;
        }

        try {
            fileInputStream = new FileInputStream("E:\\StudioProjects\\Exercise\\src\\First");
            fileOutputStream = new FileOutputStream("Second.txt");

            do {
                i = fileInputStream.read();
                if (i != -1) {
                    fileOutputStream.write(i);
                }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Oшибкa ввода-вывода: " + exc);
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException exc) {
                System.out.println("Oшибкa при закрытии входного файла");
            }
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException exc) {
                System.out.println("Oшибкa при закрытии выходного файла");
            }
        }
    }
}
