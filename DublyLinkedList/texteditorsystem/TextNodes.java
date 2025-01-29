package DublyLinkedList.texteditorsystem;

public class TextNodes {
    private TextStateNode currentState;
    private int historyLimit;
    private int historySize;

    // Constructor
    public TextNodes(int historyLimit) {
        this.currentState = null;
        this.historyLimit = historyLimit;
        this.historySize = 0;
    }

    // Add a new text state at the end
    public void addTextState(String newText) {
        TextStateNode newNode = new TextStateNode(newText);

        // If the history size is at the limit, we need to remove the oldest state
        if (historySize == historyLimit) {
            removeOldestState();
        }

        // If there's no state yet, this is the first state
        if (currentState == null) {
            currentState = newNode;
        } else {
            // Append new state at the end
            currentState.next = newNode;
            newNode.prev = currentState;
            currentState = newNode;
        }

        historySize++;
    }

    // Remove the oldest state to keep the history within the limit
    private void removeOldestState() {
        // Remove the first state from the history
        TextStateNode temp = currentState;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        // Remove the oldest state by making the next state the new "first"
        if (temp.next != null) {
            temp.next.prev = null;
        }
        historySize--;
    }

    // Undo: Revert to the previous state
    public void undo() {
        if (currentState != null && currentState.prev != null) {
            currentState = currentState.prev;
            System.out.println("Undo: " + currentState.text);
        } else {
            System.out.println("No more undo steps.");
        }
    }

    // Redo: Revert to the next state
    public void redo() {
        if (currentState != null && currentState.next != null) {
            currentState = currentState.next;
            System.out.println("Redo: " + currentState.text);
        } else {
            System.out.println("No more redo steps.");
        }
    }

    // Display the current state of the text
    public void displayCurrentState() {
        if (currentState != null) {
            System.out.println("Current Text: " + currentState.text);
        } else {
            System.out.println("No text available.");
        }
    }

    
}
