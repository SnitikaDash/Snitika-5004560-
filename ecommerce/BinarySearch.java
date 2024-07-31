package ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
	public static int binarySearch(Product[] products, String targetProductId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductId().compareTo(targetProductId);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
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

        
        Arrays.sort(products, Comparator.comparing(Product::getProductId));

        int index = binarySearch(products, "P002");
        if (index != -1) {
            System.out.println("Product found: " + products[index]);
        } else {
            System.out.println("Product not found.");
        }
    }
}
