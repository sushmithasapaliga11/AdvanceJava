package Collections;

import java.util.Map;
import java.util.TreeMap;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> Map = new TreeMap<>();
		Map.put("c1","Red");
		Map.put("c2","Green");
		Map.put("c3","Black");
		Map.put("c4","White");
		System.out.println(Map.containsKey("c4"));
		System.out.println(Map.containsKey("c5"));
		

	}

}
