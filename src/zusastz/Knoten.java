package zusastz;

class Knoten {
    int data;           // Wert des Knotens
    Knoten next;        // Verweis auf den nächsten Knoten

    // Konstruktor für die Initialisierung des Knotens
    public Knoten(int data) {
        this.data = data;
        this.next = null;
    }
}
