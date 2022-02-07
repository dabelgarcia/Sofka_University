package sofkataller01;

/**
 *
 * @author DArio Garcia
 */

public class CreditCard extends BankAccount {
    
    private int id;
    protected int pinNumber;
    protected boolean activated;
    public String bank;

    public CreditCard() {
    }

    public CreditCard(int id, int pinNumber, boolean activated, String bank) {
        this.id = id;
        this.pinNumber = pinNumber;
        this.activated = activated;
        this.bank = bank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public boolean isActivated() {
        return activated;
    }

    /**
     *
     * @param activated
     */
    @Override
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
    
}
