package com.gimhae;

/*
 * 상속
 * 부모의 기능을 물려받는 것
 * 단일 상속(다중상속을 지원하지 않음)
 * class 클래스명 extends 상속받을 클래스명(부모 클래스) {}
 * 모든 클래스는 상속으로 이루어짐
 * extends 부모가 코드명세가 없을 시 java.lang.Object
 * 부모 -> 자식으로 상속
 * 상속을 하는 이유 : 중복된 코드를 재사용하기 위해(반복을 최소한 하기 위해)
 */

class Parent{
	public int money = 1000;
	public void how() {
		System.out.println(money+"원 있음");
	}
}

// class child{} // 빈 자식 클래스

class Child extends Parent{ // 부모 클래스를 상속받은 자식 클래스
	public int money = 100;
	public void func01() {
		System.out.println("자식만의 기능");
	}
	// 오버로드(생성자. 메서드) 오버라이드(메서드)의 차이는 무엇인가?
	// 오버로드 : 이름의 중복(원칙적 불가, 일부 허용, 파라미터, 유무, 갯수, 타입, 순서)
	// 메서드 오버라이드(오직 메서드에서만 가능)
	// 상속에서 부모로부터 물려받은 기능(메서드)을 재정의 해서 사용
	// 오버로드 가능 기준 : 매개변수
	
	@Override // 어노테이션, 아무 기능 없지만, 오버라이드를 적용할 때 잘못된 부분이 없는지를 알려줌, 확실한 오버라이드를 할 수 있음
	public void how() {  // 부모 메서드의 변수 타입, 변수명을 그대로 들고 와서 재정의
		System.out.println("돈없음");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		Child me1 = new Child(); 
		me1.how();  // 부모 클래스를 상속받지 않은 자식 클래스에서는 how가 없기 때문에 실행 x, 오버라이딩하면 오버라이딩 한 부분이 출력
		
		Parent me2 = new Parent();
		me2.how();
		// me2.func02();  // 부모는 자식의 메소드를 받을 수 없음
		
		Ex01 me = new Ex01();
		System.out.println(me);
		System.out.println(me.toString());  // 밑에 toString이라는 메서드를 오버라이드했기 때문에 "내가 재정의"라는 문구 출력
	}
	
	@Override
	public String toString() {
		return "내가 재정의";
	}
}
