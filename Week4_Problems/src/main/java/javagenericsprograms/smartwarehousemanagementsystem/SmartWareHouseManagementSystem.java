package javagenericsprograms.smartwarehousemanagementsystem;
import java.util.ArrayList;
import java.util.List;
public abstract class SmartWareHouseSystem {

    // Step 1: Abstract class representing a warehouse item
        protected String name;
        protected double weight;

        public SmartWareHouseSystem(String name, double weight) {
            this.name = name;
            this.weight = weight;
        }

        public abstract void displayItemDetails();
    }

    // Step 2: Concrete classes extending WarehouseItem
    class Electronics extends SmartWareHouseSystem {
        private String brand;

        public Electronics(String name, double weight, String brand) {
            super(name, weight);
            this.brand = brand;
        }

        @Override
        public void displayItemDetails() {
            System.out.println("Electronics: " + name + " | Brand: " + brand + " | Weight: " + weight + "kg");
        }
    }

    class Groceries extends SmartWareHouseSystem {
        private String expiryDate;

        public Groceries(String name, double weight, String expiryDate) {
            super(name, weight);
            this.expiryDate = expiryDate;
        }

        @Override
        public void displayItemDetails() {
            System.out.println("Groceries: " + name + " | Expiry Date: " + expiryDate + " | Weight: " + weight + "kg");
        }
    }

    class Furniture extends SmartWareHouseSystem {
        private String material;

        public Furniture(String name, double weight, String material) {
            super(name, weight);
            this.material = material;
        }

        @Override
        public void displayItemDetails() {
            System.out.println("Furniture: " + name + " | Material: " + material + " | Weight: " + weight + "kg");
        }
    }

    // Step 3: Generic Storage class
    class Storage<T extends SmartWareHouseSystem> {
        private List<T> items = new ArrayList<>();

        public void addItem(T item) {
            items.add(item);
        }

        public List<T> getItems() {
            return items;
        }

        // Step 4: Wildcard method to display all items
        public void displayAllItems(List<? extends SmartWareHouseSystem> itemList) {
            for (SmartWareHouseSystem item : itemList) {
                item.displayItemDetails();
            }
        }
    }

    // Main class to demonstrate the system
    public class SmartWarehouseSystem {
        public static void main(String[] args) {
            // Create instances of different items
            Electronics laptop = new Electronics("Laptop", 2.5, "Dell");
            Groceries apples = new Groceries("Apples", 1.2, "2025-12-31");
            Furniture chair = new Furniture("Chair", 5.0, "Wood");

            // Create a storage instance
            Storage<SmartWareHouseSystem> storage = new Storage<>();

            // Add items to storage
            storage.addItem(laptop);
            storage.addItem(apples);
            storage.addItem(chair);

            // Display all items in storage
            System.out.println("Displaying all items in storage:");
            storage.displayAllItems(storage.getItems());
        }
    }

}
