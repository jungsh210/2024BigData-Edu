package com.gimhae;

/*
 * 추상 클래스
 * 추상 메서드를 0개 이상 갖는 클래스를 의미
 * 혼자서 객체 생성 불가능
 * 
 */

// 상속

// 추상 클래스
abstract class Parent{
	void func01() {
		System.out.println("부모의 기능");
	}
	// 추상 메서드 - 메서드의 선언만, 구현은 없음
	public abstract void func02();
}

// 추상 클래스를 상속받는 자식 클래스도 
// 1. 부모 클래스와 같이 abstract class로 작성 2. 부모 클래스와 같은 메서드 구현
// 2가지 방법 중 선택

class Child extends Parent{
	@Override
	public void func02() {  // 부모 클래스와 같은 메서드 구현
		System.out.println("자식이 오버라이드한 기능");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.func01();
		c1.func02();
		
		// Parent p = new Parent(); // 추상 클래스는 객체 생성이 불가
		
		Parent p = new Child();
		
		p.func01();
		p.func02(); // Parent에서 func02가 선언만 되어 있기 때문에 Child의 func02에 접근 가능

	}

}
