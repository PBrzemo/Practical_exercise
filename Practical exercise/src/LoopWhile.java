public class LoopWhile {
    public static void main(String[] args){
        int [] tab = {1,2,3,4,5,6,7};

        int i = 0;
        while (i < tab.length) // .length when you add another variables to tab it shows in console
        {
            System.out.println(tab[i]);
            i++;
        }

        int [] tab2 = new int [10];
        //System.out.println(tab2);
        int x = 0;
        while(x < tab2.length)
        {
            tab2[x] = (x+1)*10;
            System.out.println(tab2[x]);
            x++;
        }
    }
}
