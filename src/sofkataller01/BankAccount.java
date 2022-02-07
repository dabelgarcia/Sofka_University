
package sofkataller01;

/**
 *
 * @author Dario Garcia
 */
public class BankAccount {
    
    private int accountNumber;
    
    protected boolean activated;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
  
}