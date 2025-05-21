package Collections;


import java.util.LinkedHashMap;
import java.util.Map;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> l = new LinkedHashMap<>();
		String[] keys = {"C", "A", "B", "E", "D"};
		Integer[] values = {3, 1, 2, 5, 4};
		for(int i=0;i<keys.length;i++) {
			l.put(keys[i], values[i]);
		}
		System.out.println(l);
	}

}
