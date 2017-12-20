package inheritance;

import inheritance.inheritance.practice.Monster;
import inheritance.inheritance.practice.Doks;
import inheritance.inheritance.practice.Madboyz;


public class Inheritance {

    public static void main(String[] args){
//        Monster m = new Madboyz(10, 100, "");
//        m.attack();
//        Monster m = new Monster(10, 100);
//        System.out.println(m.getMovmentSpeed());
        Madboyz madboyz = new Madboyz(20, 50, "boltThrower");
        madboyz.attack();
        System.out.println(madboyz.getMovmentSpeed());
        Doks doks = new Doks();



    }
}
