import java.util.*;

public class AccountOperations {
    private static Map<Integer, Account> accountMap = new HashMap<>();
    
    public void addAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public void updateAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public Account getAccount(int accountNumber) {
        return accountMap.get(accountNumber);
    }

    /**
     * This method should not be a part of AccountOperations.
     * Reason is account operations are responsible for doing operation for account. 
     * However, deposit is something called as transaction which is eventually not responsible by any account.
     * 
     * Adding this method violates SINGLE RESPONSIBILITY PRINCIPLE
     * Create new class which actually does TransactionOperations
     * **/

    public void deposit(int amount, int accountNumber) {
        // Move this method to a different class.
    }
}
