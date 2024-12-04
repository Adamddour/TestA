package zusastz;
public class Stack<T> {
    private Knoten<T> oberster;  // Der oberste Knoten im Stack

    // Konstruktor für den Stack
    public Stack() {
        oberster = null;
    }

    // Methode zum Hinzufügen eines Elements zum Stack
    public void push(T element) {
        Knoten<T> neuerKnoten = new Knoten<>(element);
        neuerKnoten.naechster = oberster;
        oberster = neuerKnoten;

    }

    // Methode zum Entfernen eines Elements vom Stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack ist leer.");
        }
        T entferntesElement = oberster.daten;
        oberster = oberster.naechster;

        return entferntesElement;
    }

    // Methode zum Abrufen des obersten Elements ohne es zu entfernen
    public T top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack ist leer.");
        }
        return oberster.daten;
    }

    // Methode zum Überprüfen, ob der Stack leer ist
    public boolean isEmpty() {
        return oberster == null;
    }
}
