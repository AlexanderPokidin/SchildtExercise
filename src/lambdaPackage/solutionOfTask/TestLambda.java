package lambdaPackage.solutionOfTask;

public class TestLambda {
    public static void main(String[] args) {
        MyTest myTest = n -> (n >= 10 && n <= 20);
        System.out.println(myTest);
    }
}
