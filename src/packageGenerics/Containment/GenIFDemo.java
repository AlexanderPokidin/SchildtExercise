package packageGenerics.Containment;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer x[] = {1, 2, 3};

        MyClass<Integer> ob = new MyClass<>(x);

        if (ob.contains(2))
            System.out.println("2 содержится в ob");
        else
            System.out.println("2 НЕ содержится в оb");

        if (ob.contains(5))
            System.out.println("5 содержится в оb");
        else
            System.out.println("5 НЕ содержится в оb");
    }
}
