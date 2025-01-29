package DublyLinkedList.texteditorsystem;

public class TextStateNode {
    String text;  // The text content at this state
    TextStateNode next;
    TextStateNode prev;

    // Constructor
    public TextStateNode(String text) {
        this.text = text;
        this.next = null;
        this.prev = null;
    }
}

