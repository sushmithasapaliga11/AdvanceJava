package Collections;

import java.util.Map;
import java.util.TreeMap;

public class P8 {

	public static void main(String[] args) {
		TreeMap<String,String> Map = new TreeMap<>();
		Map.put("c1","Apple");
		Map.put("c2","Strawberry");
		Map.put("c3","Pear");
		Map.put("c4","Cucumber");
		Map.put("c5","Grapes");
		System.out.println(Map.firstEntry());
		System.out.println(Map.lastEntry());
		
//		System.out.println(Map.containsKey("c6"));
	}

}
