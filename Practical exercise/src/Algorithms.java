import java.util.Scanner;

public class Algorithms {


        private static int a[];

        public static void main(String[] args) {
            int l, p, s,  x;

//take data from user
            System.out.println("Podaj liczbe elementow tablicy");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            a = new int[n];
            for (int i=0; i<n; i++) {
                System.out.println("Podaj element a[" + i +"]");
                sc = new Scanner(System.in);
                a[i]= sc.nextInt();
            }
            System.out.println("Podaj element do wyszukania");
            sc = new Scanner(System.in);
            x = sc.nextInt();

            //find x
            l = 0;
            p = n - 1;
            while (l <= p)
            {
                s = (l + p) / 2;
                if (a[s] == x)
                {
                    System.out.println("Odnaleziono element "+x+" pod indeksem "+s); //result
                    return;
                }
                if (a[s] < x)
                    l = s + 1;
                else
                    p = s - 1;
            }

            System.out.println("Nie odnaleziono w tablicy elementu " + x);//result
        }

    }