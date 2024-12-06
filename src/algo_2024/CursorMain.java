package algo_2024;

public class CursorMain {

    public static void main(String[] args) {
        QueueImp<Character> leftQueue = new QueueImp<>();
        QueueImp<Character> rightQueue = new QueueImp<>();

        Cursor cursor = new Cursor(leftQueue, rightQueue);
        String inputString = "Hallo Wält!";
        char[] characters = inputString.toCharArray();

        // Typing the string
        for (char ch : characters) {
            cursor.type(ch);
        }

        // Move the cursor 7 positions to the left
        for (int i = 0; i < 7; i++) {
            cursor.moveLeft();
        }

        // Delete a character at the cursor position
        cursor.delete();

        // Insert 'e' at the cursor position
        rightQueue.enqueue('e');

        // Move all characters to the right queue
        while (!leftQueue.isEmpty()) {
            cursor.moveLeft();
        }

        // Print the final state of the right queue
        while (!rightQueue.isEmpty()) {
            System.out.print(rightQueue.front());
            rightQueue.dequeue();
        }
    }
}
