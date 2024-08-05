package com.gimhae;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		// 제네릭 -> 캐스팅이 필요없음
		// 1.5~
		// 문법적으로 자료형을 제약
		// 개념적으로 확장
		
//		ArrayList list1 = new ArrayList();
//		
//		System.out.println(list1.get(0));
//		String msg1 = (String) list1.get(0);
//		System.out.println(msg1);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("문자열");
		System.out.println(list2.get(0));
		String msg2 = list2.get(0);
		System.out.println(msg2);
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(1234);
		System.out.println(list3.get(0));
		int su = list3.get(0);
		System.out.println(su);
		

	}

}
