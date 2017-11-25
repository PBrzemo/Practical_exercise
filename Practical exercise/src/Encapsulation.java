public class Encapsulation {
    public static void main(String[] args){
        /*
        Encapsulation - Set properties so
        that they are not directly accessible
        from other classes

        "private"
        "get"
        "set"

        */

        AccBank payment = new AccBank();

        payment.payIn(50000);

        if (payment.pay(40000))
        {
            System.out.println("Payment:");
        }
        else
            System.out.println("insufficient amount of funds");

        System.out.println(payment.getBalance());
    }
}

class AccBank
{
    private int balance;

    int getBalance()
    {
        return balance;
    }

    private boolean setBalance(int balance)
    {
        this.balance = balance;
        return true;
    }

    boolean pay(int howMuch)
    {
       if(balance<howMuch)
           return false;
       else
           setBalance(balance-howMuch);
        return true;
    }
    boolean payIn(int howMuch)
    {
        setBalance(balance + howMuch);
        return true;
    }
}