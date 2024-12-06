package algo_2024;

public class QueueImp<T> {

    private Node<T> head;
    private Node<T> tail;

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty, cannot dequeue.");
        }
        T temp = head.getValue();
        head = head.getNext();
        if (head == null) {
            tail = null; // Tail must also be null if the queue is empty
        }
        return temp;
    }

    public void enqueue(T value) {
        Node<T> oldTail = tail;
        tail = new Node<>(value, null);

        if (isEmpty()) {
            head = tail;
        } else {
            oldTail.setNext(tail);
        }
    }

    public T front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty, no front element.");
        }
        return head.getValue();
    }

    public boolean isEmpty() {
        return head == null;
    }
}
