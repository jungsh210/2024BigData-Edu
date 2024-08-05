package com.gimhae;

/*
 * 래퍼클래스
 * 박싱 & 언박싱이 필요에 따라 이루어짐
 * 기본 자료형도 부모타입으로 캐스팅 가능
 * 자료형의 특성과 기능 표현
 */
public class Ex01 {

	public static void main(String[] args) {
		func01(3); // 밑에 선언된 변수의 자료형은 double 형이지만 자동 형변환으로 정수가 됨
		func01(new Double(3.14));  // Object로 선언되면 아무 자료형 선언가능

	}
	public static void func01(Object obj) {
		
	}

}
