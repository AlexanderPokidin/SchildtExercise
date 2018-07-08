package packageIO;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter printWriter = new PrintWriter(System.out, true);
        int i = 10;
        double d = 123.65;

        printWriter.println("Иcnoльзoвaниe класса PrintWriter");
        printWriter.println(i);
        printWriter.println(d);

        printWriter.println(i + " + " + d + " = " + (i + d));
    }
}
