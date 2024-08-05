package com.gimhae;

public class Ex11 {

	public static void main(String[] args) {
		
		// String 연산은 모든 것을 string으로 만든다.
		String msg1 = "ja";
		String msg2 = "va";
		System.out.println(msg1+msg2);
		System.out.println(msg1.concat(msg2));
		
		
		String msg3 = "java";
		
		String msg4 = new String("java");
		
		/*
		 * System.out.println(msg1.hashCode());
		 * System.out.println(msg2.hashCode());
		 * System.out.println((msg1+msg2).hashCode());
		 * String msg3 = "a";
		 * System.out.println(msg3+"b");  // msg3는 새로운 객체인 ab를 가리킨다.
		 * System.out.println(msg3.hashCode());
		 * System.out.println((msg3+"b".hashCode()));
		 */
		
		System.out.println(msg3 == msg4); // 레퍼런스 비교
		
		System.out.println(msg3.equals(msg4));  // 값 비교
		
		System.out.println(msg3.equals("javascripts"));
		
		char[] arr1 = msg3.toCharArray();
		
		byte[] arr2 = msg3.getBytes();
		
		System.out.println(arr1.length == arr2.length);
		
		String msg5 = "가";
		
		char[] arr3 = msg5.toCharArray();
		byte[] arr4 = msg5.getBytes();
		// byte : -128~127 : 256개
		System.out.println(arr4.length);
		
		System.out.println(arr3.length == arr4.length);
		

	}

}
