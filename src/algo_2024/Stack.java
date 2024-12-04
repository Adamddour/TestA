package algo_2024;

class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    // Element auf den Stack hinzufügen
    public void push(char data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Element vom Stack entfernen
    public char pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack ist leer");
        }
        char data = top.data;
        top = top.next;
        return data;
    }

    // Element an der Spitze des Stacks ansehen
    public char peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack ist leer");
        }
        return top.data;
    }

    // Überprüfen, ob der Stack leer ist
    public boolean isEmpty() {
        return top == null;
    }
}
