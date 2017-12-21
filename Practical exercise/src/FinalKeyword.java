import java.util.Date;

public class FinalKeyword {
    public static void main(String[] args) {

        final double Pi;
        Pi = 3.14;
        System.out.println(Pi);

        Worker w = new Worker();
        System.out.println(w.workStart);



    }
}


 abstract class Person
 {

 }

 class Worker extends Person
 {
    Worker()
    {
        this.workStart = new Date();
    }
    Worker(Date data)
    {
        this.workStart = data;
    }
    final Date getWorkStart()
     {
         return this.workStart;
     }

    final Date workStart;
 }

 class Programer extends Worker
 {

 }
