public class CustomerInfoCheckoutHandler extends CheckoutHandler {
    @Override
    public void handleCheckout() {
        System.out.println("processing customer info successful...handing over to payment processing");
        if (nextHandler != null) {
            nextHandler.handleCheckout();
        }
    }
}
