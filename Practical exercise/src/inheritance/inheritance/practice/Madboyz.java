package inheritance.inheritance.practice;

public class Madboyz extends Monster {

    @Override
    public void attack()
    {
        super.attack();
        /*
         to do
         */
        System.out.println("Madboyz for the Waaagh");
    }
    String weaponType;
    public Madboyz()
    {
        System.out.println("Madboyz!");
    }
    public Madboyz(double movmentSpeed, double hitPoints, String weaponType)
    {
        super(movmentSpeed, hitPoints);
        this.weaponType = weaponType;
        System.out.println("RealMadboyz!");
    }
}
