package packageGenerics.gen;

public class GenDemo {
    public static void main(String[] args) {

        Gen<Integer> iOb;
        iOb = new Gen<>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("знaчeниe: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<>("Test messages");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("знaчeниe: " + str);

    }
}
