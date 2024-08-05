package com.gimhae;

// 오버라이드는 접근제한자가 보다 허용되는 방향으로는 가능
// default : default와 public 가능
// private : private만 가능

class Lec08{
	void func01() {
		System.out.println("부모기능1");
	}
	// 오버라이드 금지
	final void func02() {
		System.out.println("부모기능2");
	}
	private void func03() {
		
	}
	public void func04() {
		
	}
}

// final 클래스는 상속 불가능
// 상속 거부
final class Lec88 {
	
}
public class Ex08 extends Lec08{
	final static int su1 = 1111;
	final int su2 = 2222;
	final int su3;
	
	public Ex08() {
		su3 = 3333;
	}
	
	@Override
	void func01() {
		System.out.println("재정의된 기능1");
	}
	// @Override
	// 에러
	//final void func02() {
		//System.out.println("재정의된 기능2");
	//}
	
	//@Override
	//void func03() {
	//	System.out.println("재정의된 기능3");
	//}
	@Override
	public void func04() {
		System.out.println("재정의된 기능4");
	}

	public static void main(String[] args) {
		final int su; // 상수형 변수
		
		su = 1111;
		//su++;
		//su2++;
		
		Ex08 me = new Ex08();
		me.func01();
		me.func02();
		

	}

}
