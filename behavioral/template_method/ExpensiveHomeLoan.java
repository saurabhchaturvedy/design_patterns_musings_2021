public class ExpensiveHomeLoan implements LoanCalculationAlgorithm {
    @Override
    public double getBaseAmount() {
        return 10000;
    }

    @Override
    public double getInterestRate() {
        return 8.0;
    }

    @Override
    public double getDiscount() {
        return 1500;
    }
}
