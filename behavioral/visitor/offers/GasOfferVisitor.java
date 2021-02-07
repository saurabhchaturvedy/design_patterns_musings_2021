public class GasOfferVisitor implements OfferVisitor{
    @Override
    public void visitBronzeCreditCard(BronzeCreditCard bronzeCreditCard) {
        System.out.println("we are computing for a bronze card buying gas");
    }

    @Override
    public void visitSilverCreditCard(SilverCreditCard silverCreditCard) {
        System.out.println("we are computing for a silver card buying gas");
    }

    @Override
    public void visitGoldCreditCard(GoldCreditCard goldCreditCard) {
        System.out.println("we are computing for a gold card buying gas");
    }
}
