public class InchToMeter {
    public static void main(String[] args) {
        double inches, meters;
        int counter = 0;

        for (inches = 1; inches <= 12*12; inches++){
            meters = inches / 2.54;
            System.out.println(inches + " дюймам соотвествует " + meters + " метров");
            counter++;
            if (counter == 12){
                System.out.println();
                counter = 0;
            }
        }
    }
}
