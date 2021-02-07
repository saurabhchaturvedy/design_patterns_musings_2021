public class LoanCalculatorApp {

    public static void main(String[] args) {
        LoanCalculationAlgorithm loanCalculationAlgorithm = new CheapHomeLoan();
        System.out.println("cheap loan installments : " + loanCalculationAlgorithm.calculateLoan());
        loanCalculationAlgorithm = new ExpensiveHomeLoan();
        System.out.println("expensive loan installments : " + loanCalculationAlgorithm.calculateLoan());
    }
}
