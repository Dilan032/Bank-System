public class FixedDepositsAccount extends BankAccount{
    private int depositPeriod;

    public FixedDepositsAccount(String accNumber, int balance, String accountType, int depositPeriod) {
        super(accNumber, balance, accountType);
        this.depositPeriod = depositPeriod;
    }

    public int getDepositPeriod() {
        return depositPeriod;
    }

    public void setDepositPeriod(int depositPeriod) {
        this.depositPeriod = depositPeriod;
    }


    public void calInterestRateForFD(){

        double interest = 0;
        double TotalAmount ;

        double fRateLessThan2Y = 12.5;
        double fRateLessThan5Y = 16.5;
        double fRateMoreThan5Y = 20;

            if (depositPeriod <= 2){
                interest = this.balance / (fRateLessThan2Y / 100);
            } else if (depositPeriod <=5) {
                interest = this.balance / (fRateLessThan5Y / 100);
            }else {
                interest = this.balance / (fRateMoreThan5Y / 100);
            }

        TotalAmount = this.balance +  interest;
        System.out.println("your interest is "+ interest);
        System.out.println("your Total Balance with interest is "+ TotalAmount);
    }

}
