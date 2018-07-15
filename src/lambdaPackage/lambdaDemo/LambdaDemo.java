package lambdaPackage.lambdaDemo;

public class LambdaDemo {
    public static void main(String[] args) {
        MyValue myVal;

        myVal = () -> 98.6;
        System.out.println("Пocтoяннoe значение: " + myVal.getValue());

        MyParamValue myParamVal = (n) -> 1.0 / n;
        System.out.println("Oбpaтнaя величина 4 равна: " + myParamVal.getValue(4));
        System.out.println("Oбpaтнaя величина 8 равна: " + myParamVal.getValue(8));
    }
}
