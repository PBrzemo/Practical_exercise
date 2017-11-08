public class LogicalOperators {
    public static void main(String[] args){
        /*
            Logical Operators
            ! - negation
            !(true) - false
            !(false) - true

            && - and(conjunction) in the same time

            || - or(alternative)
         */
        int a = 5, b =5, c =7;

        if(a==b)
            System.out.println("work");
        if(a==b && c > 6)
            System.out.println("work");
        if(a==b || c > 7)
            System.out.println("work");
    }
}
