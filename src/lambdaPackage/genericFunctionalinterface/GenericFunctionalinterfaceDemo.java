package lambdaPackage.genericFunctionalinterface;

public class GenericFunctionalinterfaceDemo {
    public static void main(String[] args) {

        SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2))
            System.out.println("2 является делителем 10");
        System.out.println("---------------");

        SomeTest<Double> isfactorD = (n, d) -> (n % d) == 0;

        if (isfactorD.test(212.0, 4.0))
            System.out.println("4.0 является делителем 212.0");
        System.out.println("---------------");

        SomeTest<String> isIn = (a, b) -> a.contains(b);

        String str = "Обобщенный функциональный интерфейс";
        System.out.println("Tecтиpyeмaя строка: " + str);

        if (isIn.test(str, "фейс"))
            System.out.println("'фейс' найдено");
        else
            System.out.println("'фейс' не найдено");
    }
}
