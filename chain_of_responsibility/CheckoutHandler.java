public abstract class CheckoutHandler {

    CheckoutHandler nextHandler;

    public abstract void handleCheckout();

    public void setNextHandler(CheckoutHandler nextHandler) {
        this.nextHandler = nextHandler;
    }


}
