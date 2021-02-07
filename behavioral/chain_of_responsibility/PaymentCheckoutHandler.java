public class PaymentCheckoutHandler extends CheckoutHandler {
    @Override
    public void handleCheckout() {
        System.out.println("processing payment gateway checkout...");
        if (nextHandler != null) {
            nextHandler.handleCheckout();
        }
    }
}
