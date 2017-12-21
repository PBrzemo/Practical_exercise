public class InnerClass {
    public static void main(String[] args)
    {
        A out = new A();
        A.B tmp = out.new B();
        A.C tmp2 = new A.C();

    }
}


class A
{
    A()
    {
        System.out.println("out class A");
    }
    class B
    {
        B()
        {
            System.out.println("in class B");
        }
        void smt()
        {
            test = 5;
        }
        private int tmp;
    }

    static class C
    {
        C()
        {
            System.out.println("in class C");
        }
    }
    void smt2()
    {
     //    tmp = 2;  NC
        B obj = new B();
        obj.tmp = 2;
    }
    private int test;
}