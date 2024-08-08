package com.gimhae;

/*
 * 내부 클래스
 * 클래스 내부에 존재하는 클래스
 * 
 * 4가지 형식
 * 1. 스테틱 클래스(static inner class) static class
 * 2. 인스턴스 클래스(non-static inner class) instance class
 * 3. 지역 클래스 local class
 * 4. 익명 클래스 anonymous class
 */

public class Ex01 {
	
	// 1. static class
	static class Lec01{}
	
	// 2. instance class
	class Lec02{}
	
	// 3. local class
	public void func01() {
		class lec03{}
	}
	public static void main(String[] args) {
		

	}

}
