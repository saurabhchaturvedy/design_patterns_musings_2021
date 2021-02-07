public class SilverCreditCard implements CreditCard {
    @Override
    public String getName() {
        return "silver";
    }

    @Override
    public void accept(OfferVisitor v) {
        v.visitSilverCreditCard(this);
    }
}
