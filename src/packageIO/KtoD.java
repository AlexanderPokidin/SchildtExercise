package packageIO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KtoD {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Пpизнaк конца ввода - строка 'stop' ");

        try (FileWriter fw = new FileWriter("test_char.txt")) {
            do {
                System.out.print(": ");
                str = br.readLine();

                if (str.compareTo("stop") == 0) {
                    break;
                }
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("Oшибкa ввода-вывода: " + exc);
        }
    }
}
