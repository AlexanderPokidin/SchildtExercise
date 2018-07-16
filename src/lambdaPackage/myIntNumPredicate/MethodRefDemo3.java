package lambdaPackage.myIntNumPredicate;

public class MethodRefDemo3 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum myIntNum = new MyIntNum(12);
        MyIntNum myIntNum2 = new MyIntNum(16);

        MyIntNumPredicate predicate = MyIntNum::isFactor;
        result = predicate.test(myIntNum, 3);
        if (result)
            System.out.println("3 является делителем " + myIntNum.getV());

        result = predicate.test(myIntNum2, 3);
        if (result)
            System.out.println("3 является делителем " + myIntNum2.getV());
    }
}
