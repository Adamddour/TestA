package zusastz;

public class StackTest {
    public static void main(String[] args) {
        // Erstellen eines neuen Stacks
        Stack<Integer> stack = new Stack<>();

        // Eingabewerte
        Integer[] eingabe = {1, 2, 3, 4, 5, 6, 7, 8};

        // Test-Schleife
        for (int i = 0; i < eingabe.length; i += 2) {
            // Zwei Elemente hinzufügen
            System.out.println("Hinzugefügt: " + eingabe[i] + " und " + eingabe[i + 1]);
            stack.push(eingabe[i]);
            stack.push(eingabe[i + 1]);

            // Ein Element entfernen
            Integer entferntesElement = stack.pop();
            System.out.println("Entfernt: " + entferntesElement);

            // Oberstes Element anzeigen
            System.out.println("Oberstes Element: " + stack.top());
        }

        // Verbleibende Elemente im Stack sammeln
        StringBuilder verbleibende = new StringBuilder("Verbleibende Elemente: ");
        while (!stack.isEmpty()) {
            Integer entferntesElement = stack.pop();
            verbleibende.append(entferntesElement).append(" ");
        }

        // Verbleibende Elemente ausgeben
        System.out.println(verbleibende.toString().trim());
    }
}
