package algo_2024;

public class Knoten<T> {
    private T data;
    private Knoten<T> next;

    // Constructor to initialize the node with data
    public Knoten(T data) {
        this.data = data;
        this.next = null;
    }

    // Getter for the data
    public T getData() {
        return data;
    }

    // Setter for the data
    public void setData(T data) {
        this.data = data;
    }

    // Getter for the next node
    public Knoten<T> getNext() {
        return next;
    }

    // Setter for the next node
    public void setNext(Knoten<T> next) {
        this.next = next;
    }
}
