package adapter;

public class GPayAdapter implements PaymentProcessor {

	private GPayGateway gpayGateway;

    public GPayAdapter(GPayGateway gpayGateway) {
        this.gpayGateway = gpayGateway;
    }

    @Override
    public void processPayment(double amount) {
        gpayGateway.charge(amount);
    }

}
