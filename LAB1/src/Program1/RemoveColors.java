package Program1;

import java.util.ArrayList;

public class RemoveColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        // Removing by index (2nd element, index = 1)
        colors.remove(1);

        // Removing by object
        colors.remove("Blue");

        System.out.println("Updated list: " + colors);
    }
}
