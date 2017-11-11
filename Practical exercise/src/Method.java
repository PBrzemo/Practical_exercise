public class Method {
    public static void main(String[] args){

        Met a = new Met();
        a.text("xaxaxaxaxa", "xaxa");

        Met a2 = new Met();
        a2.text("yayayaya", "yayaya");
//      int w = a.add(10,20);
        double w = a.add(10.1,20.2);
        System.out.println(w);
        double w2 =a.division(5,0);
        System.out.println(w2);

    }
}

class Met
{
    void text(String test, String test1)
    {
    System.out.println("Test: " + test);
    System.out.println("Test1: "  + test1);
    System.out.println();
    }

    int add(int x, int y)
    {
        return x + y;
    }
    double add(double x, double y)
    {
        return x + y;
    }
    double division (double a, double b)
    {
        if (b == 0)
            return 0;
        System.out.println("WoW: ");
        return a/b;
    }
}
