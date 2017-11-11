public class Constructor {

    public static void main(String[] args)
    {
    /*
        new(reserves space in memory) class name();
        or
        class name = new(-||-) class name;

        this
     */
//        new Test();
//        Test a;
//        a = new Test();
//        a.x = 5;
//        a.y = 20;
//        Test a = new Test();
        Test a = new Test(10, 15);
        System.out.println("a.x="+a.x);
        System.out.println("a.y="+a.y);
    }
}

//
class Test
{
    Test()
    {
        System.out.println("Test");
    }
    Test(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    int x;
    int y;
}