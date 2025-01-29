package inventorymanagementsystem;
public class InventoryManagementSystem {
    public static void main(String[] args) {
        ItemList inventory = new ItemList();

        // Adding items to the inventory
        inventory.addAtEnd("Apple", 1, 50, 1.5);
        inventory.addAtEnd("Banana", 2, 100, 0.8);
        inventory.addAtEnd("Orange", 3, 30, 2.0);
        inventory.addAtEnd("Grapes", 4, 20, 3.0);

        // Display all items
        System.out.println("All items in the inventory:");
        inventory.displayAllItems();

        // Search by Item ID
        Item item = inventory.searchByItemId(2);
        if (item != null) {
            System.out.println("\nItem found: " + item.itemName);
        } else {
            System.out.println("\nItem not found.");
        }

        // Update the quantity of an item
        inventory.updateQuantity(3, 40);
        System.out.println("\nAfter updating Orange's quantity:");
        inventory.displayAllItems();

        // Remove an item by Item ID
        inventory.removeByItemId(1);
        System.out.println("\nAfter removing item with ID 1:");
        inventory.displayAllItems();

        // Calculate the total inventory value
        double totalValue = inventory.calculateTotalValue();
        System.out.println("\nTotal inventory value: " + totalValue);

        // Sort the inventory by Item Name (ascending)
        inventory.sortByItemName(true);
        System.out.println("\nInventory sorted by Item Name (ascending):");
        inventory.displayAllItems();

        // Sort the inventory by Price (descending)
        inventory.sortByPrice(false);
        System.out.println("\nInventory sorted by Price (descending):");
        inventory.displayAllItems();
    }
}
