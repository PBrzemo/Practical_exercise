import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection {

    public static void main(String[] args) {

        Collection a;
        ArrayList b;
        List<String> listWithNames = new LinkedList<>();
        listWithNames.add("Piotrek");
        listWithNames.add("Krzysiek");

        List<String> otherListWithNames = new LinkedList<>();
        otherListWithNames.add("Marek");
        otherListWithNames.addAll(listWithNames);
        otherListWithNames.add("Marek");

        System.out.println(otherListWithNames.contains("Marek"));
        System.out.println(otherListWithNames.get(0));
        System.out.println(otherListWithNames.isEmpty());
        System.out.println(otherListWithNames.indexOf("Marek"));
        System.out.println(otherListWithNames.lastIndexOf("Marek"));
    }
}
