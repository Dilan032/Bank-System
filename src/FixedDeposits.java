public class FixedDeposits extends BankAccount{
    private int depositPeriod;

    public FixedDeposits(String accNumber, int balance, int depositPeriod) {
        super(accNumber, balance);
        this.depositPeriod = depositPeriod;
    }

    public int getDepositPeriod() {
        return depositPeriod;
    }

    public void setDepositPeriod(int depositPeriod) {
        this.depositPeriod = depositPeriod;
    }
}
