package algo_2024;

import java.util.Stack;

public class TextEditor {
    Stack<Character> leftStack = new Stack<>();   // Zeichen links vom Cursor
    Stack<Character> rightStack = new Stack<>();  // Zeichen rechts vom Cursor

    // Cursor nach links bewegen
    public void moveLeft() {
        if (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }
    }

    // Cursor nach rechts bewegen
    public void moveRight() {
        if (!rightStack.isEmpty()) {
            leftStack.push(rightStack.pop());
        }
    }

    // Zeichen links vom Cursor löschen
    public void deleteLeft() {
        if (!leftStack.isEmpty()) {
            leftStack.pop();
        }
    }

    // Zeichen an der Cursorposition einfügen
    public void type(char ch) {
        leftStack.push(ch);
    }

    // Aktuelle Textausgabe
    public String getText() {
        StringBuilder result = new StringBuilder();
        for (Character ch : leftStack) {
            result.append(ch);
        }
        Stack<Character> tempRight = new Stack<>();
        while (!rightStack.isEmpty()) {
            char ch = rightStack.pop();
            result.append(ch);
            tempRight.push(ch); // Speichern, um zurückzusetzen
        }
        // Rechten Stack wiederherstellen
        while (!tempRight.isEmpty()) {
            rightStack.push(tempRight.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Den Text 'Hallo Wält!' schreiben
        String input = "Hallo Wält!";
        for (char ch : input.toCharArray()) {
            editor.type(ch);
        }

        // Cursor 3-mal nach links bewegen, um auf das 'ä' zu kommen
        for (int i = 0; i < 3; i++) {
            editor.moveLeft();
        }

        // Löscht 'ä' (das Zeichen links vom Cursor)
        editor.deleteLeft();

        // Füge 'e' ein
        editor.type('e');

        // Ausgabe des Textes
        System.out.println(editor.getText());  // Erwartete Ausgabe: Hallo Welt!
    }
}
