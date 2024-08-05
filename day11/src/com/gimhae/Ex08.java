package com.gimhae;

/*
 * vector을 상속받는 스택 구현
 * vector에서는 값을 넣는 명령어가 addElement
 * stack에서는 push
 */

import java.util.Stack;

public class Ex08 {

	public static void main(String[] args) {
		// last-in-first-out(LIFO)
		Stack list = new Stack();
		
		list.push("첫번째"); // stack에 값을 넣을 때
		list.push("두번째");
		list.push("세번째");
		list.push("네번째");
		
//		System.out.println(list.peek()); 
//		System.out.println(list.pop());  // 꺼내는 것
//		System.out.println(list.peek());
//		System.out.println(list.pop());
//		System.out.println(list.peek());
//		System.out.println(list.pop());
//		System.out.println(list.peek());
//		System.out.println(list.pop());
//		System.out.println(list.empty());
		
		System.out.println(list.search("두번째")); // 두번째는 3번째로 stack을 나옴
		System.out.println("------------------");
		while(!list.empty()) {
			System.out.println(list.peek());
			list.pop();
		}
		
		

	}

}
