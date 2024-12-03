import java.util.Random;

public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber="";//ninja bouns 1
    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    BankAccount(){
        this.checkingBalance=0;
        this.savingsBalance=0;
        accounts++;
        totalMoney+= checkingBalance+savingsBalance;
       
        this.randomAccountNumber();
    }
    
    // GETTERS
    // for checking, savings, accounts, and totalMoney
    double getCheckingBalance(){
        return this.checkingBalance;
    }
    double getSavingsBalance(){
        return this.savingsBalance;
    }
    static int getAccounts(){
        return accounts;
    }
    static double getTotalMoney(){

        return totalMoney;
    }
    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account

    void checkingDeposit(double amount){
        this.checkingBalance+= amount;
        totalMoney+=amount;
    }

    void savingsBalanceDeposit(double amount){
        this.savingsBalance+=amount;
        totalMoney+=amount;
    }
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    String checkingWithdraw(double amount){
        if (amount > this.checkingBalance){
            return "you dont have suffiant balance is checking account";
        }
        this.checkingBalance-=amount;
        totalMoney-=amount;
        return String.format("you have withdrawan %.2f from checking account",amount);
    }

    String savingsWithdraw(double amount){
        if (amount > this.savingsBalance){
            return "you dont have suffiant balance is checking account";
        }
        this.savingsBalance-=amount;
        totalMoney-=amount;
        return String.format("you have withdrawan %.2f from savings account",amount);
    }
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    void getBalance(){
        System.out.println("Checking Balance : $"+this.checkingBalance);
        System.out.println("Savings Balance : $"+this.savingsBalance);
        System.out.println("Your account Number: " + this.accountNumber);
    }

    //ninja bounce 2 
    private String randomAccountNumber(){
        Random randowmAccount= new Random();
        for(int i =0 ;i<10;i++){
            randowmAccount.nextInt(10);
            this.accountNumber+=randowmAccount.nextInt(10);;
        }
        return this.accountNumber;
    }
}