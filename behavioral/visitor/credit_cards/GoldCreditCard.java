public class GoldCreditCard implements CreditCard {
    @Override
    public String getName() {
        return "gold";
    }

    @Override
    public void accept(OfferVisitor v) {
        v.visitGoldCreditCard(this);
    }
}
