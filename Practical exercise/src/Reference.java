public class Reference {

    public static void main(String[] args){

        int a =53;
        int b= a;
        b=30;
        System.out.println(a);

        Test2 x = new Test2(); // x - in this variable we have address not a value
        Test2 y = x;
        y.a = 40;

        System.out.println(x.a);
    }
}

class Test2
{
    int a = 10;
}