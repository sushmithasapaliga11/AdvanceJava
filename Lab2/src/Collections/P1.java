package Collections;

import java.util.*;

public class P1 {

	public static void main(String[] args) {
		Map<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1,"Apple");
		hashMap.put(2,"Strawberry");
		hashMap.put(3,"Pear");
		hashMap.put(4,"Cucumber");
		hashMap.put(5,"Grapes");
		System.out.println("Initial HashMap: " + hashMap);
		for (Map.Entry<Integer,String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
			}
		System.out.println("\nIterating over keys:");
		for (Integer key : hashMap.keySet()) {
		System.out.println("Key: " + key);
		}
		System.out.println("\nIterating over values:");
		for (String value : hashMap.values()) {
		System.out.println("Value: " + value);
		}
		
		
	}

}
