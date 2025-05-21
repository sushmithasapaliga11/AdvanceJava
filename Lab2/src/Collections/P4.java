package Collections;
import java.util.*;
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map1 = new HashMap<>();
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		map1.put(4, "White");
		map1.put(5, "Blue");
		System.out.println(map1.isEmpty());
		map1.clear();
		System.out.println(map1.isEmpty());
	}

}
