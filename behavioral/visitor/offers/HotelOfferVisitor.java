public class HotelOfferVisitor implements OfferVisitor {
    @Override
    public void visitBronzeCreditCard(BronzeCreditCard bronzeCreditCard) {
        System.out.println("we are computing for a bronze card buying hotel room");
    }

    @Override
    public void visitSilverCreditCard(SilverCreditCard silverCreditCard) {
        System.out.println("we are computing for a silver card buying hotel room");
    }

    @Override
    public void visitGoldCreditCard(GoldCreditCard goldCreditCard) {
        System.out.println("we are computing for a gold card buying hotel room");
    }
}
