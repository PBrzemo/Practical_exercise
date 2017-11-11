public class Practice {
    public static void main(String[] args){
        int[] tab = {1, 2, 3, 4, 5, 6, 7};
        int suma = 0;

        for(int i = 0; i<tab.length; i++)
        {
            suma += tab[i];
        }
        System.out.println(suma);
        System.out.println();
        int suma2 = 0;
        for(int liczba: tab)
        {
            suma2 += liczba;
        }
        System.out.println(suma2);
    }
}
