
public class pimp
{
    private double balance;
    private double interest;
    public pimp()
    {
        balance = 0;
        interest = 0;
    }

    public pimp(double initialBalance, double initialInterest)
    {
        balance = initialBalance;
        interest = initialInterest;
    }

    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public void withdraw(double amount)
    {
        balance = balance - amount;
    }

    public void addInterest()
    {
        balance = balance + balance * interest;
    }

    public double getBalance()
    {
        return balance;
    }


}
