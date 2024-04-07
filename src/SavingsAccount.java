import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accNumber, int balance, String accountType) {
        super(accNumber, balance, accountType);
    }

//    public int GenerateSavingAccountNumber(){
//        int templateAccNumber = 114500004;
//        int NewAccountNumber;
//
//        for (int i = 0; i < SavingAccountStorage.size(); i++) {
//            if (SavingAccountStorage.get(i) != templateAccNumber){
//                templateAccNumber += 1;
//                NewAccountNumber = templateAccNumber;
//                return NewAccountNumber;
//            }
//        }return 0;
//    }


    public void withdrawal(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount to withdrawal : ");
        int amount = input.nextInt();

        while (this.balance < amount) {
            if (this.balance == 0){
                System.out.println("Your account balance is : 0 ");
                System.out.println("The transaction could not be completed");
                return;
            }
            System.out.println("not enough balance in you are account");
            System.out.println("you are account current balance is " + this.balance);

            System.out.print("Please ReEnter the amount to withdrawal : ");
            amount = input.nextInt();

            if (this.balance > amount){
                break;
            }
        }
        withdrawalStorage.add(amount); //add withdawal amount to arrayList

        this.balance -= amount;
        System.out.println("You have successfully withdrawal Rs." + amount );
        System.out.println("your current balance is Rs." + this.balance);
        System.out.println( " ");

    }


    public void calInterestRateForSA(int year){

        double interest = 0;
        double TotalAmount ;
        double perYearForSavingAcc = 2;

            if (year >= 1){
                interest = this.balance * (year * perYearForSavingAcc / 100);
            } else{
                System.out.println("You do not have interest");
            }
        TotalAmount = this.balance +  interest;
        System.out.println("your interest is "+ interest);
        System.out.println("your Total Balance with interest is "+ TotalAmount);
    }

}
