package com.gimhae;

// static inner class

class Outter02{
	static int su1 = 1111; // static 변수
	int su2 = 2222; // non-static 변수
	
	// 생성자
	public Outter02() {
		
	}
	
	// static 메소드
	static void func01() {
		System.out.println(Inner02.su3);
		Inner02.func03();
		////////////////////
		Inner02 inner = new Inner02();
		System.out.println(inner.su4);
		inner.func04();
		
	}
	
	// non-static 메소드
	void func02() {
//		System.out.println(Inner02.su3);  // 내부 클래스의 변수 호출
//		Inner02.func03();
//		////////////////////
//		Inner02 inner = new Inner02();
//		System.out.println(inner.su4);
//		inner.func04();
	}
	
	// static inner class
	static class Inner02{  // Outter02의 요소
		static int su3 = 3333;
		int su4 = 4444;
		
		public Inner02() {
			
		}
		
		static void func03() {
			System.out.println(su3); // 같은 클래스 안 변수 호출
			
			//System.out.println(Outter02.su1); // 원칙적
			System.out.println(su1);
			
			// Outter02.func01(); // 원칙적
			func01(); // Outter02의 요소이기 때문에 static 메소드인 func01는 func01만 적어도 호출이 가능
			
			Outter02 outt = new Outter02();
			System.out.println(outt.su2);
			outt.func02();
			
		}
		void func04() {
			System.out.println(su3);
			System.out.println(su1);
			
			func01();
			
			Outter02 outt = new Outter02();
			System.out.println(outt.su2);
			outt.func02();
			
		}
	}
}
public class Ex02 {

	public static void main(String[] args) {
		System.out.println(Outter02.su1);
		Outter02 outt = new Outter02();
		System.out.println(outt.su2);
		
		// entry - 내부 클래스 사용하는 예
		// java.util.Map.Entry entry; // Map 클래스 안에 존재하는 Entry 클래스
		
		System.out.println(Outter02.Inner02.su3); // 제일 밖 클래스.내부 클래스.변수명
		
		// non/static 변수, 메소드에 접근 -> 먼저 객체를 만든 후 변수, 메소드에 접근 가능
		Outter02.Inner02 inn = new Outter02.Inner02();
		System.out.println(inn.su4);
	}

}
