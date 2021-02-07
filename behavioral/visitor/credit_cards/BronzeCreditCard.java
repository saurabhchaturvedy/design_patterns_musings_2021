public class BronzeCreditCard implements CreditCard {
    @Override
    public String getName() {
        return "bronze";
    }

    @Override
    public void accept(OfferVisitor v) {
        v.visitBronzeCreditCard(this);
    }
}
