import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //access the user class
        User userObject = new User("amal","02,05,2001","kurunegala");
        User userObject2 = new User("santha","01,04,2000","colombo");

        //create saving  bank account using user class
        userObject.createBankAccount("123456","Sa");
        System.out.println(" ");
        //get account details
        userObject.getAccountDetails("123456","Sa");
        System.out.println(" ");

        //Try to Create Existing Account
        userObject.createBankAccount("123456","Sa");
        System.out.println(" ");

        //create fixed deposit bank account using user class
        userObject2.createBankAccount("12468","FD");
        //get account details
        userObject2.getAccountDetails("12468","FD");
        System.out.println(" ");

        //first user create his second account "FD"
        userObject.createBankAccount("56789","FD");

        //deposit for "Sa"
        userObject.depositAccNumber("123456",1000,"Sa");
        System.out.println(" ");
        //deposit for "FD"
        userObject.depositAccNumber("56789",1000,"FD");
        System.out.println(" ");

        //input wrong data for deposit
        userObject2.depositAccNumber("12468",2000,"sa");
        System.out.println(" ");

        //getTotalBalanceOfAllAccount
        userObject.getTotalBalanceOfAllAccount();

        //create object for Saving Account
        SavingsAccount SaAccountObject = new SavingsAccount("123456",1000,"Sa");

        //withdrawal money in Saving Account
        SaAccountObject.withdrawal();
        //calculate Interest Rate
        SaAccountObject.calInterestRateForSA(2);

        //create object for FD Account
        FixedDepositsAccount FDAccountObject = new FixedDepositsAccount("56789",1000,"FD",2);
        //calculate Interest Rate
        FDAccountObject.calInterestRateForFD();

        //calculateTax
        userObject.calculateTax(20000);



    }
}