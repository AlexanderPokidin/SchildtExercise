package packageGenerics.numericFns;

public class BoundsDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<>(5);
        System.out.println("Oбpaтнaя величина iOb " + iOb.reciprocal());
        System.out.println("Дpoбнaя часть iOb " + iOb.fraction());
        System.out.println();

        NumericFns<Double> dOb = new NumericFns<>(5.25);
        System.out.println("Oбpaтнaя величина dOb " + dOb.reciprocal());
        System.out.println("Дpoбнaя часть dOb " + dOb.fraction());


    }
}
