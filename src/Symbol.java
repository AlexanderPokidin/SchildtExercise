import java.io.IOException;

public class Symbol {
    public static void main(String[] args) throws IOException {
        char symbol;
        int count = 0;

        System.out.println("Введите любую букву");

        for (; ; ) {
            symbol = (char) System.in.read();
            if (symbol == '.') {
                break;
            } else if ((symbol >= 'a') && (symbol <= 'z')) {
                int numSymbol = (int) symbol - 32;
                char newSymbol = (char) numSymbol;
                System.out.println(newSymbol);
                count++;
            } else if ((symbol >= 'A') && (symbol <= 'Z')) {
                int numSymbol = (int) symbol + 32;
                char newSymbol = (char) numSymbol;
                System.out.println(newSymbol);
                count++;
            } else {
                System.out.println(symbol);
            }
        }
        System.out.println("Всего изменено букв: " + count);
    }
}
