public class ConditionalStatements {
    public static void main(String[] args){
        /*
          1.if else
            if (expression)
                instruction;
            else if(expression)
                instruction;
            else
                instruction;


           2.Switch
            switch(variable)
            {
                case x;
                    instruction;
                    (optional)break;
                case x;
                    instruction;
                    (optional)break;
                case x;
                    instruction;
                    (optional)break;
                default:
                    instruction;
                    (optional)break;
            }
         */


        int a = 2, b =3, c = 4;
        //example 1
        if( a < b )
            System.out.println("a < b");

        //example 2
        if( c < b )
            System.out.println("c < b");
        else
            System.out.println("c > b");

        //example 3
        if( a < c )
            System.out.println("a < c");
        else if (a > c)
            System.out.println("a > c");
        else
            System.out.println("a == c");

        //example 4
        if( a > c )
            System.out.println("a > c");
        else if (a < c) {
            System.out.println("a < c");
            System.out.println("it work's");
        }
        else
            System.out.println("a == c");


        //example 5
        switch(a)
        {
            case 1:
                System.out.println("a = 1");
                break;
            case 2:
                System.out.println("a = 2");
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
