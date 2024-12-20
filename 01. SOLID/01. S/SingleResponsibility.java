import java.math.BigDecimal;

public class SingleResponsibility {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(123);
        account.setFirstName("Shrutika");
        account.setTotalAmount(BigDecimal.valueOf(1000000));
        AccountOperations accountOperations = new AccountOperations();
        accountOperations.addAccount(account);

        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.deposit(BigDecimal.valueOf(123), 123);
    }
}