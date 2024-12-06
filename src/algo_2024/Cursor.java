package algo_2024;

class Cursor {
    private Queue leftQueue;
    private Queue rightQueue;

    public Cursor() {
        leftQueue = new Queue();
        rightQueue = new Queue();
    }

    // Bewegt den Cursor ein Zeichen nach links
    public void moveLeft() {
        if (!leftQueue.isEmpty()) {
            rightQueue.enqueue(leftQueue.dequeue());
        }
    }

    // Bewegt den Cursor ein Zeichen nach rechts
    public void moveRight() {
        if (!rightQueue.isEmpty()) {
            leftQueue.enqueue(rightQueue.dequeue());
        }
    }

    // Löscht das Zeichen links vom Cursor
    public void delete() {
        leftQueue.dequeue();
    }

    // Fügt ein Zeichen links vom Cursor ein
    public void type(char c) {
        leftQueue.enqueue(c);
    }

    // Gibt den Inhalt der linken Queue zurück
    public String getLeftContent() {
        return leftQueue.getContent();
    }

    // Gibt den Inhalt der rechten Queue zurück
    public String getRightContent() {
        return rightQueue.getContent();
    }
}
