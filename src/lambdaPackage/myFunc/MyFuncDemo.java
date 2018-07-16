package lambdaPackage.myFunc;

public class MyFuncDemo {
    public static void main(String[] args) {
        MyFunc<Integer> factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++)
                result = result * i;
            return result;
        };

        System.out.println("Фaктopиaл 3 равен " + factorial.func(3));
        System.out.println("Фaктopиaл 5 равен " + factorial.func(5));
        System.out.println("Фaктopиaл 9 равен " + factorial.func(9));
    }
}
