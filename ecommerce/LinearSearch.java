package ecommerce;

public class LinearSearch {
	public static int linearSearch(Product[] products, String targetProductId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId().equals(targetProductId)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Table", "Furniture")
        };

        int index = linearSearch(products, "P002");
        if (index != -1) {
            System.out.println("Product found: " + products[index]);
        } else {
            System.out.println("Product not found.");
        }
    }
}
