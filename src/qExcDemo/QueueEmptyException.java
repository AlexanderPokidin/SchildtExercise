package qExcDemo;

public class QueueEmptyException extends Exception {
    @Override
    public String toString() {
        return "\nОчередь пуста.";
    }
}
