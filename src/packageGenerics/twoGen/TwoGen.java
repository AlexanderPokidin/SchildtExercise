package packageGenerics.twoGen;

class TwoGen<T, V> {
    private T ob1;
    private V ob2;

    void showTypes() {
        System.out.println("Tип Т - это " + ob1.getClass().getName());
        System.out.println("Tип V - это " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

    TwoGen(T ob1, V ob2) {

        this.ob1 = ob1;
        this.ob2 = ob2;
    }
}
