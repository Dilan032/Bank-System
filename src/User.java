import java.util.ArrayList;
import java.util.Scanner;

public class User extends Person{
    public User(String name, String dob, String address) {
        super(name, dob, address); //connect with parent class variable
    }

    ArrayList<BankAccount> newBankAccount = new ArrayList<>();  //pass object (BankAccount) used reference dataType

    public void createBankAccount(String accountNumber, int balance){ //Balance is required😓 in main method i will add solution for account number and balance
        BankAccount newAccount = new BankAccount (accountNumber, balance); //create account and store data
        newBankAccount.add(newAccount);
        System.out.println("successfully created a bank account for " + getFullName());

    }

    public void allBAccountAmount(){
        int allAmount = 0;
        for (int i = 0; i < newBankAccount.size(); i++) {
             int accBalence = newBankAccount.get(i).balance;
             allAmount += accBalence;
             System.out.println("Balance of all your accounts " + allAmount);
        }
    }

    public static void calculateTax(double salary){
        double salaryWithTax = 0;

        if (salary <= 100000){
            System.out.println("No tax");

        } else if (salary <= 200000) {
            salaryWithTax -= (double) 13 / 100;
            
        } else if (salary <= 400000) {
            salaryWithTax -= (double) 15 / 100;
            
        }else {
            salaryWithTax -= (double) 20 / 100;

        }
        System.out.println("salary with Tax : " + salaryWithTax);

    }

}
