package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class P10 {

	public static void main(String[] args) {
		Map<String,Integer> lhashMap = new LinkedHashMap<>();
//		("Java", 1995);("Python", 1991);(“JavaScript", 1995);("C++", 1985);
		lhashMap.put("Java", 1995);
		lhashMap.put("Python", 1991);
		lhashMap.put("JavaScript", 1995);
		lhashMap.put("C++", 1985);
		for (Map.Entry<String,Integer> entry : lhashMap.entrySet()) {
			System.out.println(entry.getKey() + " was developed " + entry.getValue());
			}
	}

}
