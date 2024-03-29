//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //object in user
        User nimal = new User("nimal", "44", "puttalam");
        System.out.println(nimal.getFullName());

        // object Saving Account
        SavingsAccount newSaAcc = new SavingsAccount("123",55);

//        //object in Bank Account
//        BankAccount accSaving = new BankAccount("25469871", 1000,"sa");
//        System.out.println(accSaving.accountNumber);

//        //object in Saving Account
//        SavingsAccount newSavingAccount = new SavingsAccount("25469871", 1000,"sa");
        nimal.createBankAccount("123",55);

        //call the deposit and withdrawal methods
        newSaAcc.deposit(1000);
        newSaAcc.deposit(200);
        newSaAcc.deposit(4000);
        newSaAcc.withdrawal();
        newSaAcc.withdrawal();

        //call the InterestRate method
        newSaAcc.calInterestRate(4);

        //getHistory of withdrawal and deposit
        newSaAcc.depositHistory();
        newSaAcc.withdrawalHistory();
        newSaAcc.recentWithdrawalToThePast();

        //create bank account
        nimal.createBankAccount("123456",0);
        nimal.allBAccountAmount();

    }
}