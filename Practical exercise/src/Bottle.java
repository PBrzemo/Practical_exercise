public class Bottle {
//Exercise
    private double hMl;
    private double maxLitre;

    Bottle(double hMl)
    {
        this.hMl = hMl;
    }

    double gethMl()
    {
        return hMl;
    }
    void input(double amount)
    {
        this.hMl += amount;
    }
    boolean output(double amount)
    {
        if(amount < hMl)
        this.hMl -= amount;
        else
            return  false;

        return true;

    }
    void pour(double amount, Bottle w) {
        if (this.output(amount))
        {
            w.input(amount);
        }
        else
            System.out.println("error");
    }

    public static void main(String[] args){
        Bottle[] bottle = new Bottle[10];


//          bottle[0].wlej(4);
//          bottle[0].pour(4, bottle[1]);

        for(int i = 0; i<bottle.length; i++)
        {
            bottle[i]= new Bottle(0);
            System.out.println(bottle[i].gethMl());

        }

    }
}


/* to do
pojemnosc, wlanie wiecej niz pojemnosc danego pojemnika, za duza ilosc litrow do przelania*
 */