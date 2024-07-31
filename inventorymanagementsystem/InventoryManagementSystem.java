package inventorymanagementsystem;

import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {

	private Map<String, Product> inventory;

    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, Product updatedProduct) {
        if (inventory.containsKey(productId)) {
            inventory.put(productId, updatedProduct);
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

    public void displayInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        Product p1 = new Product("P001", "Laptop", 10, 999.99);
        Product p2 = new Product("P002", "Smartphone", 20, 499.99);

        ims.addProduct(p1);
        ims.addProduct(p2);

        ims.displayInventory();

        p1.setPrice(899.99);
        ims.updateProduct("P001", p1);

        ims.displayInventory();

        ims.deleteProduct("P002");

        ims.displayInventory();
    }

}
