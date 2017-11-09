public class BreakContinue {
    public static void main(String[] args) {
            /*
            Continue - Skip the current iteration of a "for, while or do while" loops.
            Break - Stop the current iteration of a "for, while or do while" loops.
             */

        //ex continue
        for (int i = 10; i < 20; i++)
        {
            if(i == 13)
                continue; // iteration with 13 is skipped
            System.out.println(i);
        }
        System.out.println();

        //ex break
        for (int i = 0; i < 20; i++)
        {
            if(i == 3)
                break; // iteration with 3 is stopped
            System.out.println(i);
        }
        System.out.println();

        //ex loop in loop continues
        for (int j = 1; j<10; j++)
        {
            for(int i = 1; i<10; i++)
            {
                if (i == 3)
                    continue;
                System.out.print(i*j+ " ");
            }
            System.out.println();
        }
        System.out.println();

        //ex loop in loop break
        for (int j = 1; j<10; j++)
        {
            for(int i = 1; i<10; i++)
            {
                if (i == 4)
                    break;
                System.out.print(i*j+ " ");
            }
            System.out.println();
        }
        System.out.println();

        //ex continue for odd numbers
        for (int i = 0; i < 10; i++)
        {
            if(i % 2 == 0)
                continue;
            System.out.println(i);
        }
        System.out.println();

        //ex continue for even numbers
        for (int i = 0; i < 10; i++)
        {
            if(i % 2 != 0)
                continue;
            System.out.println(i);
        }
        System.out.println();

//loop in loop testing something
//        for (int j = 1; j<10; j++)
//        {
//            for(int i = 1; i<10; i++)
//            {
//                if (i % 2 ==0)
//                System.out.print(i*j+ " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
    }
}
