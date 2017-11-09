public class LoopDoWhile {
    public static void main(String[] args){
        /*
            do
            {
            will always do!
            }
            while();


         */
        int [] tab = {1,2,3,4,5,6,7};
        int i = 0;
        do
        {
            System.out.println(tab[i]);
            i++;
        }
        while (i < tab.length); // .length when you add another variables to tab it shows in console

    }
}
