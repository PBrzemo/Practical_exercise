public class ClassAnonymous {

    public static void main(String[] args)
    {
//        PressButton z = new PressButton()
//        {
//            @Override
//            public void action()
//            {
//                System.out.println("anonymous class");
//            }
//        };


        Button p = new Button();

        p.addAction(new PressButton()
        {
            @Override
            public void action()
            {
                System.out.println("anonymous class");
            }
        });
    }
}


interface PressButton
{
    void action();
}

class Button{

    void  addAction(PressButton z)
    {
        z.action();
    }
}