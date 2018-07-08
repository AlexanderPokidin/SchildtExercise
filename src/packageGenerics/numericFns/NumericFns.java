package packageGenerics.numericFns;

class NumericFns<T extends Number> {
    private T num;

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    boolean absEqual(NumericFns<?> ob) {
        return Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue());
    }

    NumericFns(T num) {
        this.num = num;
    }
}
