package stackandqueueprograms.customhashmap;

import java.util.ArrayList;

class HashMap<K, V> {
    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Node<K, V>[] table;
    private int capacity;
    private int size;
    private static final float LOAD_FACTOR = 0.75f;  // Load factor threshold

    @SuppressWarnings("unchecked")
    public HashMap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        table = (Node<K, V>[]) new Node[capacity];
    }

    private int hash(K key) {
        return key.hashCode() % capacity;
    }

    public void put(K key, V value) {
        if (size >= capacity * LOAD_FACTOR) {
            resize();
        }

        int index = hash(key);
        Node<K, V> newNode = new Node<>(key, value);

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node<K, V> current = table[index];
            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value; // Update the value
                    return;
                }
                current = current.next;
            }
            newNode.next = table[index];
            table[index] = newNode;
        }
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        Node<K, V> current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        Node<K, V> current = table[index];
        Node<K, V> prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public int size() {
        return size;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public void printMap() {
        for (int i = 0; i < capacity; i++) {
            Node<K, V> current = table[i];
            if (current != null) {
                System.out.print("Index " + i + ": ");
                while (current != null) {
                    System.out.print("[" + current.key + "=" + current.value + "] ");
                    current = current.next;
                }
                System.out.println();
            }
        }
    }

    private void resize() {
        capacity *= 2;
        Node<K, V>[] newTable = (Node<K, V>[]) new Node[capacity];
        for (int i = 0; i < table.length; i++) {
            Node<K, V> current = table[i];
            while (current != null) {
                int newIndex = current.key.hashCode() % capacity;
                Node<K, V> nextNode = current.next;
                current.next = newTable[newIndex];
                newTable[newIndex] = current;
                current = nextNode;
            }
        }
        table = newTable;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(10);

        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("David", 40);

        map.printMap();

        System.out.println("Value for Alice: " + map.get("Alice"));

        map.remove("Bob");
        map.printMap();

        System.out.println("Contains key 'Bob': " + map.containsKey("Bob"));
        System.out.println("Size of map: " + map.size());
    }
}
