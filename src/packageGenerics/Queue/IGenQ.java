package packageGenerics.Queue;

import qExcDemo.QueueEmptyException;
import qExcDemo.QueueFullException;

public interface IGenQ<T> {

    void put(T ch) throws QueueFullException, packageGenerics.Queue.QueueFullException;

    T get() throws QueueEmptyException, packageGenerics.Queue.QueueEmptyException;
}
