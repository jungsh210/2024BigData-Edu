package com.gimhae;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		// ���׸� -> ĳ������ �ʿ����
		// 1.5~
		// ���������� �ڷ����� ����
		// ���������� Ȯ��
		
//		ArrayList list1 = new ArrayList();
//		
//		System.out.println(list1.get(0));
//		String msg1 = (String) list1.get(0);
//		System.out.println(msg1);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("���ڿ�");
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
