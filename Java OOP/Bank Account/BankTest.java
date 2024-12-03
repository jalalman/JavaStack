import java.util.Random;

public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount account1= new BankAccount();
        BankAccount account2=new BankAccount();
        BankAccount account3=new BankAccount();
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        account1.checkingDeposit(500);
        account1.getBalance();
        account2.checkingDeposit(100000);
        account3.checkingDeposit(9000);
        System.out.println(BankAccount.getTotalMoney());
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        account3.checkingWithdraw(700);
        System.out.println(BankAccount.getTotalMoney());
        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("Number of account : "+BankAccount.getAccounts());

  
    }
}