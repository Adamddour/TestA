package zusastz;

class Queue {
    private Knoten front;   // Zeiger auf den ersten Knoten (Kopf der Queue)
    private Knoten rear;    // Zeiger auf den letzten Knoten (Ende der Queue)

    // Konstruktor zum Initialisieren der Queue
    public Queue() {
        this.front = this.rear = null;
    }

    // Methode zum Hinzufügen eines Elements zur Queue (enqueue)
    public void enqueue(int data) {
        Knoten newNode = new Knoten(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Methode zum Entfernen eines Elements aus der Queue (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue ist leer. Kein Element zu entfernen.");
            return -1;  // Fehlerwert
        }
        int value = front.data;
        front = front.next;

        // Wenn die Queue nach dem Entfernen leer ist
        if (front == null) {
            rear = null;
        }
        return value;
    }

    // Methode, um das vorderste Element der Queue zu sehen (front)
    public int front() {
        if (isEmpty()) {
            System.out.println("Queue ist leer.");
            return -1;  // Fehlerwert
        }
        return front.data;
    }

    // Methode zur Überprüfung, ob die Queue leer ist
    public boolean isEmpty() {
        return front == null;
    }

    // Methode zur Ausgabe der Queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue ist leer.");
            return;
        }
        Knoten temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main-Methode zum Testen der Queue-Implementierung
    public static void main(String[] args) {
        Queue queue = new Queue();
        
        // Test der Queue-Operationen
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();  // Erwartete Ausgabe: Queue: 10 20 30

        System.out.println("Front: " + queue.front());  // Erwartete Ausgabe: Front: 10
        
        System.out.println("Dequeued: " + queue.dequeue());  // Erwartete Ausgabe: Dequeued: 10
        queue.display();  // Erwartete Ausgabe: Queue: 20 30

        System.out.println("Front: " + queue.front());  // Erwartete Ausgabe: Front: 20
        System.out.println("IsEmpty: " + queue.isEmpty());  // Erwartete Ausgabe: IsEmpty: false

        queue.dequeue();
        queue.dequeue();
        queue.display();  // Erwartete Ausgabe: Queue ist leer.
        System.out.println("IsEmpty: " + queue.isEmpty());  // Erwartete Ausgabe: IsEmpty: true
    }
}

