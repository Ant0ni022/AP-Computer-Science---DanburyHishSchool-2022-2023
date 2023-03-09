//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
//*******************************************************
public class Account
{
    private double balance;
    private String name;
    private long acctNum;
    //----------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    public Account(double initBal, String owner, long number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;
    }
    //----------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    //----------------------------------------------
    public void withdraw(double amount)
    {
        if (balance >= amount)
        {   
            balance -= amount;
            System.out.println(name + " have withdraw " + amount); 
        }
        else
            System.out.println("Insufficient funds");
    }
    //----------------------------------------------
    // Adds deposit amount to balance.
    //----------------------------------------------
    public void deposit(double amount)
    {
        balance += amount;
        System.out.println(name + " have deposited " + amount);
    }
    //----------------------------------------------
    // Returns balance.
    //----------------------------------------------
    public void getBalance()
    {
        System.out.println("The account balance under " + name + " is now: " + balance);
    }
    //----------------------------------------------
    // Prints name, account number, and balance.
    //----------------------------------------------
    public void printSummary()
    {
        System.out.println("Here is your bank statement: ");
        System.out.println("Name: " + name);
        System.out.println("Total Balance: " + balance);
        System.out.println("Account Number: " + acctNum);
    }
    //----------------------------------------------
    // Deducts $10 service fee if balance is under $1000
    //----------------------------------------------
    public void chargeFee()
    {
        if(balance < 1000)
        {
            balance -= 10;
            System.out.println("Due to your account under " + name + " haveing a blance under $1000 we're deducting 10 dollers of you balance");
            System.out.println(balance);
        }
    }
    //----------------------------------------------
    // Changes the name on the account
    //----------------------------------------------
    public void changeName(String newName)
    {
        System.out.println("You have change yor account name from " + name);
        name = newName;
        System.out.println("To " + name);
    }
}