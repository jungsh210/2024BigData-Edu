package com.gimhae;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex11 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("ù��°");
		set.add("�ι�°");
		set.add("����°");
		set.add("�׹�°");
		
		List<String> list = new ArrayList<>(set);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		

	}

}
