package problem4.adt;

public interface MyQueueADT<E> {
    //a method to add new element at rear
    void enqueue(E data);

    //a method to remove element from front of queue
    E dequeue();

    //a method to get front element of queue
    E peek();

    // a method to check whether queue is empty
    boolean isEmpty();

    // to get size of queue
    int getSize();
}
