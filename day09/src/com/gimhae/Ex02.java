package com.gimhae;

public class Ex02 {

	public static void main(String[] args) {
		// 10진수 정수타입
		int su = 11111;
		Integer su2 = new Integer(22222); // 문자열을 숫자로 변환
		System.out.println(su2+1);
		Integer su3 = new Integer("-3333");
		System.out.println(su3);
		Integer su4 = 4444; // 오토박싱 - 객체화
		System.out.println(su+1);
		int su5 = new Integer(5555); // 언박싱
		System.out.println(su5+1);
		
		System.out.println(Integer.MIN_VALUE); // Integer 허용범위(최소)
		System.out.println(Integer.MAX_VALUE); // Integer 허용범위(최대)
		

	}

}
