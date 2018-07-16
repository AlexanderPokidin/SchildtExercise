package lambdaPackage.numericFunc;

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc smallest = (n) -> {
            int result = 1;
            n = n < 0 ? -n : n;
            for (int i = 2; i < n / i; i++)
                if ((n % i) == 0) {
                    result = i;
                    break;
                }
            return result;
        };

        System.out.println("Haимeньшим делителем 12 является: " + smallest.func(12));
        System.out.println("Haимeньшим делителем 11 является: " + smallest.func(11));

        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = result * i;
            return result;
        };

        System.out.println("Факториал 12 является: " + factorial.func(12));
        System.out.println("Факториал 12 является: " + factorial.func(11));
    }
}
