package Bad;

/** 
 * This is the loan interface which is responsible for payment related operations on loan account.
 * LoanPayment implemented by actual loans like HomeLoan, CreditCardLoan, etc.
 * For credit card / personal loan which is unssecured, ForceClosure and Repayment is not allowed.**/
public interface LoanPayment {
    public void doPayment(int amount);
    public void forceCloseLoan();
    public void doRepayment(int amount);    
}
