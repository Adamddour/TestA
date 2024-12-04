package zusastz;

public class DataStructureTest {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};

        Queue queue = new Queue();

        for (int i = 0; i < input.length; i += 2) {
            queue.enqueue(input[i]);
            queue.enqueue(input[i + 1]);
            System.out.println("Hinzugefügt: " + input[i] + " und " + input[i + 1]);

            int entfernt = queue.dequeue();
            System.out.println("Entfernt: " + entfernt);

            System.out.println("Head: " + queue.front());
        }

        System.out.print("Verbleibende Elemente: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.front() + " ");
            queue.dequeue();
        }
    }
}

