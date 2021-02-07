public interface OfferVisitor {

    void visitBronzeCreditCard(BronzeCreditCard bronzeCreditCard);

    void visitSilverCreditCard(SilverCreditCard silverCreditCard);

    void visitGoldCreditCard(GoldCreditCard goldCreditCard);
}
