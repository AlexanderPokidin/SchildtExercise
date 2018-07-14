package packageIO;

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;

        if (args.length != 1) {
            System.out.println("Иcnoльзoвaниe: packageIO.ShowFile E:\\StudioProjects\\Exercise\\test_char.txt");
//            return;
        }

        try (FileInputStream fileInputStream = new FileInputStream("test")) {
            do {
                i = fileInputStream.read();
                if (i != 1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Oшибкa ввода-вывода: " + exc);
        }
    }
}
