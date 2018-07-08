package packageIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileWithResources {
    public static void main(String[] args) throws IOException {
        int i;

        if (args.length != 2) {
            System.out.println("Иcпoльзoвaниe: packageIO.CopyFile откуда куда");
            try (FileInputStream fileInputStream = new FileInputStream("E:\\StudioProjects\\Exercise\\src\\First");
                 FileOutputStream fileOutputStream = new FileOutputStream("Second.txt");) {
                do {
                    i = fileInputStream.read();
                    if (i != -1) {
                        fileOutputStream.write(i);
                    }
                } while (i != -1);
            } catch (IOException exc) {
                System.out.println("Oшибкa ввода-вывода: " + exc);
            }
        }
    }
}
