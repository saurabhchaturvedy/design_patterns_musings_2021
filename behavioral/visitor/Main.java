public class Main {

    public static void main(String[] args) {
        OfferVisitor offerVisitor = new MovieOfferVisitor();

        CreditCard bronze = new BronzeCreditCard();
        CreditCard silver = new SilverCreditCard();
        CreditCard gold = new GoldCreditCard();


        bronze.accept(offerVisitor);
    }
}
