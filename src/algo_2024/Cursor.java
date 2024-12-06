package algo_2024;

public class Cursor {

    private QueueImp<Character> left;
    private QueueImp<Character> right;

    public Cursor(QueueImp<Character> left, QueueImp<Character> right) {
        this.left = left;
        this.right = right;
    }

    public void moveLeft() {
        if (!left.isEmpty()) {
            right.enqueue(left.front());
            left.dequeue();
        } else {
            throw new IllegalStateException("No elements on the left to move.");
        }
    }

    public void moveRight() {
        if (!right.isEmpty()) {
            left.enqueue(right.front());
            right.dequeue();
        } else {
            throw new IllegalStateException("No elements on the right to move.");
        }
    }

    public void delete() {
        if (!left.isEmpty()) {
            left.dequeue();
        } else {
            throw new IllegalStateException("No elements to delete on the left.");
        }
    }

    public void type(char c) {
        left.enqueue(c);
    }
}
