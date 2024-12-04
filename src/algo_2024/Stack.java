package algo_2024;

public class Stack<T> { // Make the Stack class generic
    private Knoten<T> top; // Use Knoten<T> for the type of top

    // Constructor to initialize the stack
    public Stack() {
        this.top = null;
    }

    // Method to push data onto the stack
    public void push(T data) {
        Knoten<T> newNode = new Knoten<>(data); // Create a new node with the data
        newNode.setNext(top); // Set the next of the new node to the current top
        top = newNode; // Update the top to the new node
    }

    // Method to pop data from the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Der Stack ist leer!"); // Error if the stack is empty
        }
        T data = top.getData(); // Get the data of the top node
        top = top.getNext(); // Set the new top to the next node
        return data; // Return the popped data
    }

    // Method to get the top data without removing it
    public T top() {
        if (isEmpty()) {
            throw new IllegalStateException("Der Stack ist leer!"); // Error if the stack is empty
        }
        return top.getData(); // Return the data of the top node
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null; // The stack is empty if top is null
    }
}
