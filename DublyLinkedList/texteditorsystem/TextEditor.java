package DublyLinkedList.texteditorsystem;

public class TextEditor {
    public static void main(String[] args) {
        TextNodes editor = new TextNodes(5); // Limit the history to the last 5 states

        // Add some text states
        editor.addTextState("Hello");
        editor.displayCurrentState();  // Output: Hello

        editor.addTextState("Hello, World!");
        editor.displayCurrentState();  // Output: Hello, World!

        editor.addTextState("Hello, World! How are you?");
        editor.displayCurrentState();  // Output: Hello, World! How are you?

        editor.addTextState("Hello, World! How are you? I'm good.");
        editor.displayCurrentState();  // Output: Hello, World! How are you? I'm good.

        editor.addTextState("Hello, World! How are you? I'm good. Thanks for asking.");
        editor.displayCurrentState();  // Output: Hello, World! How are you? I'm good. Thanks for asking.

        // Try adding a 6th state (should remove the oldest state)
        editor.addTextState("New state added, oldest should be removed.");
        editor.displayCurrentState();  // Output: New state added, oldest should be removed.

        // Undo and Redo operations
        editor.undo();  // Output: Undo: Hello, World! How are you? I'm good.
        editor.undo();  // Output: Undo: Hello, World! How are you?
        editor.redo();  // Output: Redo: Hello, World! How are you? I'm good.
        editor.redo();  // Output: Redo: Hello, World! How are you? I'm good. Thanks for asking.
    }
    
}
