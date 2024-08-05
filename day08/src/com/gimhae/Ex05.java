package com.gimhae;

// 인터페이스
/*
 * 인터페이스 특징
 * 1. 추상 메서드만 갖는다.
 * 2. 필드를 갖지 못한다.(객체를 생성 X) -> 상수 변수 선언(객체가 생성되지 않기 때문에), 구현 X
 * 3. 인터페이스 상속 : implements 사용
 * 4. 인터페이스를 어떻게 사용해라라는 것은 없음 -> 다중 상속이 안되는 것을 보안하기 위해 나옴
 */

interface Inter01{
	// int su1; // 에러
	// su = 11111; // 에러
	public static final int su = 1111;  // 이런 형태의 상수형 변수만 가능
	public static int su2 = 222;
	public int su3 = 3333;
	int su4 = 444;
	
	public abstract void func01();
	public  void func02(); // 추상 메서드만 갖기 때문에 abstract 생략 가능
	void func03();
}
public class Ex05 implements Inter01{

	public static void main(String[] args) {
		Ex05 me = new Ex05();
		Object me3 = new Ex05();
		Inter01 me2 = new Ex05();
		
		me2.func01();
		me2.func02();
		me2.func03();

	}
	
	@Override
	public void func01() {
		
	}
	
	@Override
	public void func02() {
		
	}
	
	@Override
	public void func03() {
		
	}

}
