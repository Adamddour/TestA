package algo_2024;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private Stack<Character> leftStack;
    private Stack<Character> rightStack;

    public TextEditor() {
        leftStack = new Stack<>();
        rightStack = new Stack<>();
    }

    // Move the cursor one character left
    public void moveLeft() {
        if (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }
    }

    // Move the cursor one character right
    public void moveRight() {
        if (!rightStack.isEmpty()) {
            leftStack.push(rightStack.pop());
        }
    }

    // Delete the character at the current cursor position
    public void delete() {
        if (!leftStack.isEmpty()) {
            leftStack.pop();
        }
    }

    // Type a new character at the current cursor position
    public void type(char c) {
        leftStack.push(c);
    }

    // Get the current text by combining left and right stacks
    public String getText() {
        StringBuilder text = new StringBuilder();

        for (Character c : leftStackToList()) {
            text.append(c);
        }

        for (Character c : rightStackToList()) {
            text.append(c);
        }

        return text.toString();
    }

    // Convert the left stack to a list
    private List<Character> leftStackToList() {
        Stack<Character> tempStack = new Stack<>();
        List<Character> result = new ArrayList<>();

        // Pop elements from leftStack into tempStack
        while (!leftStack.isEmpty()) {
            tempStack.push(leftStack.pop());
        }

        // Pop elements from tempStack into the result list and push them back to leftStack
        while (!tempStack.isEmpty()) {
            Character c = tempStack.pop();
            result.add(c);
            leftStack.push(c);
        }

        return result;
    }

    // Convert the right stack to a list
    private List<Character> rightStackToList() {
        Stack<Character> tempStack = new Stack<>();
        List<Character> result = new ArrayList<>();

        // Pop elements from rightStack into tempStack
        while (!rightStack.isEmpty()) {
            Character c = rightStack.pop();
            result.add(c);
            tempStack.push(c);
        }

        // Pop elements from tempStack back into rightStack
        while (!tempStack.isEmpty()) {
            rightStack.push(tempStack.pop());
        }

        return result;
    }

    // Main method to test the TextEditor class
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.type('H');
        editor.type('a');
        editor.type('l');
        editor.type('l');
        editor.type('o');
        editor.type(' ');
        editor.type('W');
        editor.type('ä');
        editor.type('l');
        editor.type('t');

        System.out.println("Text: " + editor.getText());

        editor.moveLeft();
        editor.moveLeft();

        editor.delete();

        editor.type('e');
        System.out.println("Text neu: " + editor.getText());
    }
}
