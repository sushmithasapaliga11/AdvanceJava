package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class P9 {

	public static void main(String[] args) {
		Map<Integer,String> lhashMap = new LinkedHashMap<>();
		lhashMap.put(1,"Apple");
		lhashMap.put(2,"Strawberry");
		lhashMap.put(3,"Pear");
		lhashMap.put(4,"Cucumber");
		lhashMap.put(5,"Grapes");
		System.out.println("Initial HashMap: " + lhashMap);
		for (Map.Entry<Integer,String> entry : lhashMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
			}
	}

}
