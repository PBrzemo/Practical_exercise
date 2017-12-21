package pInterface;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sort {

    public static void main(String[] args)
    {
        int[] tab = {5,10,-20};
        Arrays.sort(tab);
        for(int i = 0; i < tab.length; i++)
        {
            System.out.println(tab[i]);
        }
        System.out.println(".....................");
        Worker[] worker = new Worker[3];
        worker[0] = new Worker(1000);
        worker[1] = new Worker(5000);
        worker[2] = new Worker(100);
        for(Worker w : worker)
        {
            System.out.println(w.getPayment());
        }
        System.out.println(".....................");
        System.out.println(worker[0].compareTo(worker[1]));
        System.out.println(".....................");
        Arrays.sort(worker);
        for(Worker w: worker)
        {
            System.out.println(w.getPayment());
        }
        System.out.println(".....................");
        Arrays.sort(worker, Collections.reverseOrder());
        for(Worker w: worker)
        {
            System.out.println(w.getPayment());
        }
    }
}
