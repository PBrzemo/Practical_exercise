public class Projection {
    public static void main(String[] args){
        int a = 5, b =2;
        double c = 12, d =15;
        int s1 = a / (int)d; // loss of fraction
        double s2 = b / c;
        System.out.println("E1:" + a/ b);
        System.out.println("E2:" + a/ (double)b);
        System.out.println("E3:" + a/ c);
        System.out.println("E4:" + s1);
        System.out.println("E5:" + s2);
    }
}
