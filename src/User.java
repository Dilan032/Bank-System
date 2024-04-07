import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class User extends Person{

    public User(String name, String dob, String address) {
        super(name, dob, address); //connect with parent class variable
    }


    ArrayList<SavingsAccount> newSavingAccountStorage = new ArrayList<>(); //pass object (SavingsAccount),used reference dataType
    ArrayList<FixedDepositsAccount> newFixedDepositsAccountStorage = new ArrayList<>();

    public void createBankAccount(String accountNumber, String AaccountType){
        if (Objects.equals(AaccountType, "Sa")){
            for (int i = 0; i < newSavingAccountStorage.size(); i++) {
                if (Objects.equals(newSavingAccountStorage.get(i).getAccountNumber(), accountNumber)){
                    System.out.println("This number already exist");
                    return;
                }
        }
            SavingsAccount newSaAccount = new SavingsAccount(accountNumber,0,AaccountType);
            newSavingAccountStorage.add(newSaAccount);
            System.out.println("Your Saving Account created successfully");


        } else if (Objects.equals(AaccountType, "FD")) {
            for (int i = 0; i < newFixedDepositsAccountStorage.size(); i++) {
                if (Objects.equals(newFixedDepositsAccountStorage.get(i).getAccountNumber(), accountNumber)){
                    System.out.println("This Account already exist");
                    return;
                }
        }
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the time period of deposit : ");
            int depositTime = input.nextInt();

            FixedDepositsAccount addNewAccount = new FixedDepositsAccount(accountNumber,0, AaccountType, depositTime);
            newFixedDepositsAccountStorage.add(addNewAccount);
            System.out.println("Your Fixed Deposit Account created successfully");


        }else {
            System.out.println("Invalid Account Type");
        }
    }


    public void getAccountDetails(String accountNumber, String accountType){
        if (Objects.equals(accountType, "Sa")) {
            for (int i = 0; i < newSavingAccountStorage.size(); i++) {
                SavingsAccount arrayIndex = newSavingAccountStorage.get(i); //get array list index number and assign to variable "arrayIndex"

                if (Objects.equals(arrayIndex.accountNumber, accountNumber)) {
                    System.out.println("Account Number " + arrayIndex.accountNumber);
                    System.out.println("Account Type " + arrayIndex.accountType);
                    System.out.println("Account Balance " + arrayIndex.balance);
                }
            }
        }else {
            for (int i = 0; i < newFixedDepositsAccountStorage.size(); i++) {
                FixedDepositsAccount arrayIndex = newFixedDepositsAccountStorage.get(i);

                if (Objects.equals(newFixedDepositsAccountStorage.get(i).accountNumber, accountNumber)) {
                    System.out.println("Account Number " + arrayIndex.accountNumber);
                    System.out.println("Account Type " + arrayIndex.accountType);
                    System.out.println("Account Balance " + arrayIndex.balance);
                    System.out.println("Account Deposit Period " + arrayIndex.getDepositPeriod());
                }
            }
        }

    }



    public void depositAccNumber(String accNumber, int amount, String AccountType){
        if (Objects.equals(AccountType, "Sa")){
            for (int i = 0; i < newSavingAccountStorage.size() ; i++) {
                if(Objects.equals(accNumber, newSavingAccountStorage.get(i).getAccountNumber())){
                    newSavingAccountStorage.get(i).deposit(amount);
                }
            }
        } else if (Objects.equals(AccountType, "FD")) {
            for (int i = 0; i < newFixedDepositsAccountStorage.size() ; i++) {
                if(Objects.equals(accNumber, newFixedDepositsAccountStorage.get(i).getAccountNumber())){
                    newFixedDepositsAccountStorage.get(i).deposit(amount);
                }
            }

        }else {
            System.out.println("Please Check your Provide details");
        }
    }


    public void getTotalBalanceOfAllAccount() {
        int totalBalance = 0;
            for (int i = 0; i < newSavingAccountStorage.size(); i++) {
                int accBalance = newSavingAccountStorage.get(i).balance;
                totalBalance += accBalance;
                System.out.println("Saving Account Balance : "+ totalBalance);
            }
            for (int i = 0; i < newFixedDepositsAccountStorage.size(); i++) {
                int accBalance = newFixedDepositsAccountStorage.get(i).balance;
                totalBalance += accBalance;
                System.out.println("FD Account Balance : "+ totalBalance);
            }

    }




    public  void calculateTax(double salary){
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
