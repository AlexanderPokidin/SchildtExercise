package failSoftArray;

public class FailSoftArray {
    private int a[];
    private int errval;

    public int lenght;

    public FailSoftArray(int size, int errv){
        a = new int[size];
        errval = errv;
        lenght = size;
    }

    public int get(int index){
        if (indexOK(index))
            return a[index];
        return errval;
    }

    public boolean put(int index, int val){
        if (indexOK(index)){
            a[index] = val;
            return true;
        }
        return false;
    }

    private boolean indexOK(int index){
        // Simple variant
        return index >= 0 & index < lenght;
        // First variant
//        if (index >= 0 & index < lenght)
//            return true;
//        return false;
    }
}
