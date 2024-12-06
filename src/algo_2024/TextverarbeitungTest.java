package algo_2024;

public class TextverarbeitungTest {
    public static void main(String[] args) {
        // 0. Erstellen des Cursors
        Cursor cursor = new Cursor();

        // 1. Schreiben des Texts „Hallo Wält!“
        String text = "Hallo Wält!";
        for (char c : text.toCharArray()) {
            cursor.type(c);
        }

        // 2. Ausgabe des Inhalts
        System.out.println(cursor.getLeftContent() + " | " + cursor.getRightContent());
        // Erwartet: „Hallo Wält!“ | „“

        // 3. Bewegen des Cursors an die Position zwischen „ä“ und „W“
        for (int i = 0; i < 5; i++) { // 5 Zeichen nach links bewegen
            cursor.moveLeft();
        }

        // 4. Ausgabe des Inhalts
        System.out.println(cursor.getLeftContent() + " | " + cursor.getRightContent());
        // Erwartet: „ält!“ | „Hallo W“

        // 5. Löschen des „ä“
        cursor.delete();

        // 6. Einfügen von „e“
        cursor.type('e');

        // 7. Ausgabe des Inhalts
        System.out.println(cursor.getLeftContent() + " | " + cursor.getRightContent());
        // Erwartet: „lt!“ | „Hallo We“

        // 8. Platzieren des Cursors vor dem „!“ von „Welt“
        while (!cursor.getRightContent().isEmpty()) {
            cursor.moveRight();
        }

        // 9. Ausgabe des Inhalts
        System.out.println(cursor.getLeftContent() + " | " + cursor.getRightContent());
        // Erwartet: „“ | „Hallo Welt!“
    }
}

