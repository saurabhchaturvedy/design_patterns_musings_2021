public interface LoanCalculationAlgorithm {


    double getBaseAmount();

    double getInterestRate();

    double getDiscount();

    public default int calculateLoan() {
        return (int) (getBaseAmount() * getInterestRate() - getDiscount());
    }
}
