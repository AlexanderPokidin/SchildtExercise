package packageGenerics.numericFns;

public class WildcardDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<>(6);
        NumericFns<Double> dOb = new NumericFns<>(-6.0);
        NumericFns<Long> lOb = new NumericFns<>(5L);

        System.out.println("Cpaвнeниe iOb и dOb");
        if (iOb.absEqual(dOb)) {
            System.out.println("Aбcoлютныe значения совпадают.");
        } else {
            System.out.println("Aбcoлютныe значения отличаются.");
        }
        System.out.println();

        System.out.println("Cpaвнeниe iOb и lOb");
        if (iOb.absEqual(lOb)) {
            System.out.println("Aбcoлютныe значения совпадают.");
        } else {
            System.out.println("Aбcoлютныe значения отличаются.");
        }
    }
}
