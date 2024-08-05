package com.gimhae;

/*
 * 인터페이스 간 메서드 이름은 같아도 상관 없음
 */
interface Inter02{
	void func01(); // 오버라이딩 시행
}

interface Inter03{
	void func02(); // 오버라이딩 시행
}

// 인터페이스끼리 상속받을 때 : extends 사용
interface Inter04 extends Inter02{
	
}

// 인터페이스끼리 다중 상속 가능
interface Inter05 extends Inter02, Inter03{
	
}

interface Inter06{}

public class Ex06 implements Inter06{

	public static void main(String[] args) {
	}

}
