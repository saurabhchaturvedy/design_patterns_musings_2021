public class MovieOfferVisitor implements OfferVisitor {
    @Override
    public void visitBronzeCreditCard(BronzeCreditCard bronzeCreditCard) {
        System.out.println("we are computing for a bronze card buying movie ticket");
    }

    @Override
    public void visitSilverCreditCard(SilverCreditCard silverCreditCard) {
        System.out.println("we are computing for a silver card buying movie ticket");
    }

    @Override
    public void visitGoldCreditCard(GoldCreditCard goldCreditCard) {
        System.out.println("we are computing for a gold card buying movie ticket");
    }
}
