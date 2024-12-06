package algo_2024;

class Queue {
    private Knoten front;
    private Knoten rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    // Fügt ein Element hinten ein
    public void enqueue(char data) {
        Knoten newNode = new Knoten(data);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = rear;
        }
    }

    // Entfernt das vorderste Element
    public char dequeue() {
        if (isEmpty()) {
            return '\0'; // '\0' steht für null-char
        }
        char data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    // Gibt das vorderste Element zurück, ohne es zu entfernen
    public char front() {
        return isEmpty() ? '\0' : front.data;
    }

    // Prüft, ob die Queue leer ist
    public boolean isEmpty() {
        return front == null;
    }

    // Gibt den gesamten Inhalt der Queue als String zurück (Hilfsfunktion)
    public String getContent() {
        StringBuilder content = new StringBuilder();
        Knoten current = front;
        while (current != null) {
            content.append(current.data);
            current = current.next;
        }
        return content.toString();
    }
}
