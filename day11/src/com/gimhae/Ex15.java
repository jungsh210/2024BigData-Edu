package com.gimhae;

import java.util.HashMap;
import java.util.Map;

public class Ex15 {

	public static void main(String[] args) {
		// Map map = new HashMap(); // 그냥 map
		Map<String, String> map = new HashMap(); // 제네릭 Map
		
		// map에 값을 넣을 때는 key, value
		// key - set
		// value - list
		// map을 어떻게 구현하느냐에 따라서 수정 여부가 달라짐
		
		map.put("key1", "val1");
		map.put("key2", "val2");
		map.put("key3", "val3");
		map.put(null, null);
		map.put("key2", "val3"); // key가 중복된다면 나중 value로 덮어쓴다.
		
		System.out.println(map.get("key1"));
		System.out.println(map.get("key2"));
		System.out.println(map.get("key3"));
		System.out.println(map.get(null));
		System.out.println(map.get("key4"));
	}

}
