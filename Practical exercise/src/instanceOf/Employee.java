package instanceOf;

public class Employee extends Person{
    double salary;
    Employee(String name, String surname, double salary){
        super(name, surname);
        this.salary = salary;
    }
    @Override
    void desc(){
        System.out.println("Worker");
        System.out.println("Name:"+ name);
        System.out.println("Surname :"+ surname);
        System.out.println("Salary :" + salary);
    }
    void work()
    {
        System.out.println("work");
    }
}
