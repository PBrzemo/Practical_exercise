import java.util.Random;

public class Losowanie {

    public static void main(String[] args) {

        Random r = new Random();
        int[] x = new int[10];
        for (int i = 0;  i<10; i++) {
            x[i] = r.nextInt(100);
            System.out.println(x[i]);
        }
        System.out.println("");
    }
}
