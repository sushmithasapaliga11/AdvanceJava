package Program1;

import java.util.ArrayList;
import java.util.List;

public class ExtractColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        List<String> subList = colors.subList(0, 2);
        System.out.println("Extracted colors: " + subList);
    }
}
