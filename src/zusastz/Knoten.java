package zusastz;

public class Knoten<T> {
    T daten;          // Das im Knoten gespeicherte Daten-Element
    Knoten<T> naechster;  // Zeiger auf den nächsten Knoten

    // Konstruktor für den Knoten
    public Knoten(T daten) {
        this.daten = daten;
        this.naechster = null;
    }
}
