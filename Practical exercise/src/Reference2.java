public class Reference2 {
    public static void main(String[] args){

        int a = 5;


        Test3 x = new Test3();

        a = x.var(a);

        System.out.println(a);

        Foo foo = new Foo();

        x.chVar(foo);
        System.out.println(foo.y);


    }
}
class Test3
{
    int var(int zm)
    {
        zm = zm +2;
        return zm;
    }
    void  chVar(Foo zm)
    {
        zm.y = zm.y + 40;
    }
}


class Foo {
    int y = 20;
}