package com.gimhae;

import java.util.Iterator;

public class Ex09 {

	public static void main(String[] args) {
		// 순서가 없는 -> hashset 사용
		
		java.util.Set<String> set = new java.util.HashSet<>();
		set.add("첫번째");
		set.add("두번째");
		set.add("세번째");
		//set.add("네번째");
		set.add("두번째"); // 중복된 값은 맨 나중 하나를 제거
		
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			String msg = ite.next();
			System.out.println(msg);
		}
	}


}
