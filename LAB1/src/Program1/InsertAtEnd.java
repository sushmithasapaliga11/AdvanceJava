package Program1;

import java.util.LinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");

        colors.offerLast("Pink");
        System.out.println("Updated LinkedList: " + colors);
    }
}

