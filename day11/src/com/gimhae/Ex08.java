package com.gimhae;

/*
 * vector�� ��ӹ޴� ���� ����
 * vector������ ���� �ִ� ��ɾ addElement
 * stack������ push
 */

import java.util.Stack;

public class Ex08 {

	public static void main(String[] args) {
		// last-in-first-out(LIFO)
		Stack list = new Stack();
		
		list.push("ù��°"); // stack�� ���� ���� ��
		list.push("�ι�°");
		list.push("����°");
		list.push("�׹�°");
		
//		System.out.println(list.peek()); 
//		System.out.println(list.pop());  // ������ ��
//		System.out.println(list.peek());
//		System.out.println(list.pop());
//		System.out.println(list.peek());
//		System.out.println(list.pop());
//		System.out.println(list.peek());
//		System.out.println(list.pop());
//		System.out.println(list.empty());
		
		System.out.println(list.search("�ι�°")); // �ι�°�� 3��°�� stack�� ����
		System.out.println("------------------");
		while(!list.empty()) {
			System.out.println(list.peek());
			list.pop();
		}
		
		

	}

}
