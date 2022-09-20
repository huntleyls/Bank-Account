// file:    BankAccount.java
// author:  Robert Keller
// purpose: A first Java program, defining a bank account.

/**  
 *  BankAccount defines one bank account.
 */

class BankAccount
{
    private int balance;            // this account's balance

    private int number;             // account number

    String owner;                   // name of account owner

    String owner_ss_no;             // owner's social security number

    static int last_acct = 0;       // account number counter

    /**
    Constructor for a bank acount
     **/

    public BankAccount(String owner, String owner_ss_no, int initial_balance)
    {
        this.owner = owner;
        this.owner_ss_no = owner_ss_no;
        balance = initial_balance;
        number = ++last_acct;
    }

    /**
    Make a deposit of a specified amount
     **/

    public void deposit(int amount)
    {
        balance += amount;            
    }

    /**
    Try to make a withdrawal of a specified amount.
    Return true if this was possible, false otherwise. 
     **/

    public boolean withdraw(int amount)
    {
        if( amount > balance )
            return false;		// unsuccessful
        balance -= amount;		// successful
        return true;
    }

    /**
    Print a statement for the account.
     **/

    public void statement()
    {
        System.out.println("Balance in account number " + number + " is " + balance);
    }

    /**
    Close the account.
     **/

    public void close()
    {
        balance = 0;
    }

    /**
    BankAccount test program.
     **/

    public static void main(String args[])
    {
        // declare accounts
        BankAccount a, b, c;

        // create accounts
        a = new BankAccount("Alice", "991",  15000);
        b = new BankAccount("Wei",   "995", 200000);
        c = new BankAccount("Helga", "998", 100000);

        // use accounts
        b.deposit(5000);
        c.deposit(50000);

        if( !a.withdraw(5000) )
        {
            System.out.println("Insufficient funds in " + a.number);
        }

        if( !a.withdraw(11000) )
        {
            System.out.println("Insufficient funds in " + a.number);
        }

        // print statements
        a.statement();
        b.statement();
        c.statement();
    }
}