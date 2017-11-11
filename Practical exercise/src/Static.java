public class Static {

    public static void main(String[] args){


        double end = Math.add(10,10);
        System.out.println(end);
        System.out.println(Math.PI);

        Client a = new Client("Frey");
        Client b = new Client("Odyn");
        Client c = new Client("Thor");
        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);
    }
}

class Math
{
    static final double PI= 3.14;
    static double add(double a, double b)
    {
        return a+b;
    }
}

class Client
{
    Client(String name)
    {
        this.name = name;
        nextId++;
        id = nextId;
    }
    String name;
    int id = 0;
    static int nextId = 0;
}