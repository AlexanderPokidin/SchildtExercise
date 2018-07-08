package packageIO;

import java.io.*;

public class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        try (DataOutputStream dataOutputStream =
        new DataOutputStream(new FileOutputStream("testdata.txt"))){
            System.out.println("Зaпиcaнo: " + i);
            dataOutputStream.writeInt(i);

            System.out.println("Зaпиcaнo: " + d);
            dataOutputStream.writeDouble(d);

            System.out.println("Зaпиcaнo: " + b);
            dataOutputStream.writeBoolean(b);

            System.out.println("Зaпиcaнo: " + 12.2 * 7.4);
            dataOutputStream.writeDouble(12.2 * 7.4);
        }catch (IOException exc){
            System.out.println("Oшибкa при записи");
            return;
        }

        System.out.println();

        try (DataInputStream dataInputStream =
        new DataInputStream(new FileInputStream("testdata.txt"))){
            i = dataInputStream.readInt();
            System.out.println("Пpoчитaнo: " + i);

            d = dataInputStream.readDouble();
            System.out.println("Пpoчитaнo: " + d);

            b = dataInputStream.readBoolean();
            System.out.println("Пpoчитaнo: " + b);

            d = dataInputStream.readDouble();
            System.out.println("Пpoчитaнo: " + d);
        }catch (IOException exc){
            System.out.println("Oшибкa при чтении");
        }
    }
}
