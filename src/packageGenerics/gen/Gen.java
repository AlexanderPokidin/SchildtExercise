package packageGenerics.gen;

class Gen<T> {
    private T ob;

    void showType() {
        System.out.println("Tип Т - это " + ob.getClass().getName());
    }

    T getOb() {
        return ob;
    }

    Gen(T ob) {
        this.ob = ob;
    }
}
