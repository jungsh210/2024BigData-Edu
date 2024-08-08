package com.gimhae;

// 익명 클래스

class Anony{
	void func() {
		
	}
}

interface Inter{
	void func();
}

public class Ex05 {
	int su = 1111;
	
	// 익명 클래스
	
	static Inter local = new Inter() { // static
	
	// Inter local = new Inter() { // non-static
		int su2 = 2222;
		
		public void func() {
			System.out.println("실행");
//			System.out.println(this.su); // error
			System.out.println(this.su2);
		}
	};
	
	public static void main(String[] args) {
		
		// Inter Local이 non-static일 때
//		Ex05 me = new Ex05();
//		me.local.func();
		
		// Inter Local이 static일 때
		local.func();
		
		// 람다식
//		Inter local2 = () -> System.out.println("람다식");
//		local2.func();
	}

}
