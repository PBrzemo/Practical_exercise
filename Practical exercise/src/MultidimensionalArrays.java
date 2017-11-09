public class MultidimensionalArrays {
    public static void main(String[] args) {
     /*
        type[][] name; declaration 2 dimension array
        name = new type [x];
        type[][][] name; declaration 3 dimension array
        name = new type [x];
      */

     int[][] tab = new int[4][4];
     tab[0][0] = 25;
     tab[3][3] = 70;
     System.out.println(tab[0][0]);
     System.out.println(tab[3][3]);

     int[][] tab2 =
             {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11,12}
             };
     System.out.println(tab2[1][1]);
    }
}
