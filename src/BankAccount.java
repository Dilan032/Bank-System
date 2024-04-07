import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class BankAccount {
    public final String accountNumber;
    public int balance;
    public final String accountType;

    //Declare ArrayList
    public ArrayList<Integer> depositStorage;
    public ArrayList<Integer> withdrawalStorage;




    public BankAccount(String accNumber, int balance, String accountType){
        this.accountNumber = accNumber;
        this.balance = 0;
        this.accountType = accountType;

        //Initialization ArrayList
        this.depositStorage = new ArrayList<>();
        this.withdrawalStorage = new ArrayList<>();

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(int amount){
        depositStorage.add(amount); //add deposit amount to arrayList

        this.balance += amount;
        System.out.println("You have successfully deposited Rs." + this.balance);
        System.out.println("your current balance is Rs." + this.balance);
        System.out.println(" ");

    }


    public void depositHistory(){
        System.out.println("your deposit History");
        if (!depositStorage.isEmpty()){
            System.out.println("you have not deposit history");
        }
        for (int i = 0; i < depositStorage.size(); i++) {
            System.out.println("Rs." + depositStorage.get(i));
            System.out.println(" ");

        }
    }

    public void withdrawalHistory(){
        System.out.println("your withdrawal History");
        if (!withdrawalStorage.isEmpty()){
            System.out.println("you have not withdrawal history");
        }
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


