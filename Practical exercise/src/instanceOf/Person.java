package instanceOf;

abstract class Person {

    String name;
    String surname;

    Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    abstract void desc();
}

