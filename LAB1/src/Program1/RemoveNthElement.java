package Program1;

import java.util.ArrayList;

public class RemoveNthElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        int n = 2; // Remove 3rd element (index = 2)
        if (n < colors.size()) {
            colors.remove(n);
        }

        System.out.println("Updated colors list: " + colors);
    }
}
