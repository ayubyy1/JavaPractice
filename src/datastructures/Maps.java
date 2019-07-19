package datastructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// Maps are key value pairs
		// Implement map interfaces
		Map<Integer, String> hMap = new TreeMap<Integer, String>();
		mapUtil(hMap);
	}
	
	public static void mapUtil(Map<Integer, String> map) {
		// 1. Add Key value pairs
		map.put(101,"Yaseen");
		map.put(502, "Naseema");
		map.put(245, "Mohsin");
		map.put(867, "Mom");
		map.put(786, "Mustakeem");
		
		// 2. Access Elements
		System.out.println("See all the keys: " + map.keySet());
		System.out.println("See all the key-value pairs: " + map);
		
		// 3. Iterate through a map of key-value pairs?
		for(int key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
		
	}

}
