package Collections;

import java.util.TreeMap;
import java.util.Map;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> treeMap = new TreeMap<>();
		treeMap.put(1,"Banana");
		treeMap.put(2,"Orange");
		treeMap.put(3,"Guava");
		treeMap.put(4,"Pomegranate");
		treeMap.put(5,"Amla");
		treeMap.clear();
		System.out.println(treeMap.isEmpty());
		treeMap.put(1,"Banana");
		treeMap.put(2,"Orange");
		treeMap.put(3,"Guava");
		treeMap.put(4,"Pomegranate");
		treeMap.put(5,"Amla");
		System.out.println(treeMap.size());

	}

}
