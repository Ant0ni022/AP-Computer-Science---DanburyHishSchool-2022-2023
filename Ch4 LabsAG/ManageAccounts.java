// ****************************************************************
// ManageAccounts.java
//
// Use Account class to create and manage Sally and Joe's
// bank accounts
// ****************************************************************
import java.util.Scanner;
public class ManageAccounts
{
    public static void main(String[] args)
    {
        Account acct1, acct2;
        Scanner sc = new Scanner (System.in);
        //create account1 for Sally with $1000
        acct1 = new Account(1000, "Sally", 1111);
        acct2 = new Account(500, "Joe", 6969);
        //create account2 for Joe with $500
        //deposit $100 to Joe's account
        acct1.getBalance();
        acct2.getBalance();
        System.out.println("");
        acct2.deposit(50);
        //print Joe's new balance (use getBalance())
        acct2.getBalance();
        System.out.println("");
        //withdraw $50 from Sally's account
        acct1.withdraw(50);
        acct1.getBalance();
        System.out.println("");
        //print Sally's new balance (use getBalance())
        acct1.chargeFee();
        System.out.println("");
        acct2.chargeFee();
        System.out.println("");
        //charge fees to both accounts
        acct2.changeName("Joseph");
        System.out.println("");
        //change the name on Joe's account to Joseph
        acct1.printSummary();
        System.out.println();
        acct2.printSummary();
        //print summary for both accounts
        
        
    }
}