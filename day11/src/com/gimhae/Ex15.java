package com.gimhae;

import java.util.HashMap;
import java.util.Map;

public class Ex15 {

	public static void main(String[] args) {
		// Map map = new HashMap(); // �׳� map
		Map<String, String> map = new HashMap(); // ���׸� Map
		
		// map�� ���� ���� ���� key, value
		// key - set
		// value - list
		// map�� ��� �����ϴ��Ŀ� ���� ���� ���ΰ� �޶���
		
		map.put("key1", "val1");
		map.put("key2", "val2");
		map.put("key3", "val3");
		map.put(null, null);
		map.put("key2", "val3"); // key�� �ߺ��ȴٸ� ���� value�� �����.
		
		System.out.println(map.get("key1"));
		System.out.println(map.get("key2"));
		System.out.println(map.get("key3"));
		System.out.println(map.get(null));
		System.out.println(map.get("key4"));
	}

}
