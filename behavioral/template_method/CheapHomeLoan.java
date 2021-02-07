public class CheapHomeLoan implements LoanCalculationAlgorithm {
    @Override
    public double getBaseAmount() {
        return 10000;
    }

    @Override
    public double getInterestRate() {
        return 5.0;
    }

    @Override
    public double getDiscount() {
        return 6000;
    }
}
