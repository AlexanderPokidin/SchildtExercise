public class NoZeroDiv {
    public static void main(String[] args) {
        int result;

        for (int i = -5; i < 6; i++) {
            // Third (simple) variant
            if (i != 0) {
                // Second variant
//            if (i != 0 ? true : false){
                System.out.println("100 /" + i +
                        " равно " + 100 / i);
            }
            // First variant
//            result = i != 0 ? 100 / i : 0;
//            if (i != 0){
//                System.out.println("100 / " + i + " равно " + result);
//            }
        }
    }
}
