public class BitOperators {
    public static void main(String[] args){
        /*
            & - bit product
            | - bit sum
            ^ - XOR
            x << 1 - move left 1
            x >> 2 - move right 2
            ~ - negation
         */
        System.out.println(14&11);
        /*
         1 1 1 0 = 14
         1 0 1 1 = 11
         -------
         1 0 1 0 = 10
        */
        System.out.println(14|11);
        /*
         1 1 1 0 = 14
         1 0 1 1 = 11
         -------
         1 1 1 1 = 15
        */
        System.out.println(14^11);
        /*
         1 1 1 0 = 14
         1 0 1 1 = 11
         -------
         0 1 0 1 = 5
        */

        System.out.println(10>>1);
        /*
        0000 1010 = 10
        0000 0101 = 5
        */
        System.out.println(10<<2);
         /*
        0 0 0 0 1 0 1 0 = 10
        0 0 1 0 1 0 0 0 = 40
        */
        System.out.println(~10);

    }
}
