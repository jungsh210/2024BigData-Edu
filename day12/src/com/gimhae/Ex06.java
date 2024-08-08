package com.gimhae;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex06 {

	public static void main(String[] args) {
		
		Comparator desc = new Comparator<Integer>() {  // ���׸�

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.intValue()-o1.intValue();
			}
			
		};
		
		Comparator asc = new Comparator<Integer>() {  // ���׸�

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.intValue()-o2.intValue();
			}
			
		};
		
		List<Integer> list = new ArrayList<Integer>();  // ���׸�
		
		list.add(2222);
		list.add(4444);
		list.add(1111);
		list.add(5555);
		list.add(3333);
		list.sort(asc);
		System.out.println(list);
		list.sort(desc);
		System.out.println(list);
		

	}

}
