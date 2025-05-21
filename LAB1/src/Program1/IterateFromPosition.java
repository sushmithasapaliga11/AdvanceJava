package Program1;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterateFromPosition {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        ListIterator<String> iterator = colors.listIterator(1);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

