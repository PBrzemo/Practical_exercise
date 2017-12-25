public class Exceptions {
/* construction of try catch for exception
        try
        {
            instruction
        }
        catch(name of exception or super class Exception variable)
        {
            instruction
        }
        there can be another catch
 */

    public static void main(String[] args) {
        int a = 10;
        try {
            if (a == 10)
                throw new OurException("a == 10 :)") ;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        try{
        System.out.println(5/0);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());//"don't division by 0
        }
        finally {
            System.out.println("instruction always be show");
        }
    }

}

class OurException extends Exception
{

    public OurException(String string)
    {
        super(string);
    }
}




