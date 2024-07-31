package adapter;

public class GPayGateway {
	public void charge(double amount) {
        System.out.println("Processing payment of Rs." + amount + " through GPay.");
    }
}
