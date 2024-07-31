package sortalgo;

public class BubbleSort {
	public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Snitika", 250.75),
            new Order("O002", "Sniti", 150.50),
            new Order("O003", "Aani", 300.40)
        };

        bubbleSort(orders);

        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
