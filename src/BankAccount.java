import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class BankAccount {
    public final String accountNumber;
    public int balance;
    //public final String accountType;

    //Declare ArrayList
    public ArrayList<Integer> depositStorage;
    public ArrayList<Integer> withdrawalStorage;
//    public ArrayList<Integer> SavingAccountStorage;



    public BankAccount(String accNumber, int balance){
        this.accountNumber = accNumber;
        this.balance = balance;
//        this.accountType = accType;

        //Initialization ArrayList
        this.depositStorage = new ArrayList<>();
        this.withdrawalStorage = new ArrayList<>();
//        this.SavingAccountArrayList = new ArrayList<>();


    }

    public void deposit(int amount){
        depositStorage.add(amount); //add deposit amount to arrayList

        this.balance += amount;
        System.out.println("You have successfully deposited Rs." + this.balance);
        System.out.println("your current balance is Rs." + this.balance);
        System.out.println(" ");

    }



    public void calInterestRate(int year){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Account Type Saving Account(sa) or Fixed Deposit Account(FD) ");
        String accountType = input.nextLine();

        double interest = 0;
        double TotalAmount ;

        double perAnnumForSavingAcc = 2;
        double fRateLessThan2Y = 12.5;
        double fRateLessThan5Y = 16.5;
        double fRateMoreThan5Y = 20;

        if (Objects.equals(accountType, "sa")){
            if (year >= 1){
                interest = this.balance * (year * perAnnumForSavingAcc / 100);
            } else{
                System.out.println("You do not have interest");
            }

        }else {
            if (year <= 2){
                interest = this.balance / (fRateLessThan2Y / 100);
            } else if (year <=5) {
                interest = this.balance / (fRateLessThan5Y / 100);
            }else {
                interest = this.balance / (fRateMoreThan5Y / 100);
            }
        }
        TotalAmount = this.balance +  interest;
        System.out.println("your interest is "+ interest);
        System.out.println("your Total Balance with interest is "+ TotalAmount);
    }

    public void depositHistory(){
        System.out.println("your deposit History");

        for (int i = 0; i < depositStorage.size(); i++) {
            System.out.println("Rs." + depositStorage.get(i));
            System.out.println(" ");
        }
    }

    public void withdrawalHistory(){
        System.out.println("your withdrawal History");

        for (int i = 0; i < withdrawalStorage.size(); i++) {
            System.out.println("Rs." +withdrawalStorage.get(i));
            System.out.println(" ");
        }

    }

    public void recentWithdrawalToThePast(){
        System.out.println("recent Withdrawal ");

        for (int i = withdrawalStorage.size() - 1; i >=0; i--) {
            System.out.println("Rs." + withdrawalStorage.get(i));
            System.out.println(" ");
        }
    }



}


