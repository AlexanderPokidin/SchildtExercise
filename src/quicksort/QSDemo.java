package quicksort;

public class QSDemo {
    public static void main(String[] args) {
        char a[] = {'d', 'f', 'a', 'v', 'y', 'e', 'd', 'c', 'k', 'j', 'q', 'u'};
        int i;

        System.out.print("Иcxoдный массив: ");
        for (i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }

        System.out.println();

        Quicksort.qsort(a);

        System.out.print("Oтcopтиpoвaнный массив: ");
        for (i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
    }
}
