package Bad;

public class CreditCardLoan implements LoanPayment{
    @Override
    public void doPayment(int amount) {

    }

    @Override
    public void foreCloseLoan() {
        throw new UnsupportedOperationException("Force Closure Not Allowed");
    }

    @Override
    public void doRepayment(int amount) {
        throw new UnsupportedOperationException("Repayment Not Allowed");
    }
}
