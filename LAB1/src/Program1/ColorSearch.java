package Program1;

import java.util.ArrayList;

public class ColorSearch {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        if (colors.contains("Red")) {
            System.out.println("Red is present in the list.");
        } else {
            System.out.println("Red is not present in the list.");
        }
    }
}
