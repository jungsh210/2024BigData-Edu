package com.gimhae;

/*
 * 다형성
 */

class Parent03{
	public void func01(){
		System.out.println("부모의 기능1");
	}
	public void func02() {
		System.out.println("부모의 기능2");
	}
}

class Child03 extends Parent03{
	public void func02() {
		System.out.println("자식이 재정의한 기능");
	}
	public void func03() {
		System.out.println("자식만의 기능");
	}
}
public class Ex03 {

	public static void main(String[] args) {
		Parent03 p1 = new Parent03();
		p1.func01();
		p1.func02();
		System.out.println("--------------------------");
		Child03 ch1 = new Child03();
		ch1.func01();
		ch1.func02();
		ch1.func03();
		System.out.println("--------------------------");
		
		// 다형성
		
		Parent03 p2; // 부모의 타입으로 p2 생성
		p2 = new Child03(); // 생성된 객체는 자식 클래스를 받음
		
		p2.func01();
		p2.func02(); // 부모의 타입으로 받았지만 Child 클래스에서 func02를 재정의했기 때문에 "자식이 재정의한 기능"이 출력
		// p2.func03(); // 부모에 정의되어 있지 않기 때문에 호출 불가능
	}

}
