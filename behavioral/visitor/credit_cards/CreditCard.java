public interface CreditCard {

    String getName();

    void accept(OfferVisitor v);
}
