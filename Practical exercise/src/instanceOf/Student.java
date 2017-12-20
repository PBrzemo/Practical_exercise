package instanceOf;

public class Student extends Person {
    Student(String name, String surname) {
        super(name, surname);
    }

    @Override
    void desc(){
        System.out.println("Student");
        System.out.println("Name:"+ name);
        System.out.println("Surname :"+ surname);
    }
    void study()
    {
        System.out.println("study");
    }
}


