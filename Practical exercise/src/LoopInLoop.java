public class LoopInLoop {
    static public void main(String[] args){
        /*
            loop in loop example on multiplication table 10x10
         */
        for (int j = 1; j<10; j++)
        {
            for(int i = 1; i<10; i++)
            {
                System.out.print(i*j+ " ");
            }
            System.out.println();
        }
    }
}
