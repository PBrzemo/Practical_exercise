public class Arithmetic_operators {
    public static void main(String args[]){
         /*
           Arithmetic Operators
               +   addition
               -   subtraction
               *   multiplication
               /   division

               =    assignment of values
               +=   add variables
               -=   subtract variables
               /=   divide variables
               *=   multiplied variables
               %=

               %   rest of the division (modulo)

               ++   increment - add 1 to variables
               --   decrement - subtract 1 from variables

               y++ - POST increment
               y-- - POST decrement

               ++y - PRE increment
               --y - PRE decrement
         */

        int a = 5;
        System.out.println(a+2);
        System.out.println(a-2);
        System.out.println(a*2);
        System.out.println((double)a/2);


        int b = 7;
        b -=2;
        //b +=3;
        //b /=2;
        //b *=3;
        System.out.println(b);

        int c = 1;
        ++c;
        System.out.println(c);
        --c;
        System.out.println(c);
        c--;// should be 0
        System.out.println(c);
        System.out.println(c--);//should be 0
        System.out.println(c);//should be -1
        c++;
        System.out.println(c);
        System.out.println(c++);
        System.out.println(c);

    }
}


