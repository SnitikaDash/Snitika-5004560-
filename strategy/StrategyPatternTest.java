package strategy;

public class StrategyPatternTest {
	public static void main(String[] args) {
        
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
        PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");

        
        PaymentContext paymentContext = new PaymentContext(creditCardPayment);

        paymentContext.executePayment(100.00);

        paymentContext.setPaymentStrategy(payPalPayment);
        paymentContext.executePayment(200.00);
    }

}
