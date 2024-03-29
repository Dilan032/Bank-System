import java.util.Scanner;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accNumber, int balance) {
        super(accNumber, balance);
    }

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
}
