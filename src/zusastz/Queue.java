package zusastz;

public class Queue {
    private Knoten kopf;
    private Knoten ende;

    public Queue() {
        this.kopf = null;
        this.ende = null;
    }

    public void enqueue(int daten) {
        Knoten neuerKnoten = new Knoten(daten);
        if (isEmpty()) {
            kopf = neuerKnoten;
            ende = neuerKnoten;
        } else {
            ende.setNaechster(neuerKnoten);
            ende = neuerKnoten;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Die Queue ist leer.");
        }
        int daten = kopf.getDaten();
        kopf = kopf.getNaechster();
        if (kopf == null) { 
            ende = null;
        }
        return daten;
    }

    public int front() {
        if (isEmpty()) {
            throw new IllegalStateException("Die Queue ist leer.");
        }
        return kopf.getDaten();
    }

    public boolean isEmpty() {
        return kopf == null;
    }
}

