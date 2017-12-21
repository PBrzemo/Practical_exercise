public class InnerClass2 {
    public static void main(String[] args) {

        BankAcc bankacc = new BankAcc(1000);
        System.out.println(bankacc.getAccBalance());
        bankacc.start(5);
        System.out.println(bankacc.getAccBalance());
    }
}

class BankAcc
{
    public BankAcc(double accBalance)
    {
        this.accBalance = accBalance;
    }

    private double accBalance;

    double getAccBalance()
    {
        return this.accBalance;
    }

    void start(double Rate)
    {
        Interest interest = new Interest(Rate);
        //interest.chAccBalance(Rate);
    }

    class Interest
    {
       public Interest(double interestRate)
       {
            this.interestRate = interestRate;
            this.chAccBalance(interestRate);
       }

       void chAccBalance(double Rate)
       {
           double intereset = (accBalance * Rate) / 100;
           accBalance += intereset;
       }

       private double interestRate;
    }
}