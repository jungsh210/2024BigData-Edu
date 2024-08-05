package com.gimhae;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class Ex10 {

	public static void main(String[] args) {
		// 순서가 없는 -> hashset
		
			List<Integer> list = new ArrayList<>();
			list.add(1111);
			list.add(2222);
			list.add(3333);
			list.add(1111);
			System.out.println(list);
			
			Set<Integer> set = new HashSet<>();
			set.add(1111);
			set.add(2222);
			set.add(3333);
			set.add(4444);
			System.out.println(set);

	}

}
