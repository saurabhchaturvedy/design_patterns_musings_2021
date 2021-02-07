public class CheckoutApp {

    public static void main(String[] args) {
        CheckoutHandler customerInfoHandler = new CustomerInfoCheckoutHandler();
        CheckoutHandler paymentInfoHandler = new PaymentCheckoutHandler();

        customerInfoHandler.setNextHandler(paymentInfoHandler);
        customerInfoHandler.handleCheckout();
    }
}
