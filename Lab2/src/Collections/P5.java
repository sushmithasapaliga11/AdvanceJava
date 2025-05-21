package Collections;

import java.util.Map;
import java.util.TreeMap;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> Map = new TreeMap<>();
		Map.put(1,"Apple");
		Map.put(2,"Strawberry");
		Map.put(3,"Pear");
		Map.put(4,"Cucumber");
		Map.put(5,"Grapes");
		for (Map.Entry<Integer,String> entry : Map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
			}
	}

}