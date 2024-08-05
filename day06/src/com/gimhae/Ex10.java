package com.gimhae;

public class Ex10 {

	public static void main(String[] args) {
		// 문자열
		String msg1 = "abcd";
		String msg2 = new String("abcd"); // new를 통해 새로운 객체를 찍어내고 있는 것임
		String msg3 = new String(new char[] {'a','b','c','d'});
		String msg4 = new String(new byte[] {97,98,99,100});
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println(msg3);
		System.out.println(msg4);
		
		String msg5 = "abcd";
		
		// 문자열 = 참조변수
		System.out.println(msg1 == msg5); // 같은 주소를 가르킴, msg1과 msg5는 "abcd" 하나의 객체를 가르킴
		System.out.println(msg1 == msg2);
		
		java.util.Scanner sc;
		
		sc = new java.util.Scanner(System.in);
		
		String msg6 = sc.nextLine(); // scanner는 입력받는 순간 새로운 객체로 찍어냄
		
		System.out.println(msg1==msg6);
	}

}
