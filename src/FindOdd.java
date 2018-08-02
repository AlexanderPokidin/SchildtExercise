public class FindOdd {
    public static int findIt(int[] a) {
        int odd = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j >= 0; j--) {
                if (a[i] != a[j]) {
                    odd = a[i];
                    break;
                }
            }
        }
        return odd;
    }

    public static void main(String[] args) {
        int res1 = findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5});
        int res2 = findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5});
        int res3 = findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5});
        int res4 = findIt(new int[]{10});
        int res5;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
    }
}