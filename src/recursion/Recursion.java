package recursion;

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Bычиcлeниe рекурсивным методом");
        System.out.println("Фaктopиaл З равен " + f.factR(3));
        System.out.println("Фaктopиaл 4 равен " + f.factR(4));
        System.out.println("Фaктopиaл 5 равен " + f.factR(5));
        System.out.println();
        System.out.println("Bычиcлeниe итеративным методом");
        System.out.println("Фaктopиaл З равен " + f.factI(3));
        System.out.println("Фaктopиaл 4 равен " + f.factI(4));
        System.out.println("Фaктopиaл 5 равен " + f.factI(5));
    }
}
