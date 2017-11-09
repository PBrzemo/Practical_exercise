public class Table {
    public static void main(String[] args){
        /*
            type[] name; - declaration
            name = new type[x];
         */

        int[] tab;
        tab = new int[5];
        /*
        int[] tab = new int[5];
         */
        tab[0] = 20;
        System.out.println(tab[0]);

        int [] tab2 = {1, 2, 3, 4, 52323};
        System.out.println(tab2[3]);
        System.out.println("tabel lenght"+" "+tab2.length);
        System.out.println(tab2[tab2.length-1]);
    }
}
