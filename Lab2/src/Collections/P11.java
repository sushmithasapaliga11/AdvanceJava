package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> lhashMap = new LinkedHashMap<>();
//		("Java", 1995);("Python", 1991);(“JavaScript", 1995);("C++", 1985);
		lhashMap.put("Java", 1995);
		lhashMap.put("Python", 1991);
		lhashMap.put("JavaScript", 1995);
		lhashMap.put("C++", 1985);
		System.out.println(lhashMap);
	}

}
