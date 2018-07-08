package packageGenerics.twoGen;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Message");

        tgObj.showTypes();

        int v = tgObj.getOb1();
        System.out.println("знaчeниe: " + v);

        String str = tgObj.getOb2();
        System.out.println("знaчeниe: " + str);
    }
}
