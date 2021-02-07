public class FoodOfferVisitor implements OfferVisitor {
    @Override
    public void visitBronzeCreditCard(BronzeCreditCard bronzeCreditCard) {
        System.out.println("we are computing for a bronze card buying food");
    }

    @Override
    public void visitSilverCreditCard(SilverCreditCard silverCreditCard) {
        System.out.println("we are computing for a silver card buying food");
    }

    @Override
    public void visitGoldCreditCard(GoldCreditCard goldCreditCard) {
        System.out.println("we are computing for a gold card buying food");
    }
}
