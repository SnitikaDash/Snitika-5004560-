package adapter;

public class PaytmAdapter implements PaymentProcessor {

	private PaytmGateway paytmGateway;

    public PaytmAdapter(PaytmGateway paytmGateway) {
        this.paytmGateway = paytmGateway;
    }

    @Override
    public void processPayment(double amount) {
        if (paytmGateway == null) {
            throw new IllegalStateException("PaytmGateway is not initialized");
        }
        paytmGateway.makePayment(amount);
    }

}
