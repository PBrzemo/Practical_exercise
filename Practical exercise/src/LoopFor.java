public class LoopFor {
    public static void main(String[] args){
        /*
            for(initialization ex. int i=0; condition ex. i>something; changes after the instruction ex. i++)
            {
                command
            }
         */
        int [] tab = {1,2,3,4,5,6,7};
        for (int i = 0; i < tab.length; i++) // .length when you add another variables to tab it shows in console
        {
            System.out.println(tab[i]);

        }
    }
}
