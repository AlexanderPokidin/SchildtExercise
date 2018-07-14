package testPackageSoftServe;

public class Demo {
    public static void main(String[] args) {
        Rental rental = new Rental(2, 2);
        Rental rental1 = new Rental(1, 1);

        System.out.println(rental.amountFor(rental));
    }
}
