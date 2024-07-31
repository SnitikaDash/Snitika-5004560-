package adapter;

public class AdapterPatternTest {
	public static void main(String[] args) {
        
        PaytmGateway paytmGateway = new PaytmGateway();
        PaymentProcessor paytmProcessor = new PaytmAdapter(paytmGateway);

        
        GPayGateway gpayGateway = new GPayGateway();
        PaymentProcessor gpayProcessor = new GPayAdapter(gpayGateway);

        
        paytmProcessor.processPayment(100.00);
        gpayProcessor.processPayment(200.00);
    }
}
