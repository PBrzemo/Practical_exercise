package inheritance.inheritance.practice;

public abstract class Monster {
    protected double movmentSpeed;
    protected double hitPoints;

    protected void attack()
    {
        /*
         to do
         */
        System.out.println("preparing the Boyz for the Waaagh");
    }
    abstract protected void desc();

    public Monster()
    {
        System.out.println("Default Monster!");
    }

    public Monster(double movmentSpeed, double hitPoints)
    {
        this.movmentSpeed = movmentSpeed;
        this.hitPoints = hitPoints;
        System.out.println("Non Defaul Monster!");
    }

    public double getMovmentSpeed() {
        return movmentSpeed;
    }

    public double getHitPoints() {
        return hitPoints;
    }

    public void setMovmentSpeed(double movmentSpeed) {
        this.movmentSpeed = movmentSpeed;
    }

    public void setHitPoints(double hitPoints) {
        this.hitPoints = hitPoints;
    }
}
