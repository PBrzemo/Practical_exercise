package pInterface;

public class Inter1 {

    public static void main(String[] args)
    {
//        Interface1 a = new Worker();
//        ((Worker)a).getPayment();
//        System.out.println(Interface1.PI);
    }
}

class Worker implements Interface1, Interface2, Comparable
{

    @Override
    public void smt()
    {

    }
    Worker(double payment)
    {
       this.payment = payment;
    }

    public double getPayment()
    {
        return this.payment;
    }
    private double payment;

    @Override
    public int compareTo(Object o) {
        Worker send = (Worker)o;
        if(this.payment < send.payment)
            return -1;
        else if (this.payment > send.payment)
            return  1;


        return  0;
    }
}