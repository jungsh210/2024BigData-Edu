package com.gimhae;

import java.util.ArrayList;
import java.util.List;

public class Ex06 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("1111");
		list1.add("2222");
		list1.add("3333");
		for(int i=0; i<list1.size(); i++) {
			String msg = list1.get(i);
			System.out.println(msg);
		}
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1111);
		list2.add(2222);
		list2.add(3333);
		for(int i=0; i<list2.size(); i++) {
			int msg1 = list2.get(i);
			System.out.println(msg1);

	}
}
}

