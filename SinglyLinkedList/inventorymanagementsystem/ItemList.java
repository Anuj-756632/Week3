package inventorymanagementsystem;

public class ItemList {
        Item head;
    
        // Constructor to initialize the inventory list
        public ItemList() {
            head = null;
        }
    
        // Add an item at the beginning of the inventory
        public void addAtBeginning(String itemName, int itemId, int quantity, double price) {
            Item newItem = new Item(itemName, itemId, quantity, price);
            newItem.next = head;
            head = newItem;
        }
    
        // Add an item at the end of the inventory
        public void addAtEnd(String itemName, int itemId, int quantity, double price) {
            Item newItem = new Item(itemName, itemId, quantity, price);
            if (head == null) {
                head = newItem;
            } else {
                Item temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newItem;
            }
        }
    
        // Add an item at a specific position
        public void addAtPosition(String itemName, int itemId, int quantity, double price, int position) {
            Item newItem = new Item(itemName, itemId, quantity, price);
            if (position == 0) {
                addAtBeginning(itemName, itemId, quantity, price);
                return;
            }
            Item temp = head;
            int count = 0;
            while (temp != null && count < position - 1) {
                temp = temp.next;
                count++;
            }
            if (temp != null) {
                newItem.next = temp.next;
                temp.next = newItem;
            } else {
                System.out.println("Position out of range.");
            }
        }
    
        // Remove an item based on Item ID
        public void removeByItemId(int itemId) {
            if (head == null) {
                System.out.println("Inventory is empty.");
                return;
            }
    
            if (head.itemId == itemId) {
                head = head.next;
                return;
            }
    
            Item temp = head;
            while (temp.next != null && temp.next.itemId != itemId) {
                temp = temp.next;
            }
    
            if (temp.next == null) {
                System.out.println("Item not found.");
            } else {
                temp.next = temp.next.next;
            }
        }
    
        // Update the quantity of an item based on Item ID
        public void updateQuantity(int itemId, int newQuantity) {
            Item item = searchByItemId(itemId);
            if (item != null) {
                item.quantity = newQuantity;
                System.out.println("Quantity updated successfully.");
            } else {
                System.out.println("Item not found.");
            }
        }
    
        // Search for an item by Item ID
        public Item searchByItemId(int itemId) {
            Item temp = head;
            while (temp != null) {
                if (temp.itemId == itemId) {
                    return temp;
                }
                temp = temp.next;
            }
            return null; // Item not found
        }
    
        // Search for an item by Item Name
        public Item searchByItemName(String itemName) {
            Item temp = head;
            while (temp != null) {
                if (temp.itemName.equalsIgnoreCase(itemName)) {
                    return temp;
                }
                temp = temp.next;
            }
            return null; // Item not found
        }
    
        // Calculate the total value of the inventory
        public double calculateTotalValue() {
            double totalValue = 0;
            Item temp = head;
            while (temp != null) {
                totalValue += temp.quantity * temp.price;
                temp = temp.next;
            }
            return totalValue;
        }
    
        // Sort the inventory based on Item Name (ascending or descending)
        public void sortByItemName(boolean ascending) {
            if (head == null || head.next == null) return;
    
            head = mergeSortByName(head, ascending);
        }
    
        // Sort the inventory based on Item Price (ascending or descending)
        public void sortByPrice(boolean ascending) {
            if (head == null || head.next == null) return;
    
            head = mergeSortByPrice(head, ascending);
        }
    
        // Merge Sort based on Item Name
        private Item mergeSortByName(Item head, boolean ascending) {
            if (head == null || head.next == null) {
                return head;
            }
    
            Item middle = getMiddle(head);
            Item nextOfMiddle = middle.next;
            middle.next = null;
    
            Item left = mergeSortByName(head, ascending);
            Item right = mergeSortByName(nextOfMiddle, ascending);
    
            return mergeByName(left, right, ascending);
        }
    
        // Merge two sorted lists based on Item Name
        private Item mergeByName(Item left, Item right, boolean ascending) {
            if (left == null) return right;
            if (right == null) return left;
    
            if (ascending) {
                if (left.itemName.compareTo(right.itemName) <= 0) {
                    left.next = mergeByName(left.next, right, ascending);
                    return left;
                } else {
                    right.next = mergeByName(left, right.next, ascending);
                    return right;
                }
            } else {
                if (left.itemName.compareTo(right.itemName) >= 0) {
                    left.next = mergeByName(left.next, right, ascending);
                    return left;
                } else {
                    right.next = mergeByName(left, right.next, ascending);
                    return right;
                }
            }
        }
    
        // Merge Sort based on Item Price
        private Item mergeSortByPrice(Item head, boolean ascending) {
            if (head == null || head.next == null) {
                return head;
            }
    
            Item middle = getMiddle(head);
            Item nextOfMiddle = middle.next;
            middle.next = null;
    
            Item left = mergeSortByPrice(head, ascending);
            Item right = mergeSortByPrice(nextOfMiddle, ascending);
    
            return mergeByPrice(left, right, ascending);
        }
    
        // Merge two sorted lists based on Item Price
        private Item mergeByPrice(Item left, Item right, boolean ascending) {
            if (left == null) return right;
            if (right == null) return left;
    
            if (ascending) {
                if (left.price <= right.price) {
                    left.next = mergeByPrice(left.next, right, ascending);
                    return left;
                } else {
                    right.next = mergeByPrice(left, right.next, ascending);
                    return right;
                }
            } else {
                if (left.price >= right.price) {
                    left.next = mergeByPrice(left.next, right, ascending);
                    return left;
                } else {
                    right.next = mergeByPrice(left, right.next, ascending);
                    return right;
                }
            }
        }
    
        // Get the middle of the list (used in merge sort)
        private Item getMiddle(Item head) {
            if (head == null) return head;
    
            Item slow = head;
            Item fast = head;
    
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
    
            return slow;
        }
    
        // Display all items in the inventory
        public void displayAllItems() {
            if (head == null) {
                System.out.println("Inventory is empty.");
                return;
            }
            Item temp = head;
            while (temp != null) {
                System.out.println("Item Name: " + temp.itemName + ", Item ID: " + temp.itemId +
                        ", Quantity: " + temp.quantity + ", Price: " + temp.price);
                temp = temp.next;
            }
        }
}
