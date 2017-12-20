package instanceOf;



public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Employee("P", "p", 10000);
        person[1] = new Student("o", "o");

//        person[0].desc();

//        for (int i = 0; i < person.length; i++)
//        {
//             if(person[i] instanceof Person)
//                person[i].desc();
//             else
//                break;
//        }

        for (Person p : person) {
            if (p instanceof Person)
                p.desc();
            else
                break;
        }
        for (Person p : person) {
            if (p instanceof Employee)
                ((Employee) p).work();
            else
                break;
        }

        for (Person p : person) {
            if (p instanceof Person) {
                p.desc();
            }
            else if (p instanceof Student) {
                Student tmp = (Student) p;
                tmp.study();
            }
            else if (p instanceof Employee) {
//              ((Employee) p).work(); it is the same
                Employee tmp = (Employee) p;
                tmp.work();
            }
        }
    }
}