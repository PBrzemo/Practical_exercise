public class Aggregation {



    public static void main(String[] args) {

        Worker2 w = new Worker2("Kris", new Adress("test", 3));

        System.out.println(w);
    }
}


class Worker2
{
    String name;
    Adress adress;

    public Worker2(String name, Adress adress) {
        this.name = name;
        this.adress = adress;
    }
    @Override
    public String toString(){
        return  this.name + ": " + adress.street+" " +adress.houseNumber;
    }
}

class Adress
{
    String street;
    int houseNumber;

    public Adress(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }
}